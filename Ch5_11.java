public class Ch5_11 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i%3==0)   //判斷i%3是否為0
                continue;
                System.out.printf("%3d",i); //印出i的值
        }
    }
}
