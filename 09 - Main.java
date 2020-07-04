
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        
        // "add" to add word and its translation
        // "end" to end the program
        // "search" to search for a word
    }
}
