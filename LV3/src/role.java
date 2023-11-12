public abstract class role {
    public String name;  //角色名
    public String attribute; //角色属性
    public String sex;//角色性别
    public int grade;//角色等级
    public String character;//角色性格
    public String hobby;//角色爱好
    public String like_eat;//角色喜欢和食物


    public int health; //角色生命值
    public int defense; //角色防御力
    public int charge; //角色攻击力
    public double critical_chance; //角色暴击率
    public double critical_hit; //角色暴击伤害

    public void pei() {
        System.out.println("姓名：" + name);
        System.out.println("性别：" + sex);
        System.out.println("属性：" + attribute);
        System.out.println("等级:" + grade);
        System.out.println("性格：" + character);
        System.out.println("爱好：" + hobby);
        System.out.println("喜欢吃的食物：" + like_eat);
    }//打印角色信息

    public void pnv() {
        System.out.println("生命值：" + health);
        System.out.println("攻击力：" + charge);
        System.out.println("防御力：" + defense);
        System.out.println("暴击率" + critical_chance);
        System.out.println("暴击伤害" + critical_hit);
    }//打印角色数值

}
