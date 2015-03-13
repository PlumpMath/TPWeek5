package za.ac.cput.Week5TP.AbstractFactory;

import za.ac.cput.Week5TP.HumanFactory.HumanFactory;
import za.ac.cput.Week5TP.HumanoidFactory.Humanoid;
import za.ac.cput.Week5TP.HumanoidFactory.HumanoidFactory;
import za.ac.cput.Week5TP.MonsterFactory.MonsterFactory;

/**
 * Created by student on 2015/03/07.
 */
public class AbstractFactory {

  public HumanoidFactory getHumanoidType(String type)
  {
      if(type.equals("Monster"))
      {
          return new MonsterFactory();
      }
      else
      {
          return new HumanFactory();
      }



  }





}
