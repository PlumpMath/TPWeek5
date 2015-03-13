package za.ac.cput.Week5TP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/11.
 */
public class Composite implements Component {

    List<Component> components = new ArrayList<Component>();

    @Override
    public void sayName() {
        for(Component count: components)
        {
            count.sayName();
        }

    }

    @Override
    public void growl() {
        for(Component count: components)
        {
            count.growl();
        }
    }

    public void add(Component component)
    {
        components.add(component);
    }

    public void remove(Component componant)
    {
        components.remove(componant);
    }

    public List<Component> getComponents()
    {
        return components;
    }

    public Component getComponent(int index)
    {
        return components.get(index);
    }
}
