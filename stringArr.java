import java.util.Scanner;
import java.util.*;

public class stringArr{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print(">. ");
		String text = in.nextLine();

		String Arr[] = new String[text.length()];
		Arr=text.split(" ");
		print(Arr);
	}

	public static void print(String[] arr){
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
		return;
	}
}
		
