import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String args[]){
        List name = new ArrayList();
        name.add("Nick");
        name.add("Jane");
        name.add("Alexa");
        System.out.println(name);
        System.out.println(name.get(0));
        name.remove("Nick");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
        System.out.println("List contatins Nick??: "+name.indexOf("Nick"));
        Iterator i=name.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        Collections.sort(name);
    }
}