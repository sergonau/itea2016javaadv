 public enum MessagesBank {

        WELCOME ("Welcome! Computer have an integer from 0 to 100\n"),
        GUESS_IT (" Guess it!\n"),
        NO_LESS("No! this number is less then conceived number! Try again!\n"),
        NO_MORE("No! this number is more then conceived number! Try again!\n"),
        YES ("Yes! You win!\n"),
        MSG_ACCOUNT_FORMAT_EXCEPTION("IllegalArgumentException: Account should not contain non-numeric characters\n");


        // inner message field
        private String msg;

        // hidden constructor
        MessagesBank(String message) {
            this.msg = message;
        }

        @Override
        public String toString() {
            return this.msg;
        }

    }