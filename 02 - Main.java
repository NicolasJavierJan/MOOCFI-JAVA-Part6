
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
        Stack t = new Stack();
        t.add("1");
        t.add("2");
        t.add("3");
        t.add("4");
        t.add("5");

        while (!t.isEmpty()) {
            System.out.println(t.take());
        }
    }
}
