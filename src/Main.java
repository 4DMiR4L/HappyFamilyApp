import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        List<List<String>> schedule = new ArrayList<>();
        schedule.add(List.of("Monday", "Study math"));
        schedule.add(List.of("Tuesday", "Play football"));
        schedule.add(List.of("Wednesday", "Read book"));
        schedule.add(List.of("Thursday", "Dance"));
        schedule.add(List.of("Friday", "Go to the park"));
        schedule.add(List.of("Saturday", "Watch TV"));
        schedule.add(List.of("Sunday", "Rest"));

        Pet dog = new Dog(Species.DOG, "a", 75, 6, List.of(new String[]{"eat", "drink", "sleep"}));
        Pet cat = new DomesticCat(Species.DomesticCat, "b", 50, 5, List.of(new String[]{"play", "sleep"}));

        Human mother = new Woman("Jane", "Karleone", 1977, 90, dog, null, schedule);
        Human father = new Man("Vito", "Karleone", 1975, 95, cat, null, schedule);

        Family family = new Family(mother, father);

        Human child = new Human("Michael", "Karleone", 2000, 85, dog, family, schedule);

        child.greetPet();
        child.describePet();

        boolean feed = child.feedPet(true);

        System.out.println(child);

        family.addChild(child);
        System.out.println("Family members count: " + family.countFamily());

        family.deleteChild(child);
        System.out.println("Family members count after deletion: " + family.countFamily());

        System.out.println(family);
    }
}
