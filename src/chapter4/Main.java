package chapter4;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Person(new Label("Alice"), new Label("alice@example.com")),
            new Person(new Label("Bobby"), new Label("bpbby@example.com")),
            new Person(new Label("Chris")),
        };

        for (Person p : people) {
            System.out.println(p.toString());
            p.display();
            System.out.println("");
        }
    }
}
