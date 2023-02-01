package list.proposedexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * Using lists, make a program that asks a person 5 questions about a crime. The questions are:
 * 
 * 1. "Did you call the victim?"
 * 2. "Were you at the crime scene?"
 * 3. "Do you live near the victim?"
 * 4. "Owed to the victim?"
 * 5. "Have you worked with the victim?"
 * 
 * If the person responds positively to 2 questions he should be classified as "Suspicious",
 * between 3 and 4 as "Accomplice" and 5 as "Assassin". Otherwise, she will be classified as "Innocent"
 */

public class Exercise_2 {
    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer the questions with Yes or No : ");

        for(int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println("Did you call the victim?");                    
                    break;
                case 2:
                    System.out.println("Were you at the crime scene?");                    
                    break;
                case 3:
                    System.out.println("Do you live near the victim?");                    
                    break;
                case 4:
                    System.out.println("Owed to the victim?");                    
                    break;
                case 5:
                    System.out.println("Have you worked with the victim?");                    
                    break;
                default:
                    System.out.println("There is no more questions.");
                    break;
            }
            String answer = scanner.next();
            answers.add(answer.toLowerCase());

        }

        System.out.println(answers);

        int count = 0;
        Iterator<String> counter = answers.iterator();
        while(counter.hasNext()){
            String ans = counter.next();
            if(ans.contains("yes")) count++;
        }

        switch (count) {
            case 2:
                System.out.println(">> SUS <<");
                break;
            case 3:
            case 4:
                System.out.println(">> ACCOMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSIN <<");
                break;
            default:
                System.out.println(">> INNOCENT <<");
                break;
        }

    }
}
