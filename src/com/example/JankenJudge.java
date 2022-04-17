package com.example;

public class JankenJudge {
    public static void judge(int iUserHand, int iCompHand) {
        // 整数(1~3)を文字(1:グー、2:チョキ、3:パー)に変換
        String sUserHand = stringHand(iUserHand); // User
        String sCompHand = stringHand(iCompHand); // Computer
        // ハンド確認テキスト
        String text = "あなた:" + sUserHand + "相手:" + sCompHand;
        // ユーザーがグーを選択した場合
        if (iUserHand == 1) {
            switch (iCompHand) {
                case 1 -> drawText(text);

                case 2 -> winText(text);

                case 3 -> loseText(text);


            }
        }
        // ユーザーがチョキを選択した場合
        if (iUserHand == 2) {
            switch (iCompHand) {
                case 1 -> loseText(text);

                case 2 -> drawText(text);

                case 3 -> winText(text);


            }
        }
        // ユーザーがパーを出した場合
        if (iUserHand == 3) {
            switch (iCompHand) {
                case 1 -> winText(text);

                case 2 -> loseText(text);

                case 3 -> drawText(text);

            }
        }
    }

    // あいこの場合の処理
    public static void drawText(String text) {
        System.out.println(text);
        System.out.println("あいこです。もう１度！");
        JankenMain.jankenHand();
    }

    // 勝った場合の処理
    public static void winText(String text) {
        System.out.println(text);
        System.out.println("あなたの勝ちです。おめでとう！");
    }

    // 負けた場合の処理
    public static void loseText(String text) {
        System.out.println(text);
        System.out.println("あなたの負けです。残念でした。");
    }

    // 入力された整数を文字列(1=グー、2=チョキ、3=パー)に変換する
    public static String stringHand(int hand) {
        String sHand;
        if (hand == 1) {
            sHand = "グー";
        } else if (hand == 2) {
            sHand = "チョキ";
        } else {
            sHand = "パー";
        }
        return sHand;
    }

}
