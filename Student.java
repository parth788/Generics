import java.util.*;

public class Student implements Comparable<Student>{
    String name;
    Integer id;
    Student(String name, Integer id){
        this.name = name;
        this.id=id;
    }
    public String toString(){
        return (name + " " + id); 
    }
    public int compareTo(Student student){
        return name.compareTo(student.name);
    }
    public static void main(String args[]){
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Cortona", 100));
        list.add(new Student("Alexa", 101));
        list.add(new Student("Siri", 102));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}