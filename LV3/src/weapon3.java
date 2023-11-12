public class weapon3 extends weapon{
    @Override
    void w_skill1(){
        System.out.println("矢志不忘");
        System.out.println("24%伤害加成");
        double w_s3;
        w_s3 = weapon_charge*(0.24);
    }
    public weapon3(String weapon_name,String type_of_weapon,String weapon_grade,int weapon_charge){
        this.weapon_name = weapon_name;
        this.type_of_weapon = type_of_weapon;
        this.weapon_grade = weapon_grade;
        this.weapon_charge = weapon_charge;
    }
    public void pwi(){
        //double m = weapon_charge * (1.0+0.24);
        System.out.println("武器名称："+weapon_name);
        System.out.println("武器类型："+type_of_weapon);
        System.out.println("武器等级："+weapon_grade);
        //System.out.println("攻击力："+m);
    }
}
