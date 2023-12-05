package es1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        
        // get number to ask words
        Scanner input = new Scanner(System.in);
        System.out.println("Number of words to insert: ");
        int num = 1;
        try{
            num = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Not a number " + e.getMessage());
        }

        List<String> stringList = new ArrayList<>();

        do {
            System.out.println("Insert word: ");
            String str = input.nextLine();
            stringList.add(str);
            num--;
        } while (num != 0);

        System.out.println("Inserted words: " + stringList);
        
        // count duplicates
        Set<String> counterList = new HashSet<>();
        for (int i = 0; i < stringList.size(); i++){
            int coutWord = 0;
            String currentWord = stringList.get(i);
            for (String s : stringList) {
                if (s.equals(currentWord)) {
                    coutWord++;
                }
            }
            // store duplicate words to a Set
            counterList.add(currentWord + ": " + coutWord);
            coutWord = 0;
        }

        // prints duplicate words
        for(String word: counterList) {
            System.out.println(word);
        }

        // set cleaned version of words without duplications using set
        Set<String> cleanedWordsList = new HashSet<>(stringList);
        System.out.println("Without duplicated words: " + cleanedWordsList);

    }
}
