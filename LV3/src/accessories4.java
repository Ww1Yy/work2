public class accessories4 extends accessories {
    public accessories4(String accessories_name,int accessories_health,int accessories_defense,int accessories_charge,double accessories_critical_chance,double accessories_critical_hit){
        this.accessories_name = accessories_name;
        this.accessories_health = accessories_health;
        this.accessories_defense = accessories_defense;
        this.accessories_charge = accessories_charge;
        this.accessories_critical_chance = accessories_critical_chance;
        this.accessories_critical_hit = accessories_critical_hit;
    }
    public void pai(){
        System.out.println("名称："+accessories_name);
        System.out.println("主词条");
        System.out.println("暴击率："+accessories_critical_chance);
        System.out.println("副词条");
        System.out.println("生命值："+accessories_health);
        System.out.println("防御力："+accessories_defense);
        System.out.println("攻击力："+accessories_charge);
        System.out.println("暴击伤害："+accessories_critical_hit);
    }
}
