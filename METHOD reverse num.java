
public class Reverse {
	public static void Revs(int a) {
	while(a>0) {
		 int rev=a%10;
		 System.out.print(rev+" ");
		 a=a/10;
	 }
	}
	
	public static void main(String[] args) {
		 int a=12345;
		 Revs(a);
	}


}