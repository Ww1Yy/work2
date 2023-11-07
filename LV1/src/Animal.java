public abstract class Animal {

    public String Live;
    public String name;
    public String sex;
    public int age;
    public String character;

    abstract void eat();
    abstract void talk();
    abstract void move();

    public void changename(String name) {
        this.name = name;
    }

    public void changeLive(String live) {
        this.Live = live;
    }

    public void changesex(String sex) {
        this.sex = sex;
    }

    public void changeage(int age) {
        this.age = age;
    }

    String getName(){
        return name;
    }
    String getSex(){
        return sex;
    }
    String getLive(){
        return Live;
    }
    int getAge(){
        return age;
    }
    public void setcharacter(String character){
        this.character=character;
    }
    String getCharacter(){
        return character;
    }
    public void printf(){
        System.out.println(getLive());
        System.out.println(getSex());
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getCharacter());
    }
    public void qq(){
        eat();
        talk();
        move();
    }



}
