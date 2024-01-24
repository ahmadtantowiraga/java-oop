package com.enigma.java_oop.object_interaction;

public class Monster {
    private String name;
    private Integer hp;
    private Integer damage;

    public Monster(String name, Integer hp, Integer damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }
    public void attack(Monster monster){
        if (this.equals(monster)){
            System.out.println("Tidak bisa menyerang diri sendiri");
        }else{
            monster.hp-=this.hp;
        }
    }

    public void attack(Hero hero){
        hero.setHp(hero.getHp()-this.damage);
    }

    public void displayHp(){
        System.out.println("HP dari "+ this.name+ " adalah "+this.hp);
        System.out.println();
    }
}
