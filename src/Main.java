import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //creating users;
        List<User> userArrayList=new ArrayList<>();
        List<User> userLinkedList =new LinkedList<>();

        Collections.addAll(userArrayList,
                new User("kuba","Szczygiel",27),
                new User("Malgorzata", "Majchrowicz", 37),
                new User("Nikodem", "Zalewski",29),
                new User("Pimpek","Ogoniasty",3),
                new User ("Andrzej","Wiesiol",45));

        userLinkedList.addAll(userArrayList);

       superFunkcja(userArrayList);
       superFunkcja(userLinkedList);

    }
   public static List superFunkcja(List<User> list)
    {
        System.out.println( "\n" + "LINKED LIST");
        list.addAll(list);
        System.out.println("Not sorted" + "\t" + list);
        //sorting
        list.sort(User.BY_AGE);
        System.out.println("Sorted by age" + "\t" + list);
        //shuffle
        Collections.shuffle(list);
        System.out.println("shuffled" + "\t" + list);
        Collections.shuffle(list);
        System.out.println("shuffled once again" + "\t" + list);
        return list;
    }
}
