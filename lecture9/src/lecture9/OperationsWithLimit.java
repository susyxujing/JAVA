package lecture9;

public interface OperationsWithLimit {

    boolean limitReached = true;

//    void max(){
//        this.limitReached = false;
//    }

    //void setLimitReached(int intermediateLimitValue, int finalLimitValue);

    int getIntermediateLimitValue();

    void setIntermediateLimitValue(int intermediateValue);

    int getFinalLimitValue();

    void setFinalLimitValue(int finalValue);

}
