import awardpack.Award;
import nomiantorpack.Nominator;
import nomineepack.Nomiee;
import awardpack.Award;
import nomiantorpack.Nominator;

public class Main {
    public static void main (String[] args){

        Award award = new Award (100);
        Nomiee nomiee = new Nomiee("susy");
        Nominator nominator = new Nominator("soo");

        nomiee.receiveAward(award,nomiee,nominator);
    }
}

