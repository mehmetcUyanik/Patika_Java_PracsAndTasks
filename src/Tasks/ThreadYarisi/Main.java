package Tasks.ThreadYarisi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> originalList = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            originalList.add(i);
        }

        ArrayList<ArrayList<Integer>> dividedLists = new ArrayList<>();
        int chunkSize = originalList.size() / 4;
        for (int i = 0; i < 4; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;
            ArrayList<Integer> chunk = new ArrayList<>(originalList.subList(startIndex, endIndex));
            dividedLists.add(chunk);
        }

        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> subList = dividedLists.get(i);
            Thread thread = new Thread(new NumberProcessor(subList, evenNumbers, oddNumbers));
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
