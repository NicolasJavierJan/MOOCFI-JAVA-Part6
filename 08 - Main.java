
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        
        // testing item class:
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        
        // testing suitcase class:
        
        Item brick = new Item("brick", 4);
        
        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addItem(book);
        suitcase2.addItem(phone);
        suitcase2.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase2.printItems();
        System.out.println("Total weight: " + suitcase2.totalWeight() + " kg");
        
        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        
        //testing hold class:
        
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }

}
