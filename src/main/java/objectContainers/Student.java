package objectContainers;

public class Student extends Persoana {
    public Student(String nume) {
        super(nume);
    }

    public Student(String nume, int varsta){
        super(nume, varsta);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + getNume() + '\'' +
                "varsta='" + getVarsta() + '\'' +
                '}';
    }
}
