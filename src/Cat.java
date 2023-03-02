import java.util.HashSet;
import java.util.Objects;

public class Cat {
    Integer id;
    String name;
    String breed; 
    String color;
    Integer age;
    String ownerName;

    /*public String toString(String param) {
        if (param.equals("all")) { 
            return id +", "+ name+", " + breed+", " + color+", " + age+", " + ownerName+".";
        }else{
            return name+", " + color+", " + age+".";
        }
    }*/

    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(id, cat.id) && Objects.equals(name, cat.name)
        && Objects.equals(breed, cat.breed) && Objects.equals(color, cat.color)
        && Objects.equals(age, cat.age) && Objects.equals(ownerName, cat.ownerName);
    }
    

    public int hashCode() {
        return Objects.hash(id, name, breed, color, age, ownerName);
    }

    
    
}

