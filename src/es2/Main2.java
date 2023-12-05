package es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        try {
            System.out.println("insert a number: ");
            num = Integer.parseInt(input.nextLine());
            System.out.println("this is list: " + orderdList(num));
        } catch (NumberFormatException e) {
            System.out.println("Not a number!" + e.getMessage());
        }

       input.close();
    }

    public static List<Integer> orderdList(int num) {
      List<Integer> internalList = new ArrayList<>();
      Random rnd = new Random();
      for(int i = 0; i < num; i++) {
          internalList.add(rnd.nextInt(0,11));
      }
      return internalList;
    };
}
