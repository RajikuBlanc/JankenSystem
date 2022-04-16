package com.example;

import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void janken() {
        Scanner scanner = new Scanner(System.in);
        // 説明テキスト
        String handText = "1:グー 2:チョキ 3:パー (1~3の数字を入力)";
        // エラーテキスト
        String handTextError = "入力値が正しくありません。もう１度入力し直してください。";

        System.out.println(handText);
        while (scanner.hasNext()) {
            int inputHand;
            inputHand = scanner.nextInt();
            if (inputHand == 1 || inputHand == 2 || inputHand == 3) {
                Hand(inputHand);
                break;
            } else {
                System.out.println(handTextError);
                System.out.println(handText);
            }
        }
    }

    public static void Hand(int iUserHand) {
        // 相手側ハンド
        int iCompHand = new Random().nextInt(3);
        iCompHand++;

        // 整数を文字に変換(あなた)
        String sUserHand = "";
        if (iUserHand == 1) {
            sUserHand = "グー";
        } else if (iUserHand == 2) {
            sUserHand = "チョキ";
        } else {
            sUserHand = "パー";
        }

        String sCompHand = "";
        if (iCompHand == 1) {
            sCompHand = "グー";
        } else if (iCompHand == 2) {
            sCompHand = "チョキ";
        } else {
            sCompHand = "パー";
        }

        // 判定処理メソッド
        JankenJudge.judge(iUserHand, sUserHand, iCompHand, sCompHand);


    }


}
