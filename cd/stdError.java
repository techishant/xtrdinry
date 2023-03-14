package cd;

import java.util.Scanner;

public class stdError {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number then a sentence: ");
        int n = Integer.parseInt(in.nextLine());
        String s = in.nextLine();

        System.out.println("Number: " + n);
        System.out.println("Sentence: " + s);
    }
}
