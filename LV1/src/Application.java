public class Application {
    public static void main(String[] args) {
        Tiger Firsttiger = new Tiger("东北","无畏","♂",2);
        Tiger Sceondtiger = new Tiger();
        Sceondtiger.changename("咖啡");
        Sceondtiger.changeLive("陆地");
        Sceondtiger.changesex("♀");
        Sceondtiger.changeage(3);
        Firsttiger.setcharacter("活泼");
        Sceondtiger.setcharacter("恬静");
        Firsttiger.printf();
        Sceondtiger.printf();
        Firsttiger.qq();

        Panda Firstpanda = new Panda("四川","圆圆","♀",3);
        Panda Sceondpanda = new Panda("四川","花花","♂",3);
        Firstpanda.printf();
        Sceondpanda.printf();
        Sceondpanda.qq();
    }

}
