package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/07.
 */
public class TestBuilder extends TestCase{


    MonsterBuilder zbuilder;
    MonsterBuilder mbuilder;
    Monster zom;

    MonsterDirector zdirect;
    MonsterDirector mdirect;
    Monster mum;

    @Override
    public void setUp() throws Exception {
        zbuilder = new ZombieMonsterBuilder();
        zdirect = new MonsterDirector(zbuilder);
        zdirect.constructMonsters();
        zom = zdirect.getMonster();


        mbuilder = new MummyMonsterBuilder();
        mdirect = new MonsterDirector(mbuilder);
        mdirect.constructMonsters();
        mum = mdirect.getMonster();


    }

    public void testBuilder() throws Exception {

        assertTrue(mum.getName() == "Mummy");
        assertTrue(zom.getName() == "Zombie");



    }
}
