package gr.aueb.cf.cf9.ch17;

import java.util.List;

/**
 * Στη θέση του object μπορούμε να έχουμε οποιονδήποτε τύπο δεδομένων(string, int, char...)
 * γιατί το object είναι υπερκλάση της java, και όλοι οι τύποι is an object.
 */
public class FlexibleNode {
    private Object value;

    public FlexibleNode(){

    }


    public FlexibleNode(Object value){
        this.value = value;

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

        }
