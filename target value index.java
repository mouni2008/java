import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        int target=sc.nextInt();
        targetValue(size,arr,target);
    }
    public static void targetValue(int size,int[] arr,int target){
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                System.out.print(i);
                return;
            }
        }
        System.out.print("-1");
    }
}