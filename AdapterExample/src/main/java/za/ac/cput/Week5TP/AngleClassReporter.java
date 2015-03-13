package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/11.
 */
public class AngleClassReporter extends DegreesReporter implements AngleInfo{


    @Override
    public int getAngleInDegrees() {
        return angleInDegrees;
    }


    @Override
    public int getAngleInRadions() {
        return dToR(angleInDegrees);
    }

    @Override
    public void setAngleInRadions(int angleInRadions) {
        this.angleInDegrees = rToD(angleInRadions);
    }

    @Override
      public void setAngleInDegrees(int angleInDegrees) {
        this.angleInDegrees = angleInDegrees;
    }

    private int rToD(int f)
    {
        return (f * 2);
    }

    private int dToR(int d)
    {
        return(d/2);
    }

}
