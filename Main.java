package com.company;

public class Main {



    public static void main(String[] args) {
        Boss boss = new Boss( 10, 22.2," Скорость. ", new Weapon("Автомат.", "Калашникова."));

        System.out.println("Название оружия: " + boss.getWeapon().getName()+ " тип оружия: " +
                boss.getWeapon().getType()+ " урон: " +boss.getDamage() + ". здоровье: " +boss.getHealth()+ ". СуперСпособность: " +boss.getSuperAbilities());



    }
}