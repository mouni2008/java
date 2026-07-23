
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int rev=0;
		int b=a;
		while(a>0) {
			int n=a%10;
			rev=rev*10+n;
			a=a/10;
		}
		if(b==rev) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		sc.close();
	}

}