package lecture9.nomineepack;

import lecture9.OperationsWithLimit;
import lecture9.Person;

public class Nominee extends Person implements OperationsWithLimit {

    int intermediateValue = 100;
    int finalValue = 300;

    String name = "nominee";

//    @Override
//    public void max() {
//
//    }

    @Override
    public int getIntermediateLimitValue() {
        return this.intermediateValue;
    }

    @Override
    public void setIntermediateLimitValue(int intermediateValue) {
        this.intermediateValue = intermediateValue;
    }

    @Override
    public int getFinalLimitValue() {
        return this.finalValue;
    }

    @Override
    public void setFinalLimitValue(int finalValue) {
        this.finalValue = finalValue;
    }

    public Nominee(int interValue, int finValue) {
        this.intermediateValue = interValue;
        this.finalValue = finValue;
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }
}