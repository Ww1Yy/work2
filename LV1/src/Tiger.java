public class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("吃肉");
    }

    @Override
    void talk() {
        System.out.println("嗷嗷嗷");
    }

    @Override
    void move() {
        System.out.println("四足奔跑");
    }

    public Tiger(String Live, String name, String sex, int age) {
        this.Live = Live;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public Tiger(){

    }

}
