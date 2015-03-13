package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class ZombieMonsterBuilder implements MonsterBuilder{



    private Monster monster;

    public ZombieMonsterBuilder(){
        monster = new Monster();
    }

    @Override
    public void buildName() {
        monster.setName("Zombie");
    }

    @Override
    public void buildSpeed() {
        monster.setSpeed(0);

    }

    @Override
    public void buildStrength() {
        monster.setStrength(10);

    }

    @Override
    public void buildIntel() {
        monster.setIntel(5);
    }

    @Override
    public Monster getMon() {
        return monster;
    }


}
