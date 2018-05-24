package lecture9.nominatorpack;

import lecture9.OperationsWithLimit;
import lecture9.Person;


public class Nominator extends Person implements OperationsWithLimit {

    int intermediateValue = 100;
    int finalValue = 300;

    String name = "nominator";

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
        this.finalValue= finalValue;
    }

    public Nominator (int interValue, int finValue){
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
