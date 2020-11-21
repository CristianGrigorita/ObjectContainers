package objectContainers;

public class Angajat extends Persoana {
    public Angajat(String nume) {
        super(nume);
    }

    public Angajat(String nume, int varsta){
        super(nume, varsta);
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + getNume() + '\'' +
                "varsta='" + getVarsta() + '\'' +
                '}';
    }
}
