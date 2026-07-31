import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        int target=sc.nextInt();
        binary(size,arr,target);
    }
    public static void binary(int size,int[] arr,int target){
        int left=0;
        int right=size-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                System.out.print(mid);
                return ;
            }
            if(arr[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.print(-1);
    }
}
