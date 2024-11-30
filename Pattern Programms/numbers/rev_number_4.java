import java.util.*;
public class rev_number_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        for(int i=a;i>0;i--){
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        //2nd part
        for(int i=2;i<=a;i++){
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
        sc.close();
    }
}
