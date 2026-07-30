import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int[] arr=new int[size];
	    for(int i=0;i<size;i++)
	    arr[i]=sc.nextInt();
	    Array(size,arr);
	}
	public static void Array(int size,int[] arr){
	    boolean[] visited=new boolean[size];
	    for(int i=0;i<size;i++){
	        if(visited[i]){
	            continue;
	        }
	        int count=1;
	        for(int j=i+1;j<size;j++){
	            if(arr[i]==arr[j]){
	                visited[j]=true;
	                count++;
	            }
	        }
	        System.out.print(arr[i]+"-"+count);
	    }
	}
}