package lecture7.nomineepack;

import java.util.Random;
import lecture7.awardpack.*;
import lecture7.nominatorpack.*;
import lecture7.utility.NominationHelper;

public class Nominee {

    private String name;
    private int nomineeAwardQuantityLimit = 5;
    private int nomineeAwardAmountLimit = 1000;
    private int nomineeSumReceive = 500;
    private int receiveAward;


    public Nominee(String name, int nomineeSumReceive, int nomineeAwardQuantityLimit, int nomineeAwardAmountLimit) {
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

    public int getNomineeSumReceive() {
        return nomineeSumReceive;
    }

    public void setNomineeSumReceive(int nomineeSumReceive) {
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

    public boolean nominatee(Award award, Nominee nominee) {
        if (NominationHelper.checkQuantityLimit(this.getNomineeAwardQuantityLimit())) {
            if (NominationHelper.checkAmountLimit(this.getNomineeSumReceive(), this.getNomineeAwardAmountLimit(), award.getValue())) {
                this.setNomineeSumReceive(this.getNomineeSumReceive() - 1);
                this.setNomineeAwardAmountLimit(this.getNomineeAwardAmountLimit() + award.getValue());
                return true;
            } else {
                System.out.println("Nominator amount Limit failed");
            }
        } else {
            System.out.println("Nominator quantity Limit failed");
        }
        System.out.println(nominee.getName() + " has received total amount of award for " + nominee.getNomineeSumReceive());
        return false;
    }
}




