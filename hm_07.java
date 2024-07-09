import java.util.Scanner;
public class hm_07 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);  
        System.out.print("請輸入圓的半徑:");
        double radius = scn.nextInt();
        double area = Math.PI*radius*radius;
        System.out.println("圓的面積是:"+area);
        scn.close();
    }
}
