import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        previousMin(size,arr);
    }
    public static void previousMin(int size,int[] arr){
        int min=arr[0];
        System.out.print(min+" ");
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}
