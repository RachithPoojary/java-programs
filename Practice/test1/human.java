package test1;

public class human {
   public String name;
    public int age;
    public boolean married;
    public static long population;

    public human(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
        human.population += 1;
    }
}
