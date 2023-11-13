
public class Review01 {

    public static void main(String[] args) {
        double excludingTax = 1500;//double型変数excludingTaxを宣言し、1500を代入
        double taxRate = 0.1;//double型変数taxRateを宣言し、0.1を代入
        double result = tax(excludingTax, taxRate);

        //1500円の商品の税込価格は1650円（消費税は150円）です。と出力
        System.out.println((int) excludingTax + "円の商品の税込価格は"+ ((int) excludingTax + (int) result) + "円（消費税は"+ (int) result + "円）です。");
    }
        //double型変数2つを受け取り、乗算結果を表示するtaxメソッドの定義
        public static double tax(double excludingTax, double taxRate) {
        double result = excludingTax * taxRate;
        return result;
    }
}