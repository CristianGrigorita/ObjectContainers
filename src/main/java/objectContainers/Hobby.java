package objectContainers;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
//    private Address addresses;
    private ArrayList<Address> addresses = new ArrayList<>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        //default addresses.
        addresses.add(new Address("Cluj-Napoca"));
        addresses.add(new Address("Timisoara"));
        addresses.add(new Address("Oradea"));
    }

    public Hobby(String name, int frequency, ArrayList<Address> addresses){
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public int getFrequency() {
        return frequency;
    }

    @Override
    public String toString(){
        return "\n Hobby{" +
                "name='" + name + '\'' +
                " frequency ='" + frequency + '\'' + " per week" +
                " addresses ='" + addresses + '\'' +
                '}' + '\n';
    }
}
