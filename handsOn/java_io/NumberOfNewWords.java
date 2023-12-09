package handsOn.java_io;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberOfNewWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student's Article: ");
        String article = sc.nextLine();

        String[] words = article.split(" ");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        int uniqueWordsCount = uniqueWords.size();

        System.out.println("Number of words: "+ words.length);
        System.out.println("Number of unique words: "+ uniqueWordsCount);

        for (String string : uniqueWords) {
            System.out.println(string);
        }


        sc.close();
    }
}
