package objectContainers;

import java.util.*;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Persoana> persons = new TreeSet<>();
        persons.add(new Persoana("Georgel", 12));
        persons.add(new Persoana("Alina", 22));

        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        persons.add(new Persoana("Bianca", 42));

        System.out.println("--");
        for (Persoana persoana: persons) {
            System.out.println(persoana);
        }

        AgeComparator ageComparator = new AgeComparator();
        Set<Persoana> ageSortedPersons = new TreeSet<>(ageComparator);
        ageSortedPersons.addAll(persons);

        System.out.println("--");
        for (Persoana persoana: ageSortedPersons) {
            System.out.println(persoana);
        }


        System.out.println("--");
        System.out.println("Persoane cu hobbyuri: ");

        // Adding addresses for the skydiving hobby
        ArrayList<Address> skydivingAddresses = new ArrayList<>();
        skydivingAddresses.add(new Address("Cluj-Napoca"));
        skydivingAddresses.add(new Address("Tuzla"));
        skydivingAddresses.add(new Address("Bucuresti"));


        List<Hobby> alinaHobbies = new ArrayList<>();
        // Skydiving with addresses added
        alinaHobbies.add(new Hobby("Skydiving", 2, skydivingAddresses));
        alinaHobbies.add(new Hobby("Drawing", 5));

        ArrayList<Address> footballAddresses = new ArrayList<>();
        footballAddresses.add(new Address("Cluj-Napoca"));
        List<Hobby> jackHobbies = new ArrayList<>();
        jackHobbies.add(new Hobby("Footbal", 5, footballAddresses));

        HashMap<Persoana, List<Hobby>> persWithHobby = new HashMap<>();

        persWithHobby.put(new Persoana("Alina", 41), alinaHobbies);
        persWithHobby.put(new Persoana("Jack", 4), jackHobbies);

        System.out.println(persWithHobby);
    }
}
