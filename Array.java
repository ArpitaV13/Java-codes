package Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the no. of students");
	int sum=0,avg=0;
	int n =sc.nextInt();
	int marks[]=new int[n];
	for(int i=0;i<n;i++) {
		marks[i]=sc.nextInt();
		
	}
for(int j=0;j<n;j++) {
	sum=sum+marks[j];
	
}
	
avg=avg+sum/n;
System.out.println(avg);
	}

}
