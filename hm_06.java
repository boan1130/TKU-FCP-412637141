import java.util.Scanner;
public class hm_06 {
   public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("請輸入第一個整數:");
    int num1 =scn.nextInt();
    System.out.println("請輸入第二個整數:");
    int num2 =scn.nextInt();
    int sum = num1 + num2;
    System.out.println("這兩個整數的和是:" + sum);
    scn.close();
   } 
}
