package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // チーム名
    private int win;     // 勝利数
    private int lose;    // 敗北数
    private int draw;    // 引分数

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
    public double getRate() {
        double result = (double)this.win / ((double)this.win + (double)this.lose);
        return result;
    }
    // 2022年の成績結果の表示メソッド
    public void report() {
        double result = getRate();
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