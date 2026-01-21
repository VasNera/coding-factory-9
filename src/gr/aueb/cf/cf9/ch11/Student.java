package gr.aueb.cf.cf9.ch11;

/**
 * java Bean.
 * java class που έχει data πεδία, τουλάχιστον έναν default constructor και getters
 * setters με συμβάσεις.
 */

public class Student {

    private static int studentsCount = 0;

//    static {
//        studentsCount = 0;                            //μπορούμε να αρχικοποιήσουμε και έτσι. Λέγεται static block.
//    }

    private int id;
    private String firstName;
    private String lastName;

    //default constructor
    public Student() {
        studentsCount++;


    }
            //overloading constructor
    public Student(int id , String firstName , String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentsCount++;
    }

    //Public Getters and Setters

    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;


    }

        public String getFirstName() {
            return firstName;

    }

        public void setFirstName(String firstName) {
            this.firstName = firstName;

    }

        public String getLastName() {

        return lastName;
    }

        public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public static int getStudentsCount(){

        return studentsCount;
    }
}



