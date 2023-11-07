public class Panda extends Animal {
    @Override
    void eat() {
        System.out.println("吃竹子");
    }

    @Override
    void talk() {
        System.out.println("嘤嘤嘤");
    }

    @Override
    void move() {
        System.out.println("不爱动");
    }


    public Panda(String Live, String name, String sex, int age) {
        this.Live = Live;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


}
