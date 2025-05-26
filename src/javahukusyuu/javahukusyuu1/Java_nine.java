package javahukusyuu.javahukusyuu1;

import java.io.*;
public class Java_nine {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        //復習問題9
        System.out.print("名前を入力してください＞");
        String inputName=br.readLine();
        System.out.print("年齢を入力してください＞");
        int age =Integer.parseInt(br.readLine());

        System.out.print(age+"歳の"+inputName+"さん。\n"+"こんにちは。");

        System.out.println("\n");
        //復習問題10
        int num =5;
        if(num>0) {
            System.out.println("この数は整数です。");
        }else {
            System.out.println("この数は整数ではありません。");
        }
            System.out.println("\n");
            //復習問題11
            int a = 5;
            if(a % 10 != 0) {
                System.out.println("この数は10で割り切れない値です。");
            }else {
                System.out.println("この数は10で割り切れる値です。");
            }
        }
    }

