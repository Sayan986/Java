import java.util.*;
public class number_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        for(int i=1; i<=a; i++){
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%d", j);
            }
            System.out.println();
        }
        sc.close();
    }
}