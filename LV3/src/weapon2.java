public class weapon2 extends weapon{
    @Override
    void w_skill1(){
        System.out.println("斫断黑翼的利齿");
        System.out.println("暴击率提升16%");
        double w_s2;
        w_s2 = weapon_critical_chance*(0.16);
    }
    public weapon2(String weapon_name,String type_of_weapon,String weapon_grade,int weapon_charge,double weapon_recharge){
        this.weapon_name = weapon_name;
        this.type_of_weapon = type_of_weapon;
        this.weapon_grade = weapon_grade;
        this.weapon_charge = weapon_charge;
        this.weapon_recharge = weapon_recharge;
    }
    public void pwi(){
        double m = weapon_recharge * 100.0;
        System.out.println("武器名称："+weapon_name);
        System.out.println("武器类型："+type_of_weapon);
        System.out.println("武器等级："+weapon_grade);
        System.out.println("攻击力："+weapon_charge);
        System.out.println("充能效率："+m+"%");
    }
}
