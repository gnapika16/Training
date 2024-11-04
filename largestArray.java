import java.util.Scanner; 
public class largestArray {
     public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter a number: ");
           int n = scanner.nextInt();
           int[] array = new int[n];
           System.out.println("enter the elements of the array : ");
           for(int i=0 ; i<n ; i++){
               array[i] = scanner.nextInt();
           }
           int largest = array[0];
           for(int i=1; i<=n ; i++) {
                    if(array[i]>largest){
                          largest=array[i];
                    }
           }
           System.out.println(largest);
     }
     scanner.close();
}