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
        int evencount=0,oddcount=0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evencount+"\n"+oddcount);
    }
}