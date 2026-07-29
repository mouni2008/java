import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(solveproblem (arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static boolean solveproblem(int num){
        if(num<2){
            return false;
        }
        else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}