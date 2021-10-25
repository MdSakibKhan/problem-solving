import java.util.HashSet;
import java.util.Set;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

public class ImplementSet {
    public static void main(String []args){
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("Sakib"));
        set.add(new Person("Rakib"));

        for(Person person : set){
            System.out.println(person.name);
        }
    }
}
