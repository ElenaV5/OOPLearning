package ru.synergy.constractorTest;

public class Main {

    public static final Integer KOEFF = 100; //Хранится как константа и только(!)
    public static void main(String[] args){

        //Person person = new Person( "Elena", 37, "Ilicha, 82", "922-119-1241");
        Person person = new Person("Elena", 37);

        Person.getCounter(); //счетчик людей, которых мы создали (сколько)

        Fraction fraction = new Fraction(1,10); // конструктор по умолчанию

    }
}


class Person {
    int id;
    private String name;
    //protected int age;
    //public String address;
    //private String phone;
    private int age;

    private static int counter = 0;
    static {
        //name = "Unknown"; //работает только при privet static String name - применение: счетчиках
        System.out.println(counter);
    }

    /*public Person(String name, int age, String address, String phone){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }*/
    public Person(String name, int age){
        id = counter++;
        this.name = name;
        this.age = age;
    }

    /*public void displayName(){
        System.out.printf("Name %s \n", name);
    }

    void displayAge(){
        System.out.printf("Age %d \n", age);
    }*/

    /*private void displayAddress(){
        System.out.printf("Address %s \n", address);
    }

    protected void displayPhone(){
        System.out.printf("Phone %s \n", phone);
    }*/

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >=0 && age <= 150){
            this.age = age;
        } else System.out.println("Возраст должен быть от 0 до 150!");

    }
}

// конструкторы (fraction)
class Fraction {
    int numerator; //числитель
    int denominator = 1; //знаменатель
    public Fraction(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;  //this - ссылка на объект
        this.denominator = denominator;
    }

}