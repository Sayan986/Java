import java.util.*;
public class star_5rev{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a= sc.nextInt();
        for(int i=1;i<a;i++){
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        //2nd part
        for(int i=a;i>0;i--){
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        sc.close();
    }
}