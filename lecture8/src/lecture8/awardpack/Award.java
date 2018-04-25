package lecture8.awardpack;

import lecture8.Person;
import lecture8.nominatorpack.*;
import lecture8.nomineepack.*;

public class Award {

    private int value;

    public Award() { }

    public Award(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}