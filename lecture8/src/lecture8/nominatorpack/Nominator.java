package lecture8.nominatorpack;

import lecture8.Limit;
import lecture8.Person;
import lecture8.awardpack.*;
import lecture8.nomineepack.*;


public class Nominator extends Person{
    Limit limit = new Limit();

    public Nominator() { }

    public Nominator (String name, int awardQuantityLimit,int awardAmountLimit) { }


    public void nominate(Nominee nominee, Nominator nominator, int value){
        Award award = new Award(value);
    }
}
