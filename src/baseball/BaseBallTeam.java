package baseball;

public class BaseBallTeam {
    // フィールド
    public String name; // チーム名
    public int win;     // 勝利数
    public int lose;    // 敗北数
    public int draw;    // 引分数

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    //勝率計算メソッド
    public static double getRate(int win, int lose) {
        double result = (double)(win / (win + lose));
        return result;
    }
    // 2022年の成績結果の表示メソッド
    public void report() {
        System.out.println(this.name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + result + "です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}