import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        absolute(size,arr);
    }
    public static void absolute(int size,int[] arr){
        int diff=0,evensum=0,oddsum=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
            }else{
                oddsum=oddsum+arr[i];
            }
        }
        diff=evensum-oddsum;
        if(diff<0){
            diff=-diff;
            System.out.print(diff);
        }
    }
}