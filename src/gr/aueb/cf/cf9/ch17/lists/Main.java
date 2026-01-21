package gr.aueb.cf.cf9.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();


        //add
        cities.add("Athens");        // index 0
        cities.add("Paris");         // index 1
        cities.add("Berlin");        // index 2

        //get

        String myCity = cities.get(0);             // athens
        System.out.println(myCity);                //athens


        //set - update

        int position = cities.indexOf("Paris");       //equals
        if (position == -1){
            System.out.println("City not found");
        }else {
            cities.set(position, "Tokyo");
        }

        //Remove
        if (cities.contains("Tokyo")){
            cities.remove("Tokyo");              //override equals
        }else {
            System.out.println("City not found");
        }

        //traverse with for
        for (int i = 0;i < cities.size(); i++){
            System.out.println(cities.get(i));
        }

        // traverse with enhanced for
        for (String city: cities){
            System.out.println(city);
        }

        // Iterator
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            System.out.println(city);
        }
        Iterator<String> it = cities.iterator();
        while (it.hasNext()){
            if (it.next().equals("Tokyo")){
                it.remove();
            }
        }

        //functional
        cities.removeIf(c->c.equals("Tokyo"));
//        cities.forEach(c-> System.out.println(c));
        cities.forEach(System.out::println);

    }

}
