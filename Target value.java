import java.util.Scanner;
public class Main{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int size=sc.nextInt();
            int[] arr=new int [size];
            for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
            int target=sc.nextInt();
            array(size,arr,target);
    }
    public static void array(int size,int[] arr,int target){
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("-1");
    }
}