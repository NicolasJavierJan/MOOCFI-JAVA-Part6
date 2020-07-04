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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while (true){
        
            System.out.print("Command: ");
            String command = this.scanner.nextLine();
        
            if (command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if (command.equals("add")){
                this.add();
                continue;
            }
            
            if (command.equals("search")){
                this.search();
                continue;
            }
            
            System.out.println("Unknown command");
        }
    }
    
    public void add(){
        System.out.print("Word: ");
        String word = this.scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void search(){
        System.out.print("To be translated: ");
        String translation = scanner.nextLine();
        if (this.dictionary.translate(translation) == null){
                    System.out.println("Word " + translation + " was not found");
        } else {
            System.out.println("Translation: " + this.dictionary.translate(translation));
        }                       
    }
}
