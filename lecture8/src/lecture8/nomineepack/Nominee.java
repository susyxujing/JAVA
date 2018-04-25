package lecture8.nomineepack;

import java.util.Random;

import lecture8.Person;
import lecture8.awardpack.*;
import lecture8.nominatorpack.*;

public class Nominee extends Person {


    private float nomineeSumReceive = 500;
    private int receiveAward;


    public Nominee(String name, float nomineeSumReceive, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
        this.nomineeSumReceive = nomineeSumReceive;
    }

    public float getNomineeSumReceive() {
        return nomineeSumReceive;
    }

    public void setNomineeSumReceive(float nomineeSumReceive) {
        this.nomineeSumReceive = nomineeSumReceive;
    }

    public int getReceiveAward() {
        return receiveAward;
    }

    public void setReceiveAward(int receiveAward) {
        this.receiveAward = receiveAward;
    }
}
