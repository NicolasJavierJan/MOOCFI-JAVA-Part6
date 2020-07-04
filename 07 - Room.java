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

public class Room {
    private ArrayList<Person> people;
    
    public Room(){
        this.people = new ArrayList<>();
    }
    
    public void add(Person person){
        this.people.add(person);
    }
    
    public boolean isEmpty(){
        if (this.people.size() == 0){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return this.people;
    }
    
    public Person shortest(){
        if (this.isEmpty()){
            return null;
        }
        
        Person shortest = this.people.get(0);
        
        for (Person person : this.people){
            if (person.getHeight() < shortest.getHeight()){
                shortest = person;
            }
        }
        
        return shortest;
        
    }
    
    public Person take(){
        if (this.people.isEmpty()){
            return null;
        }
        Person shortest = this.shortest();
        this.people.remove(this.shortest());
        return shortest;
    }
}
