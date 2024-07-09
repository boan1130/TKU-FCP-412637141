import java.util.Scanner;
public class hm_10 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);  
        System.out.print("請輸入華氏溫度:");
        double F = scn.nextInt();
        System.out.println ((F-32)*5/9);
        scn.close();
    }
}

