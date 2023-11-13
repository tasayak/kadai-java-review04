
public class Review {

    public static void main(String[] args) {
        double excludingTax = 1500;//double型変数excludingTaxを宣言し、1500を代入
        double tax = 0.1;//double型変数taxを宣言し、0.1を代入
        double result = taxMethod(excludingTax, tax);

        //1500円の商品の税込価格は1650円（消費税は150円）です。と出力
        System.out.println(excludingTax + "円の商品の税込価格は"+ (excludingTax + result) + "円（消費税は"+ result + "円）です。");
}

        public static double taxMethod(double excludingTax, double tax) {
        double result = excludingTax * tax ;
        return result;
    }
}