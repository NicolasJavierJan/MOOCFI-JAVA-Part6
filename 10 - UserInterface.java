/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nico
 */

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
        
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                this.add();
            }
            
            if (command.equals("list")){
                this.list();
            }
            
            if (command.equals("remove")){
                this.remove();
            }
        }     
    }
    
    public void add(){
        System.out.print("To add: ");
        String task = this.scanner.nextLine();
        
        this.todoList.add(task);
    }
    
    public void list(){
        this.todoList.print();
    }
    
    public void remove(){
        System.out.print("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(index);
    }
    
}
