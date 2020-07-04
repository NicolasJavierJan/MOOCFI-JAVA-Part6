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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int weight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.weight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if ((suitcase.totalWeight() + this.weight) <= this.maxWeight){
            suitcases.add(suitcase);
            this.weight = this.weight + suitcase.totalWeight();
        }
    }
    
    public String toString(){
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases){
            totalWeight = totalWeight + suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems(){
        for (Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
}
