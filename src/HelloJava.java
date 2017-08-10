import org.javaclublviv.pojo.Person;

public class HelloJava {

    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Igor");
        p.setLastName("Banadiga");
        p.setAge(35);

        p.greet();

    }

}
