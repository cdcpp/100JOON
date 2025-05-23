import java.util.Arrays;
import java.util.Scanner;

public class Main {
   
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
         int [] arr = new int [sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int [] findArr = new int[sc.nextInt()];
        
        for(int i=0;i<findArr.length;i++){
            findArr[i] = sc.nextInt();
        }
        
        for(int i=0;i<findArr.length;i++){
            System.out.println(binary(arr,findArr[i],0,arr.length-1));
        }
    }//main
    
    public static int binary(int [] arr , int key , int low , int high){
        if(low > high){
            return 0;
        }
        
        int mid = (low+high) /2 ;
        
        if(arr[mid] < key){
            return binary(arr , key , mid + 1 , high);
        }else if(arr[mid] > key){
            return binary(arr , key , low , mid -1);
        }else{
            return 1;
        }
    }
}