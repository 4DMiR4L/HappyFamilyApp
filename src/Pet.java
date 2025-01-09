import java.util.Arrays;

public abstract class Pet {

    private Species species;
    private String nickName;
    private int age;
    private int trickLevels;
    private String[] habits;

    public static void pet() {
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am" + nickName + "I miss you!");
    }


    public Pet(Species species, String nickName, int age, int trickLevels, String[] habits) {

        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevels = trickLevels;
        this.habits = habits;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevels() {
        return trickLevels;
    }

    public void setTrickLevels(int trickLevels) {
        this.trickLevels = trickLevels;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevels=" + trickLevels +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}

