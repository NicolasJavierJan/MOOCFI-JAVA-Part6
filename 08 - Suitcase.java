/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> item;
    private int maxWeight;
    
    public Suitcase(int weight){
        this.item = new ArrayList<>();
        this.maxWeight = weight;
    }
    
    public void addItem(Item item){
        if ((this.totalWeight() + item.getWeight()) <= this.maxWeight){
            this.item.add(item);
        }
        
    }
    
    public String toString(){       
        if (item.size() == 0){
            return "no items (0 kg)";
        }
        
        if (item.size() == 1){
            return "1 item (" + item.get(0).getWeight() + " kg)";
        }
        
        return item.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public void printItems(){
        for (Item items : this.item){
            System.out.println(items.toString());
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for (Item items : this.item){
            total = total + items.getWeight();
        }
        
        return total;
    }
    
    public Item heaviestItem(){
        if (this.item.isEmpty()){
            return null;
        }
        
        Item heaviest = this.item.get(0);
        
        for (Item items : this.item){
            if (items.getWeight() > heaviest.getWeight()){
                heaviest = items;
            }
        }
        
        return heaviest;
        
    }
}
