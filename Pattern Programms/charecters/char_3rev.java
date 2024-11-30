import java.util.*;
public class char_3rev{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a= sc.nextInt();
       
        for(int i=a; i>0; i--){
            char s= 'A';
            for(int k=1; k<=a-i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.printf("%c", s);
                s++;
            }
            System.out.println();
        }
        sc.close();
    }
}