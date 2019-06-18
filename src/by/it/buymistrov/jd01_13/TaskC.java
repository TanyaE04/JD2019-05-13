package by.it.buymistrov.jd01_13;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskC {

    private static ArrayList<Double> inWork = new ArrayList<>();

    private static void readData() throws RuntimeException, InterruptedException {
        Double number ;
        int errorCount = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                number = Double.parseDouble(sc.nextLine());
                inWork.add(number);
                System.out.println("add");
            } catch (NumberFormatException e) {
                Thread.sleep(100);

                System.out.println(TaskC.class.getName());
                errorCount++;
                for (int i1 = inWork.size() - 1; i1 >= 0; i1--) {
                    System.out.print(inWork.get(i1) + " ");
                }
                System.out.println();
                if (errorCount == 5) {
                    throw new RuntimeException();
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            readData();
        } catch (NumberFormatException | InterruptedException e) {
            e.printStackTrace();

        }

    }
}
