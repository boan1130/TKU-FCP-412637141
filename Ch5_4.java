public class Ch5_4 {

    public static void main(String[] args) {
        int a=50,b=20;
        char oper='+';

        switch(oper){
            case '+': //選擇值為'+'
                System.out.println(a+"+"+b+"="+(a+b)); //印出a+b
            case '-': //選擇值為'-'
                System.out.println(a+"-"+b+"="+(a-b)); //印出a+b
            default:  //沒有相對應的選擇值
                System.out.println(("Unknown expression!!")); //印出字串    
        }
    }
}