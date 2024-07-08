import java.util.Scanner;
public class hm_08 {
    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in); //宣告Scanner類別的物件

        System.out.println("What's your name?");
        String name=scn.next(); //輸入字串
        System.out.print("How old are you?");
        int age=scn.nextInt(); //輸入整數
        System.out.println("which city do you live in?");
        String city=scn.next();
        System.out.print(name+", "+age+"years old,"+"live in " + city);
        scn.close(); //將scn關閉
}
}
