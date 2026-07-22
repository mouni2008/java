import java.util.Scanner;
public class Main{
	public static void Square(int n) {
	    for(int i=1;i<=n;i++){
	        System.out.println(i+"*"+i+"="+i*i);
	    }
	}
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Square(n);
	    
	}
}