import java.util.*;

class  Estudiante implements Comparable<Estudiante> {
    private String name;
    private double average;

    public Estudiante(String name, double average) {
        this.name = name;
        this.average = average;
    }

    @Override
    public int compareTo(Estudiante b) {
        return -Double.compare(this.average, b.average);
    }

    @Override
    public String toString() {
        return name + " (" + average + ")";
    }
}

public class Ejm1 {
    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("a", 2.2));
        estudiantes.add(new Estudiante("b", 3.1));
        estudiantes.add(new Estudiante("b", 4.5));
        estudiantes.add(new Estudiante("d", 5.3));

        Collections.sort(estudiantes);

        for (Estudiante e : estudiantes) {
            System.out.println(e);

        }
    }
}





