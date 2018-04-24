package lecture7.utility;

import lecture7.awardpack.Award;
import lecture7.nominatorpack.Nominator;
import lecture7.nomineepack.Nominee;
import org.jetbrains.annotations.Contract;

public class NominationHelper {

    @Contract(pure = true)
    public static boolean checkQuantityLimit(int nomineeAwardQuantityLimit) {
        return nomineeAwardQuantityLimit > 0;
    }

    @Contract(pure = true)
    public static boolean checkAmountLimit(int nomineeSumReceive, int nomineeAwardAmountLimit, int value) {
        return nomineeSumReceive < nomineeAwardAmountLimit && value < nomineeAwardAmountLimit;
    }
}