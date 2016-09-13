public class Utils {

    public static boolean isStringFound(String inputString, String[] arr) {
        inputString = inputString.trim().toLowerCase();
        for (String str : arr) {
            if ( str.equals( inputString ) ) {
                return true;
            }
        }
        return false;
    }

    /**
     * Does the string contain numbers only?
     * @param str String that must contain only numbers
     * @return true If String contains only numbers
     */
    public static boolean isDigitStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ( !Character.isDigit( str.charAt(i) ) )
                return false;
        }
        return true;
    }

}