package lecture9;

//import lecture9.awardpack.*;
import lecture9.nominatorpack.*;
import lecture9.nomineepack.*;

public class Main {
    public static void main(String[] args) {

        Nominator nominator1 = new Nominator(100, 200);
        nominator1.setName(" Nominator -- Amy");

        System.out.println("This Nominator intermediate value is " + nominator1.getIntermediateLimitValue());
        System.out.println("This Nominator final value is " + nominator1.getFinalLimitValue());
        System.out.println("This Nominator Name is " + nominator1.getName());
        System.out.println("=======================================================");

        Nominee nominee1 = new Nominee(100, 200);
        nominee1.setName(" Nominee -- Helen");

        System.out.println("This Nominee intermediate value is " + nominee1.getIntermediateLimitValue());
        System.out.println("This Nominee final value is " + nominee1.getFinalLimitValue());
        System.out.println("This Nominee Name is " + nominee1.getName());
    }
}
