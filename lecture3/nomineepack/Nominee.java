package lecture3.nomineepack;

import lecture3.awardpack.*;
import lecture3.nominatorpack.*;
import java.util.Random;

public class Nominee {

    private String name;

    public Nominee()
    {
    }

    public Nominee (final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName (String name){
        this.name = name;
    }


    public void receiveAward(Award award, Nominee nominee ,Nominator nominator) {
        if (award.getSoli() != null){
            System.out.println("Award valus is " + award.getValue() + ", Nominee name is "+ nominee.getName() + ", Nominator name is " + nominator.getName());
            System.out.println("Soli was specified " + award.getSoli());
            Double awardValueWithSoli = award.getValue() * award.getSoli();
            System.out.println("New Award Value with soli " + awardValueWithSoli);
            System.out.println("The orginal award value is different then the value with soli with " + (awardValueWithSoli/award.getValue())*100 + "%");
            System.out.println("========================");
        }
        else{
            Random random = new Random();
            int c = random.nextInt(1);
            int population = 3;
            int z = random.nextInt(6)+1;
            int p = award.getValue();
            int quantity = ((z^2*(p)*(1-p))/(c^2)) / (1 + ((((z^2*(p)*(1-p))/(c^2))-1)/population));
            System.out.println("Award valus is "+ award.getValue()+ ", Nominee name is "+ nominee.getName() + ", Nominator name is " + nominator.getName());
            System.out.println("Soli is not specified for this Award");
            System.out.println("Quantity value is " + quantity);
            System.out.println("========================");
        }

    }
}
