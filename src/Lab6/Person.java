package Lab6;

abstract public class Person implements Info {
    String name;
    String surname;

    public Person(String name,String surname) {
        this.surname = surname;
        this.name=name;
    }
    public Person() {
        this.surname = "surname";
        this.name="name";
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

}

class Client extends Person {
    private String bankName;

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Клиент Банка: " + bankName);
    }
}
class BankEmployee  extends Person {
    private String bankName;
    public BankEmployee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }
    @Override
    public void info() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Работник банка: " + bankName);
    }

}
interface Info {

    void info();
}