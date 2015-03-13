package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/07.
 */
public class MummyMonsterBuilder implements MonsterBuilder{


    private Monster monster;

    public MummyMonsterBuilder(){
        monster = new Monster();
    }

    @Override
    public void buildName() {
        monster.setName("Mummy");
    }

    @Override
    public void buildSpeed() {
        monster.setSpeed(10);

    }

    @Override
    public void buildStrength() {
        monster.setStrength(5);

    }

    @Override
    public void buildIntel() {
        monster.setIntel(0);
    }

    @Override
    public Monster getMon() {
        return monster;
    }


}
