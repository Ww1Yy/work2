public class weapon1 extends weapon {
    @Override
    void w_skill1(){
        System.out.println("雾切御腰物");
        System.out.println("24%伤害加成");
        double w_s1;
        w_s1 = weapon_charge*(0.24);
    }
    public weapon1(String weapon_name,String type_of_weapon,String weapon_grade,int weapon_charge,double weapon_critical_hit){
        this.weapon_name = weapon_name;
        this.type_of_weapon = type_of_weapon;
        this.weapon_grade = weapon_grade;
        this.weapon_charge = weapon_charge;
        this.weapon_critical_hit = weapon_critical_hit;
    }
    public void pwi(){
        double m = weapon_critical_hit * 100.0;
        System.out.println("武器名称："+weapon_name);
        System.out.println("武器类型："+type_of_weapon);
        System.out.println("武器等级："+weapon_grade);
        System.out.println("攻击力："+weapon_charge);
        System.out.println("暴击伤害："+m+"%");
    }
}
