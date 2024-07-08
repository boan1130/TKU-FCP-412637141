import java.util.Scanner;
public class hm_09 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);  
        System.out.print("請輸入長方形的長:");
        double radius = scn.nextInt();
        System.out.print("請輸入長方形的寬:");
        double radius1 = scn.nextInt();
        double area = radius*radius1;
        System.out.println("長方形的面積是:"+area);
        scn.close();
    }
}