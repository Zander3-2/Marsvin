package MarsvinTest.java;

import java.util.Comparator;

public abstract class MarsvinNameComparator implements Comparator<Marsvin> {
    @Override
    public int compare(Marsvin m1, Marsvin m2){return m1.Getname().compareToIgnoreCase(m2.Getname());}

}