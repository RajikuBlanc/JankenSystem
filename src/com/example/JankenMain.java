package com.example;

import java.util.Random;
import java.util.Scanner;


class JankenMain {
    public static void main(String[] args) {
        System.out.println("じゃんけんゲーム開始");
        jankenHand();
        System.out.println("ゲーム終了!");
    }

    /* じゃんけんのハンドを選択する。
       入力文字が正しくない場合は再度選択を促す
       現状整数は問題なく再度選択する処理が行われるが、文字列が入力された場合はエラーが出て処理が止まる
    */
    public static void jankenHand() {
        Scanner scanner = new Scanner(System.in);
        // 説明テキスト
        String handText = "1:グー 2:チョキ 3:パー (1~3の数字を入力)";
        // エラーテキスト
        String handTextError = "入力値が正しくありません。もう１度入力し直してください。";

        System.out.println(handText);
        // 相手側ハンド(ランダム数字(1~3))
        int iCompHand = new Random().nextInt(3);
        iCompHand++;

        while (scanner.hasNext()) {
            int iUserHand;
            iUserHand = scanner.nextInt();
            if (iUserHand == 1 || iUserHand == 2 || iUserHand == 3) {
                // 数字を文字(1=グー、2=チョキ、3=パーに変換)に変換し判定処理に値を渡す
                JankenJudge.judge(iUserHand, iCompHand);
                break;
            } else {
                System.out.println(handTextError);
                System.out.println(handText);
            }
        }
    }
}