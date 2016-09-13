public class MainRun {

    public static void main(String[] args) {

        // main worker class initialization
        Worker worker = new Worker(new ConsoleIO());
        worker.runWork();

    }

}
