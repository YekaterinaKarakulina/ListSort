package listSort;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSort {
    public static void main(String[] args) {
        System.out.println("The program sort arraylist by string length. \nType strings to add to arrayList. To finish typing strings use keyword \"Exit\"");
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> sortedList = new ArrayList<String>();

        while (true) {
            String str = scanner.nextLine();

            if (str.equals("Exit")) {
                break;
            }
            list.add(str);
        }

        for (int j = 0; j < list.size() + sortedList.size(); j++) {
            String min = list.get(0);
            int minIndex = 0;
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).length() < min.length()) {
                    min = list.get(i);
                    minIndex = i;
                }
            }
            sortedList.add(min);
            list.remove(minIndex);
        }
        System.out.println("Sorted list:");
        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
    }
}
