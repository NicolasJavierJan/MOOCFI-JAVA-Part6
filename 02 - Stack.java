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

public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.stack.size() == 0){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        int size = (this.stack.size()) - 1;
        String item = this.stack.get(size);
        this.stack.remove(size);
        return item;
    }
    
}
