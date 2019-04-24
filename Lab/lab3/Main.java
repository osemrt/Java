public class Main {

    public static void main(String[] args) {

        Process pA = new Process("Process A");
        Process pB = new Process("Process B");
        Process pC = new Process("Process C");
        Process pD = new Process("Process D");

        MemoryManagement memoryManagement = new MemoryManagement();

        memoryManagement.addProcess(pA);
        memoryManagement.addProcess(pB);
        memoryManagement.addProcess(pC);
        memoryManagement.addProcess(pD);

        memoryManagement.introduceYourself();

        memoryManagement.removeProcess(2);
        memoryManagement.introduceYourself();

        memoryManagement.addProcess(new Process("Process M"));
        memoryManagement.introduceYourself();


    }



}
