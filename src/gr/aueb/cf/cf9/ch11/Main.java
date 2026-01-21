package gr.aueb.cf.cf9.ch11;

public class Main {
    public static void main(String[] args) {
        int price;

        Customer Manolis34 = new Customer(4, "Manolis" , "Karamanolis" , " 456788" , "6749372615",
                "Attica", " K" , " L" , "25" , "89 ", "98");

        Product milk = new Product(1 , "Milk", "Light Milk", 3 , 2 , true);

        User user = new User();
        User andreas22 = new User(2, "Andreas", "Alexopoulos", "Alexo" , "12345" , true);

        System.out.println(andreas22.getUsername());
        System.out.println(andreas22.isActive());

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4 , "Makis", " Kapetis");
        student2.setFirstName("Chrysostomos");
        Student student3 = new Student(5 , "Lambros", "Ioannou");



//        alice.id = 1;
//        bob.id = 2;
//        student.firstName = "George";

        alice.setId(1);                           //setter
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        bob.setId(2);
        bob.setFirstName("Bob");
        bob.setLastName("Dylan");

        student.setId(3);
        student.setFirstName("Anna");
        student.setLastName("Karenina");

        System.out.println(alice.getId());
        System.out.println(alice.getFirstName());
        System.out.println(alice.getLastName());            //getter

        System.out.printf("id: %d , firstname: %s , lastname: %s" , alice.getId() ,
                alice.getFirstName(), alice.getLastName());

        System.out.println(Student.getStudentsCount());           // Οι static μέθοδοι ανήκουν στην κλάση.
                                                                    // γι αυτό τις καλούμε έτσι.Με το όνομα της κλάσης πρώτα


    }


}
