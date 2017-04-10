package GuessNumber;

/**
 * Created by tghe on 4/10/17.
 */
public class GuessNumber {
    public String compareNumber(int pick,int Number) {
        if(pick < Number) {
            return "big";
        }
        if(pick > Number) {
            return "small";
        }
        if(pick == Number) {
            return "true";
        }
        return null;
    }
}
