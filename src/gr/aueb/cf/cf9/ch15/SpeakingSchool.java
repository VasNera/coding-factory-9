package gr.aueb.cf.cf9.ch15;

public class SpeakingSchool {

   //tightly coupled
    private final Cat cat = new Cat();                     //composition, private instance άλλης κλάσης.


    public SpeakingSchool(){

    }

    public void learnToSpeak(){
        cat.speak();
    }
}
