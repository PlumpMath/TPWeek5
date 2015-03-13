package za.ac.cput.Week5TP;

import junit.framework.TestCase;

/**
 * Created by student on 2015/03/13.
 */
public class TestChain extends TestCase {


    MonsterHandler chain;

    @Override
    public void setUp() throws Exception {

        chain = setUpChain();
    }

    public static MonsterHandler setUpChain() {
        MonsterHandler zombieHandler = new ZombieHandler();
        MonsterHandler mummyHandler = new Mummyhandler();
        MonsterHandler wolfHandler = new WolfHandler();

        zombieHandler.setMonsterHandler(mummyHandler);
        mummyHandler.setMonsterHandler(wolfHandler);

        return zombieHandler;
    }

    public void testChain() throws Exception {

        assertEquals(chain.handleRequest(MonsterEnum.Zombie), "Zombie");
        assertEquals(chain.handleRequest(MonsterEnum.Mummy), "Empty");      //Do not know why it will not go to the next phase in the chain
        assertEquals(chain.handleRequest(MonsterEnum.Wolf) , "Empty");

    }



}
