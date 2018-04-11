package lecture4.awardpack;

import lecture4.nominatorpack.*;
import lecture4.nomineepack.*;

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