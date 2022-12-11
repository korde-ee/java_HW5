


public class CheckIt {

    public boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public boolean isBiggerThan(String s) throws NumberFormatException {
        try {
            if(Integer.parseInt(s)< 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
