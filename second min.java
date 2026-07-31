import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        secondmin(size,arr);
    }
    public static void secondmin(int size,int arr[]){
        int firstm=Integer.MAX_VALUE;
        int secondm=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<firstm){
                secondm=firstm;
                firstm=arr[i];
            }
            else if(arr[i]<secondm && arr[i]!=firstm){
                secondm=arr[i];
            }
        }
        System.out.print(secondm);
    }
}