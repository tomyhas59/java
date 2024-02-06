package monster;

public class Slime {
    double hp= 50;
    int attack=10;
    double defense=10.5;

    void attack(Slime enemy){
        enemy.hp-=attack*(1- enemy.defense);
    }
}
