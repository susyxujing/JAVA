package lecture3.awardpack;

public class Award {

    private Double soli;
    private Integer value;

    public Award() {
    }

    public Award(Integer value, Double soli) {
        this.value = value;
        this.soli  = soli;
    }

    public Award(Integer value) {
        this.value = value;

    }

    public Double getSoli() {
        return soli;
    }

    public void setSoli(Double soli) {
        this.soli = soli;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}