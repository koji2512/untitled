package javahukusyuu.javahukusyuu2;
public class Hukusyuu_two{
    public static void main(String[] args) {
        int num = 4;
        if(num%2==0) {
            System.out.println("偶数");
        }else if(num%2==1) {
            System.out.println("奇数");
        }else{
            System.out.println("無効な入力です。");
        }
    }

    public static class java17 {
        public static void main(String[] args) {
            int num=4;
            int sum=0;
            int i=0;
            while(i<=num){
                sum+=i;
                i+=2;
            }
            System.out.println("結果"+sum);
        }
    }
}
