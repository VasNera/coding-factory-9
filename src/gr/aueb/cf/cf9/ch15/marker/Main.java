package gr.aueb.cf.cf9.ch15.marker;

public class Main {
    public static void main(String[] args) {
        Item book = new Book(1, "Book A");
        Item cd = new CompactDisk(2, "Cd A");
        Product product = new Product();

        deliver(book);
        deliver(cd);
    }

    public static void deliver(Item item){
        if (item instanceof Book){
            System.out.println("Delivering book...");
        }else  if (item instanceof CompactDisk){
            System.out.println("Delivering cd...");
        }else {
            throw new AssertionError(" Unknown item type");
        }
    }
}
