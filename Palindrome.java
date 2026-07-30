import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        palindrome(size,arr);
    }
    public static void palindrome(int size,int[] arr){
        int left=0;
        int right=size-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                System.out.print("not");
                return;
            }
            left++;
            right--;
        }
        System.out.print("yes");
    }
}