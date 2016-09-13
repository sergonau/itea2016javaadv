import java.util.Random;

public class Worker {

    private ConsoleIO cons;

    public Worker(ConsoleIO cons) {
        this.cons = cons;
    }

    private void start() {
        cons.writeString( MessagesBank.WELCOME.toString() );

    }

    public int rnd(){
        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        return result;
    }

    public void runWork() {

        int rndInt = rnd();
        int i = 0;
        // program initialization
        start();
        // main work cycle, test the console input
        while ( cons.hasProperInputString() ) {

            // If user not enters exit command
            try {
                if ( cons.stringToInt(cons.getLastInputValueFromConsole()) < rndInt) {
                    i=i+1;
                    cons.writeString( MessagesBank.NO_LESS.toString() );
                } else if (cons.stringToInt(cons.getLastInputValueFromConsole()) > rndInt) {
                    i=i+1;
                    cons.writeString( MessagesBank.NO_MORE.toString() );
                } else if (cons.stringToInt(cons.getLastInputValueFromConsole()) == rndInt) {
                    i=i+1;
                    cons.writeString( MessagesBank.YES.toString() );
                    System.out.println("Number of attempts: " + i);
                    break;

                }
            }  catch (IllegalArgumentException e) {
                cons.writeString( MessagesBank.MSG_ACCOUNT_FORMAT_EXCEPTION.toString() );
            }

        }
    }

}