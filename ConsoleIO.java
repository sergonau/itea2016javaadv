import java.util.Scanner;

    public class ConsoleIO {


        private Scanner in;
        private String  lastInputValueFromConsole;
        private static final String[] QUIT_SIGNATURES = { "e", "q", "exit", "quit" };

        public ConsoleIO() {
            in = new Scanner(System.in);
            lastInputValueFromConsole = "";

        }

        private boolean isQuitCommand( String inputString) {
            return Utils.isStringFound(inputString, QUIT_SIGNATURES);
        }

        public int stringToInt (String str1) {

            int d2 = Integer.valueOf(str1);
            return d2;

        }

        public String getLastInputValueFromConsole() {
            return lastInputValueFromConsole;
        }

        public void writeString(String str) {
            System.out.print(str);
        }

        public String readString() {
            lastInputValueFromConsole = in.nextLine().trim().toLowerCase();
            return lastInputValueFromConsole;
        }

        public boolean hasProperInputString() {
            writeString( MessagesBank.GUESS_IT.toString() );
            lastInputValueFromConsole = in.nextLine().trim().toLowerCase();
            return ! isQuitCommand ( lastInputValueFromConsole );
        }

    }