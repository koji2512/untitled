package javahukusyuu.javahukusyuu1;

public class hukusyuu14 {
    public static void main(String[] args) {
        String color = "red";
        if(color.equals("red")) {
            System.out.println("停止");
        }else if(color.equals("yellow")) {
            System.out.println("注意");
        }else if(color.equals("blue")) {
            System.out.println("進行");
        }else{
            System.out.println("無効な震央の色です。");
        }
    }
}

