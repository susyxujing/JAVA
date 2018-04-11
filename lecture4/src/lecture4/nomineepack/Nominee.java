package lecture4.nomineepack;

import java.util.Random;
import lecture4.awardpack.*;
import lecture4.nominatorpack.*;

public class Nominee {

    private String name;
    private int nomineeAwardQuantityLimit = 5;
    private int nomineeAwardAmountLimit = 1000;
    private float nomineeSumReceive = 500;
    private int receiveAward;


    public Nominee(String name, float nomineeSumReceive, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
        this.name = name;
        this.nomineeSumReceive = nomineeSumReceive;
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNomineeSumReceive() {
        return nomineeSumReceive;
    }

    public void setNomineeSumReceive(float nomineeSumReceive) {
        this.nomineeSumReceive = nomineeSumReceive;
    }

    public int getNomineeAwardQuantityLimit() {
        return nomineeAwardQuantityLimit;
    }

    public void setNomineeAwardQuantityLimit(int nomineeAwardQuantityLimit) {
        this.nomineeAwardQuantityLimit = nomineeAwardQuantityLimit;
    }

    public int getNomineeAwardAmountLimit() {
        return nomineeAwardAmountLimit;
    }

    public void setNomineeAwardAmountLimit(int nomineeAwardAmountLimit) {
        this.nomineeAwardAmountLimit = nomineeAwardAmountLimit;
    }

    public int getReceiveAward() {
        return receiveAward;
    }

    public void setReceiveAward(int receiveAward) {
        this.receiveAward = receiveAward;
    }
}
