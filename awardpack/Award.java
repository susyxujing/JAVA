package awardpack;

public class Award {

    private int value;

    public Award()
    {
    }

    public Award(final Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setField (Integer field){
        this.value = field;
    }
}

