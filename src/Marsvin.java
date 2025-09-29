public class Marsvin {
    private String name;
    private String race;
    private int fodder;

    public Marsvin(String name, String race, int foder) {
        this.name = name;
        this.race = race;
        this.fodder = fodder;
    }
public String Getname(){return name;}
public String Getrace(){return race;}
public int Getfodder(){return fodder;}

public void Setname(String name){this.name = name;}
public void Setrace(String race){this.race = race;}
public void Setfodder(int fodder){this.fodder = fodder;}

    @Override
    public String toString(){
    return "";
    }
}

