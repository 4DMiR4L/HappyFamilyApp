import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int IQ;
    private Pet pet;
    private Family family;
    private String[][] shedule;


    public void greetPet() {
        System.out.println("hello," + pet.getNickName());
    }

    public boolean feedPet(boolean isHungry) {
        if (isHungry) {
            System.out.println("Hm... I will feed " + pet.getNickName());
            pet.eat(); // Pet-in yemək metodunu çağırır
        }
        return true;
    }

    public void describePet() {
        String slyness = pet.getTrickLevels() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have an" + pet.getNickName() + "is" + pet.getAge() + " years old" + "he is" + slyness);
    }

    public Human(String name, String surname, int dateOfBirth, int IQ, Pet pet, Family family, String[][] shedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.IQ = IQ;
        this.pet = pet;
        this.family = family;
        this.shedule = shedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getShedule() {
        return shedule;
    }

    public void setShedule(String[][] shedule) {
        this.shedule = shedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", IQ=" + IQ +
                ", pet=" + pet +
                ", family=" + family +
                ", shedule=" + Arrays.toString(shedule) +
                '}';
    }
}
