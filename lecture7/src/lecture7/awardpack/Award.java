package lecture7.awardpack;

import lecture7.nominatorpack.*;
import lecture7.nomineepack.*;

public class Award {

    private int value;

    public Award() {
    }

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