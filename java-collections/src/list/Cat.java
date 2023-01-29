package list;

public class Cat implements Comparable<Cat>{
    private final String name;
    private final Integer age;
    private final String color;

    public Cat(final String name, final Integer age, final String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat [ name= " + name + ", age= " + age + ", color= " + color + " ]";
    }

    @Override
    public int compareTo(Cat cat) {
        return this.getName().compareToIgnoreCase(cat.getName());
    }

    

}
