package nomineepack;

import awardpack.Award;
import nomiantorpack.Nominator;

import java.io.Console;

public class Nomiee {

    private String name;

    public Nomiee()
    {
    }

    static {
        System.out.println("Nomiee is initialized");
    }

    public Nomiee (final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

    public void receiveAward(Award a, Nomiee n1, Nominator n2)
    {
        System.out.println("Award amount is " + a.getValue());
        System.out.println("Nomiee name is " + n1.getName());
        System.out.println("Nominator name is "+ n2.getName());
    }

}






