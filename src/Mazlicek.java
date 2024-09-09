public class Mazlicek {
    public String name;
    public String druh;
    public int age;
    public double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDruh() {
        return druh;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Mazlicek(String name, String druh, int age, double weight) {
        this.name = name;
        this.druh = druh;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", druh='" + druh + '\'' +
                ", age=" + age +
                ", weight=" + weight;
    }
}

