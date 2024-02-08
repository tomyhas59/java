package monster;

public class Main {
    public static void main(String[] args) {

      Monster[] monsters={
              new Monster("슬라임",100,10),
              new Monster("골렘",500,20),
              new Monster("악마",1000,50),
      };

        for(Monster monster:monsters){
           monster.stat();
        }
        Monster.increaseSlimeAttack(1);

        Monster newSlime=new Monster("슬라임",100);

        newSlime.stat();
    }

}
