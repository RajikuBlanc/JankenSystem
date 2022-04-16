package com.example;

public class JankenJudge {
    public static void judge(int iUserHand, String sUserHand, int iCompHand, String sCompHand) {
        String text = "あなた:" + sUserHand + "相手:" + sCompHand;
        // ユーザーがグーを選択した場合
        if (iUserHand == 1) {
            switch (iCompHand) {
                case 1 -> {
                    System.out.println(text);
                    judgeText("draw");
                    Janken.janken();
                }
                case 2 -> {
                    System.out.println(text);
                    judgeText("win");
                }
                case 3 -> {
                    System.out.println(text);
                    judgeText("lose");
                }

            }
        }
        // ユーザーがチョキを選択した場合
        if (iUserHand == 2) {
            switch (iCompHand) {
                case 1 -> {
                    System.out.println(text);
                    judgeText("lose");
                }
                case 2 -> {
                    System.out.println(text);
                    judgeText("draw");
                    Janken.janken();
                }
                case 3 -> {
                    System.out.println(text);
                    judgeText("win");
                }

            }
        }
        // ユーザーがパーを出した場合
        if (iUserHand == 3) {
            switch (iCompHand) {
                case 1 -> {
                    System.out.println(text);
                    judgeText("win");
                }
                case 2 -> {
                    System.out.println(text);
                    judgeText("lose");
                }
                case 3 -> {
                    System.out.println(text);
                    judgeText("draw");
                    Janken.janken();
                }
            }
        }
    }

    public static void judgeText(String judge) {
        // 勝った時に表示される文章
        String winText = "あなたの勝ちです。おめでとう！";
        // 負けた時に表示される文章
        String loseText = "あなたの負けです。残念でした。";
        // 引き分けの時に表示される文章
        String drawText = "あいこです。もう１度！";
        switch (judge) {
            case "win" -> System.out.println(winText);
            case "lose" -> System.out.println(loseText);
            case "draw" -> System.out.println(drawText);
        }
    }
}
