import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1

        Scanner scanner = new Scanner(System.in);
        int clouseCycle = 0;
        ArrayList<Integer> array = new ArrayList<>();
        //2
        while (clouseCycle < 1) {
            System.out.println("Type a number (If you want to stop write \"stop\") ");
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                array.add(value);
            } else {
                String scanString = scanner.next();
                if (scanString.equals("stop")) {
                    System.out.println("Input is stopped");
                    clouseCycle++;
                } else {
                    System.out.println("You typed something wrong");
                }
            }
        }

        //3
        int temp;
        boolean sort = false;

        while (!sort) {
            sort = true;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i) < array.get(i + 1)) {
                    temp = array.get(i);
                    array.set(i, array.get(i + 1));
                    array.set(i + 1, temp);
                    sort = false;
                }
            }
        }
        clouseCycle = 0;

        while (clouseCycle < 1) {
            System.out.println("Do you want the numbers to be organized upward (yes) or descending (not)?");
            String scanString = scanner.next();
                if (scanString.equals("not")) {
                    System.out.print("Your numbers are");
                    for (int i = 0; i < array.size(); i++) {
                        if (array.get(i) != 4) {
                            System.out.print(" " + array.get(i));
                            clouseCycle++;
                        }
                    }
                } else {
                    if (scanString.equals("yes")) {
                        System.out.print("Your numbers are");
                        for (int sizeOfArray = array.size() -1; sizeOfArray >= 0; sizeOfArray -= 1) {
                            if (array.get(sizeOfArray) != 4) {
                                System.out.print(" " + array.get(sizeOfArray));
                                clouseCycle++;
                            }
                        }
                } else {
                    System.out.print("You wrote something wrong. ");
                }
            }
        }
    }
}