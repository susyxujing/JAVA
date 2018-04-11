package lecture4.nominatorpack;

import lecture4.awardpack.*;
import lecture4.nomineepack.*;


public class Nominator {
    private String name;
    private int nominatorAwardQuantityLimit = 5;
    private float nominatorAwardAmountLimit = 500;

    public Nominator()
    {

    }

    public Nominator (String name, int nominatorAwardQuantityLimit,float nominatorAwardAmountLimit ) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }


    public String getName() {
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public int getNominatorAwardQuantityLimit() {
        return nominatorAwardQuantityLimit;
    }

    public void setNominatorAwardQuantityLimit(int nominatorAwardQuantityLimit) {
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
    }

    public float getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(float nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public void nominate(Nominee nominee, Nominator nominator, int value){
        Award award = new Award(value);

    }
}
