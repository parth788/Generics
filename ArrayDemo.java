import java.util.Arrays;

class ArrayDemo{
    public static void main(String args[]) {
        String[] name = new String[5];
        name[0]="Roy";
        name[1]="Nick";
        name[2]="Jane";
        name[3]="Den";
        name[4]="San";
        //How to add element in between?
        //Can I search element from the list?
        //If i want add more number of elements?

        Arrays.sort(name);
        for(int i=0;i<name.length;i++)
        System.out.println(name[i]);
    }
}