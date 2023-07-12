import java.sql.SQLOutput;
import java.util.Scanner;

public class pair {
    public static int Countpairs(int arr[],int k){
            int size= arr.length;
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                    if(arr[i]+arr[j]==k){
                         return 1;
                    }
                }
            }
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        System.out.println("Enter the Array index");
        int arr[]=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value k");
        int k=sc.nextInt();
        int pair=Countpairs(arr,k);
        System.out.println(pair);
    }
}
