package gr.aueb.cf.cf9.ch7;



public class StrEtc {

    public static void main(String[] args) {

        //traverse as array

        String s1 = "Coding Factory";

        for (char ch : s1.toCharArray()) {
            System.out.print(ch + "");
        }
        System.out.println("\u2764");


        //replace
        String firstname = " Maria-Eleni";
        String simpleName = firstname.replace("-", " ");

        // concat
        String lastname = "Smith";
        String fullName1 = firstname + " " + lastname;
        String fullName2 = firstname.concat(" ").concat(lastname);


    }
}
