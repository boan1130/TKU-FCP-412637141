import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // 讀取兩個整數
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        // 計算和、差、積、商和餘數
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        // 輸出結果
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);

        scn.close();
    }
}
