import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int [size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        sum(size,arr);
    }
    
    public static void sum(int size,int[] arr){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}