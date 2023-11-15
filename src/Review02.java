
public class Review02 {

    public static void main(String[] args) {
        //iの値が、1から100までの間、処理を繰り返す
        for (int i = 1; i < 101;i++) {

            //その整数が3で割り切れ、なおかつ5で割り切れる数ならば
            if(i % 3 ==0 && i % 5== 0) {
            System.out.println("FizzBuzz");
            //その整数が3で割り切れる数ならば
            } else if(i % 3 == 0) {
            System.out.println("Fizz");
            //その整数が5で割り切れる数ならば
            } else if(i % 5 == 0) {
            System.out.println("Buzz");
            //それ以外の数は、その数をそのまま表示する
            } else {
            System.out.println(i);
            }
        }
    }
}