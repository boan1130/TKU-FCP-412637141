public class Ch5_6 {
    public static void main(String[]args){
        int sum=0;

        for(int i=1;i<=4;i++){     //再迴圈內宣告變數i
            sum=sum+i;
            System.out.printf("i=%2d, sum=%2d\n",i,sum);
        }
    }
}
