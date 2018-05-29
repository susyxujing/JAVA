package lecture10;

public class Nominator extends Person {
    private String name;
    private int nominatorAwardQuantityLimit = 5;
    private float nominatorAwardAmountLimit = 500;

    public Nominator() { }

    public Nominator (String name, int nominatorAwardQuantityLimit,float nominatorAwardAmountLimit ) {
        this.name = name;
        this.nominatorAwardQuantityLimit = nominatorAwardQuantityLimit;
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public void award(){
        System.out.println("Nominator gave a award");
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

    public float getNominatorAwardAmountLimit() {
        return nominatorAwardAmountLimit;
    }

    public void setNominatorAwardAmountLimit(float nominatorAwardAmountLimit) {
        this.nominatorAwardAmountLimit = nominatorAwardAmountLimit;
    }

    public void nominate(Nominee nominee, Nominator nominator, int value){
        Award award = new Award(value);

    }
}