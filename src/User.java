import java.util.Comparator;
import static java.util.Comparator.comparing;

public class User {
    protected String name;
    protected String lastName;
    protected int age;

    public User(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    //public static final Comparator<User> BY_AGE = comparing(User::getAge);
    public static final Comparator<User> BY_AGE = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            if (o1.age != o2.age) {
                return o1.age - o2.age;
            } else {
                return o1.name.compareTo(o2.name);
            }
        }
    };

        @Override
        public String toString() {
            return name + "|" +
                    lastName + "|" +
                    age + "\t";
        }
    }

