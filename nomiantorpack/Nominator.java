package nomiantorpack;

import awardpack.Award;
import nomineepack.Nomiee;

public class Nominator {
    private String name;

    public Nominator()
    {
    }

    public Nominator (final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }

}
