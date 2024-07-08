import java.util.Scanner;
public class hm_11 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("第一件商品的價格");
        int sum1=scn.nextInt(); //輸入整數
        System.out.print("第二件商品的價格");
        int sum2=scn.nextInt(); //輸入整數
        System.out.print("第三件商品的價格");
        int sum3=scn.nextInt();
        int sum=(sum1+sum2+sum3);
        System.out.println("總價為:"+sum);
        scn.close();
        
    }
    
}
