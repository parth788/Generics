import java.util.*;
public class ArrayListGenerics {
    public static void main(String args[]){
        List<String> name = new ArrayList<String>();
        name.add("Nick");
        name.add("Jane");
        name.add("Alexa");
        // Error ----->>>>>> name.add(11);
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