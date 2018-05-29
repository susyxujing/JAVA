package lecture10;

public class Main {
    public static void main(String[] args){

        Person person[] = new Person[2];

        person[0] = new Nominator("Nomintor_name",6,200);
        person[1] = new Nominee("Nominee_name",6,4,500);


       for (int x=0;x<2;++x){
           person[x].award();
        }
    }
}
