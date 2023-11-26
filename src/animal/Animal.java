package animal;

public class Animal {
    private String name;// 名前を格納するフィールド
    private int age;// 年齢を格納するフィールド

    // コンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 名前と年齢を言うメソッド
    public void say() {
        System.out.println(name + "です。" + age + "です。");
    }
}
