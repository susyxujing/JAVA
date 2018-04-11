package lecture4;
import lecture4.nomineepack.*;
import lecture4.awardpack.*;
import lecture4.nominatorpack.*;

public class Main {
    public static void main (String[] args){

        //3.1
        Nominator nominator1 = new Nominator("3.1nominator",6,200);
        Nominee nominee1 = new Nominee ("3.1nominee",200, 4, 500 );
        int award1Count =0;

        while(award1Count < nominator1.getNominatorAwardQuantityLimit())
        {
            nominator1.nominate(nominee1, nominator1,50);
            award1Count += 1;
            System.out.println("count: " + award1Count);
        }
        System.out.println("nominatorAwardQuantityLimit (" + award1Count + ") reached for " + nominator1.getName());
        System.out.println("=======================");

        //3.2
        Nominator nominator2 = new Nominator("3.2nominator",6,200);
        Nominee nominee2 = new Nominee ("3.2nominee",200, 4, 500 );
        int award2Count =50;

        while(award2Count < nominator2.getNominatorAwardAmountLimit())
        {
            nominator2.nominate(nominee2, nominator2,50);
            award2Count += 50;
            System.out.println("count: " + award2Count);
        }
        System.out.println("nominatorAwardAmountLimit (" + award2Count + ") reached for " + nominator2.getName());
        System.out.println("=======================");

        //3.3
        Nominator nominator3 = new Nominator("3.3nominator",6,200);
        Nominee nominee3 = new Nominee ("3.3nominee",200, 4, 500 );
        int award3Count =0;

        while(award3Count < nominee3.getNomineeAwardQuantityLimit())
        {
            nominator3.nominate(nominee3, nominator3,50);
            award3Count += 1;
            System.out.println("count: " + award3Count);
        }
        System.out.println("nomineeAwardAmountLimit (" + award3Count + ") reached for " + nominator3.getName());
        System.out.println("=======================");

        //3.4
        Nominator nominator4 = new Nominator("3.4nominator",5,200);
        Nominee nominee4 = new Nominee ("3.4nominee",200, 4, 500 );
        int award4Count = 100;

        while(award4Count < nominee4.getNomineeAwardAmountLimit())
        {
            nominator4.nominate(nominee4, nominator4,100);
            award4Count += 100;
            System.out.println("count: " + award4Count);
        }
        System.out.println("nomineeAwardAmountLimit (" + award4Count + ") reached for " + nominator4.getName());
        System.out.println("=======================");

    }


}
