
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        if (this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String printOut = "The collection " + this.name + " has " + this.elements.size();
        String collection = "";
        
        
        for (String element : this.elements){
            int i = 0;
            if (i < this.elements.size() - 1){
                collection = collection + element + "\n";
            } else {
                collection = collection + element;
            }
            i++;            
        }
        
        
        if (this.elements.size() == 1){
            return printOut + " element:\n" + collection;
        }
        
        return printOut + " elements:\n" + collection;
        
    }
    
}
