import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        array(size,arr);
    }
    public static void array(int size,int[] arr){
        boolean ASC=true,DSC=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                ASC=false;
            }
            if(arr[i]<arr[i+1]){
                DSC=false;
            }
        }
        if(ASC||DSC){
            System.out.print(" sorted");
        }else{
            System.out.print("not");
        }
    }
}