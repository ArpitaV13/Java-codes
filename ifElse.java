package conditions;
import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int age=n.nextInt();
		if(age>=18) {
			System.out.println("You can vote");
			}
		else {
			System.out.println("You cannot vote");
		}

	}

}
