package Tasks.ThreadYarisi;

import java.util.ArrayList;

public class NumberProcessor implements Runnable {

    private final ArrayList<Integer> inputList;
    private final ArrayList<Integer> evenList;
    private final ArrayList<Integer> oddList;

    public NumberProcessor(ArrayList<Integer> inputList, ArrayList<Integer> evenList, ArrayList<Integer> oddList) {
        this.inputList = inputList;
        this.evenList = evenList;
        this.oddList = oddList;
    }

    @Override
    public void run() {
        for (Integer number : inputList) {
            if (number % 2 == 0) {
                synchronized (evenList) {
                    evenList.add(number);
                }
            } else {
                synchronized (oddList) {
                    oddList.add(number);
                }
            }
        }
    }
}
