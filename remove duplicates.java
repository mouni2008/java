import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        arr[i]=sc.nextInt();
        duplicate(size,arr);
    }
    public static void duplicate(int size,int[] arr){
        boolean found=false;
        boolean[] visited=new boolean[size];
        for(int i=0;i<size;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
                found=true;
            }
        }
        if(!found){
            System.out.print("0");
        }
    }
}
