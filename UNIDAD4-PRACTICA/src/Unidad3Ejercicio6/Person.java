package Unidad3Ejercicio6;

public class Person implements Comparable<Person>{
    Name name;
    String carrera;

    public Person(Name name, String carrera) {
        this.name = name;
        this.carrera = carrera;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", carrera='" + carrera + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.name.getFirstName().charAt(0) - o.getName().getFirstName().charAt(0);
    }
}
