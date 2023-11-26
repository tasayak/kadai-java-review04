package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; // 趣味の情報を保管するフィールド

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // コンストラクタ
    public Human() {
    }

    // 引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);// スーパークラスのコンストラクタを呼び出し
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}