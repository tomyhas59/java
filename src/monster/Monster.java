package monster;

public class Monster {

    String name;
    int hp;
    int attack;

    Monster(String name, int hp, int attack){
        this.name=name;
        this.hp=hp;
        this.attack=attack;
    }
    private static int SLIME_BASE_ATTACK = 10;

    Monster(String name, int hp){
        this.name=name;
        this.hp=hp;
        if (name.equals("슬라임")) {
            this.attack = SLIME_BASE_ATTACK;
        } else {
            // 다른 몬스터의 경우 공격력을 0으로 초기화
            this.attack = 0;
        }
    }

    void attack(Monster enemy){
        enemy.hp-=attack;
    }
    void stat(){
        System.out.printf("%s hp: %d attack: %d%n",this.name,this.hp,this.attack);
    }

     static void increaseSlimeAttack(int amount) {
        SLIME_BASE_ATTACK += amount;
    }


}
