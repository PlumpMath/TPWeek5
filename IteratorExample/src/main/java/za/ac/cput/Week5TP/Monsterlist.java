package za.ac.cput.Week5TP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by student on 2015/03/13.
 */
public class Monsterlist {

    List<MonsterType> monsterTypeList;

    public Monsterlist(){
        monsterTypeList = new ArrayList<MonsterType>();
    }

    public void addMonster(MonsterType monsterType)
    {
        monsterTypeList.add(monsterType);
    }

    public Iterator<MonsterType> iterator()
    {
        return new MonsterIterator();
    }

    //_______________________________________________________________________________________
    public class MonsterIterator implements Iterator<MonsterType>{

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= monsterTypeList.size())
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        @Override
        public MonsterType next() {
            return monsterTypeList.get(currentIndex++);
        }

        @Override
        public void remove() {
            monsterTypeList.remove(--currentIndex);

        }
    }


}
