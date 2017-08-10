public class Person {
    private String firstName;

    private String lastName;

    private int age;

    public void greet() {
        System.out.println("Hello. My Name is " + firstName + " " + lastName + ". I'm " + age + " years old.");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("executing setFirstName()...");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
