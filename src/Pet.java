import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Pet {

    private Species species;
    private String nickName;
    private int age;
    private int trickLevels;
    private List<String> habits = new ArrayList<>();


    public static void pet() {
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am" + nickName + "I miss you!");
    }


    public Pet(Species species, String nickName, int age, int trickLevels, List<String> habits) {
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

    public List<String> getHabits() {
        return habits;
    }

    public void setHabits(List<String> habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pet pet)) return false;
        return age == pet.age && trickLevels == pet.trickLevels && species == pet.species && Objects.equals(nickName, pet.nickName) && Objects.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickName, age, trickLevels, habits);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevels=" + trickLevels +
                ", habits=" + habits +
                '}';
    }
}

