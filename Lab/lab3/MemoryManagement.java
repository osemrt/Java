import java.util.*;

public class MemoryManagement {

    private HashMap<Integer, Process> processHashMap;
    private Queue<Integer> integerQueue;
    private int addedProcess;


    public MemoryManagement() {
        this.processHashMap = new HashMap<>();
        this.integerQueue = new LinkedList<>();
        this.addedProcess = 0;
    }

    public Process addProcess(Process process) {

        if (integerQueue.isEmpty())
            processHashMap.put(addedProcess++, process);
        else
            processHashMap.put(integerQueue.poll(), process);

        return process;

    }

    public Process removeProcess(int key) {
        integerQueue.add(key);
        Process process = processHashMap.get(key);
        processHashMap.remove(key);
        return process;
    }


    public void introduceYourself() {
        String empty = "";
        String filled = "";

        ArrayList<Integer> emptyIndexes = getEmptyIndexes();
        ArrayList<Integer> filledIndexes = getFilledIndexes();

        for (Integer integer : emptyIndexes)
            empty += Integer.toString(integer);

        for (Integer integer : filledIndexes)
            filled += Integer.toString(integer);


        System.out.println("Empty: " + empty);
        System.out.println("Filled: " + filled);


    }

    public ArrayList<Integer> getEmptyIndexes() {

        ArrayList<Integer> emptyIndexes = new ArrayList<>();
        Iterator<Integer> iterator = integerQueue.iterator();

        while (iterator.hasNext()) {
            emptyIndexes.add(iterator.next());
        }

        return emptyIndexes;

    }

    public ArrayList<Integer> getFilledIndexes() {

        ArrayList<Integer> filledIndexes = new ArrayList<>();

        for (int i = 0; i < addedProcess; i++) {
            if (processHashMap.get(i) != null)
                filledIndexes.add(i);
        }

        return filledIndexes;

    }


}
