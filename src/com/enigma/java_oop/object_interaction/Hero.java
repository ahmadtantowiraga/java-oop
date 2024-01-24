package com.enigma.java_oop.object_interaction;

public class Hero {
    private String name;
    private Integer hp;
    private Integer damage;

    public Hero(String name, Integer hp, Integer damage) {
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

    public void attack(Hero hero) {
        if (this.equals(hero)) {
            System.out.println("tidak bisa menyerang diri sendiri");
        } else {
            if (hero.hp <= this.damage) {
                hero.hp = 0;
            } else {
                hero.hp -= this.damage;
            }
        }
    }
    public void attack(Monster monster){
        if (monster.getHp() > this.damage){
            monster.setHp(monster.getHp()-this.damage);
        }else{
            monster.setHp(0);
        }

    }
    public void displayHp(){
        System.out.println("HP dari "+ this.name+ " adalah "+this.hp);
        System.out.println();
    }
}
