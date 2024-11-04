import java.util.Scanner;
public class codeforces136a {
          public static void main(String[] args){
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                int k;
                int[] array = new int[n+1];
                for(int i=1; i<=n; i++){
                       k=scan.nextInt();
                       array[k]=i;
                 }
                 for(int i=1; i<=n; i++)  System.out.print(array[i]+" " );
          }
}