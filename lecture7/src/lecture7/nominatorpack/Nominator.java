package lecture7.nominatorpack;

import lecture7.awardpack.*;
import lecture7.nomineepack.*;
import lecture7.utility.NominationHelper;


public class Nominator {
    private String name;
    private int nominatorAwardQuantityLimit = 5;
    private int nominatorAwardAmountLimit = 500;
    private int nominatorAmountOfAwardsGiven = 100;


    public int getNominatorAmountOfAwardsGiven() {
        return nominatorAmountOfAwardsGiven;
    }

    public void setNominatorAmountOfAwardsGiven(int nominatorAmountOfAwardsGiven) {
        this.nominatorAmountOfAwardsGiven = nominatorAmountOfAwardsGiven;
    }

    public Nominator()
    {

    }

    public Nominator (String name, int nominatorAwardQuantityLimit,int nominatorAwardAmountLimit, int nominatorAmountOfAwardsGiven ) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
        this.nominatorAmountOfAwardsGiven = nominatorAmountOfAwardsGiven;
    }

    public boolean nominate(Award award, Nominee nominee) {
        if (NominationHelper.checkQuantityLimit(this.getNominatorAwardQuantityLimit())) {
            if (NominationHelper.checkAmountLimit(this.getNominatorAwardAmountLimit(), this.getNominatorAmountOfAwardsGiven(), award.getValue())) {
                this.setNominatorAwardQuantityLimit(this.getNominatorAwardQuantityLimit() - 1);
                this.setNominatorAmountOfAwardsGiven(this.getNominatorAmountOfAwardsGiven() + award.getValue());
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

    public int getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(int nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public void nominate(Nominee nominee, Nominator nominator, int value){
        Award award = new Award(value);

    }

}
