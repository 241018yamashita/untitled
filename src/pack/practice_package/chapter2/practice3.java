package pack.practice_package.chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください>");
        String name = br.readLine();
        System.out.print("貴方の年齢を入力してください>");
        String age = br.readLine();
        Integer.parseInt(age);
        int fortune = new java.util.Random().nextInt(3) + 1;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.print("(1:大吉 2:中吉 3:吉 4:凶)");


    }
}
