import java.util.LinkedList;

class Student{
    int id;
    String name;
    Student(int id , String name){
        this.id = id;
        this.name = name;
    }
}

public class ReverseLinkedList {

    static LinkedList<Student> reverseLinkedList(LinkedList<Student> list){
        LinkedList<Student> reversedList = new LinkedList<Student>();
        for(Student student : list){
            reversedList.addFirst(student);
        }
        return reversedList;
    }

    public static void main(String[] args){

        //New Linked List
        LinkedList<Student> linkedList = new LinkedList<Student>();

        //Creating Student Objects
        Student s1 = new Student(1, "Sakib");
        Student s2 = new Student(2, "Rakib");

        //Adding objects to linkedList
        linkedList.add(s1);
        linkedList.add(s2);

        LinkedList<Student> newReversedList = reverseLinkedList(linkedList);

        for (Student student : newReversedList) System.out.println(student.name);

    }
}
