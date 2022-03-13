package udemy.interfaces.interfaceExercise;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private  String name;
    private int hitPoints;
    private int stregth;

    public Monster(String name, int hitPoints, int stregth) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.stregth = stregth;
    }

    @Override
    public List<String> write() {
        List<String> values=new ArrayList<>();
        values.add(0, this.name);
        values.add(0, ""+this.hitPoints);
        values.add(0, ""+this.stregth);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues!=null && savedValues.size()>0){
            this.name=savedValues.get(0);
            this.hitPoints=Integer.parseInt(savedValues.get(1));
            this.stregth=Integer.parseInt(savedValues.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", stregth=" + stregth +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return stregth;
    }
}
