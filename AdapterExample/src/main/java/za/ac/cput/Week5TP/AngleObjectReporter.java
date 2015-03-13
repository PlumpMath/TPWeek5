package za.ac.cput.Week5TP;

/**
 * Created by student on 2015/03/11.
 */
public class AngleObjectReporter implements  AngleInfo{

    DegreesReporter reporter;

    public AngleObjectReporter()
    {
        reporter = new DegreesReporter();
    }

    @Override
    public int getAngleInDegrees() {
       return reporter.getAngle();
    }

    @Override
    public int getAngleInRadions() {

        return dToR(reporter.getAngle());
    }

    @Override
    public void setAngleInDegrees(int angleInDegrees) {

        reporter.setAngle(angleInDegrees);
    }


    @Override
    public void setAngleInRadions(int angleInRadions) {

        reporter.setAngle(rToD(angleInRadions));
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
