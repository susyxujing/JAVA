package lecture3;
import lecture3.awardpack.*;
import lecture3.nomineepack.*;
import lecture3.nominatorpack.*;

public class Main {
    public static void main (String[] args){

        Award award1 = new Award(25);
        Nominator nominator1 = new Nominator( "nominator1");
        Nominee nominee1 = new Nominee( "nominee1");
        nominee1.receiveAward(award1,nominee1,nominator1);

        Award award2 = new Award(25,0.75);
        Nominator nominator2 = new Nominator( "nominator2");
        Nominee nominee2 = new Nominee( "nominee2");
        nominee2.receiveAward(award2,nominee2,nominator2);

        Award award3 = new Award(50);
        Nominator nominator3 = new Nominator( "nominator3");
        Nominee nominee3 = new Nominee( "nominee3");
        nominee3.receiveAward(award3,nominee3,nominator3);

        Award award4 = new Award(50,0.85);
        Nominator nominator4 = new Nominator( "nominator4");
        Nominee nominee4 = new Nominee( "nominee4");
        nominee4.receiveAward(award4,nominee4,nominator4);

        Award award5 = new Award(100);
        Nominator nominator5 = new Nominator( "nominator5");
        Nominee nominee5 = new Nominee( "nominee5");
        nominee5.receiveAward(award5,nominee5,nominator5);

        Award award6 = new Award(100,0.95);
        Nominator nominator6 = new Nominator( "nominator6");
        Nominee nominee6 = new Nominee( "nominee6");
        nominee6.receiveAward(award6,nominee6,nominator6);
    }
}
