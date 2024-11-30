/*
1
12
123
1234
 */
import java.util.*;
public class number_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        sc.close();
    }
}