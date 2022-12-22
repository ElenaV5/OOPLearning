package ru.synergy.newConstractor;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction (1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Kolin", "Oleg", 'm');
        System.out.println(oleg); //Person{firstName='Oleg', secondName='Kolin', gender=m}

        Person sasha = new Person("Hafizov"); //можно ввести и так
        System.out.println(sasha);

        Person elena = new Person("Nefedeva", "Elena", 'f');
        System.out.println(elena);

        /*
        //Принцип Наследования:
        Employee olga = new Employee();
        olga.setFirstName("Olga");
        olga.setSecondName("Svetlova");
        olga.setGender('f');
        System.out.println(olga); //Person{firstName='Olga', secondName='Svetlova', gender=f}
        //после добавления метода toString: Employee{firstName='Olga', secondName='Svetlova', gender=f}

        Person olga2 = olga;
        System.out.println(olga2); //Employee{firstName='Olga', secondName='Svetlova', gender=f}

        //Employee oleg2 = oleg; - так сделать не получится*/

        //Принцип Полиморфизма:
        Employee olga = new Employee("Svetlova", "Olga", 'f', "buhgalter");
        System.out.println(olga); //Employee{dolzhnost='buhgalter', firstName='Olga', secondName='Svetlova', gender=f}
        olga.tellMeWhoRU();

        Person olga2 = olga;
        System.out.println(olga2); //Employee{dolzhnost='buhgalter', firstName='Olga', secondName='Svetlova', gender=f}
        ((Employee)olga2).tellMeWhoRU(); //Присваиваем Person'у Employee
    }



}
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
        public Fraction add1ToNumerator(){
            this.numerator++;
            return this;
        }
        public Fraction getObjectCurrent(){
            return this;
        }

    }

    class Person {
        protected String firstName; //меняем private на protected, чтобы было видно в классе Employee
        protected String secondName;
        protected char gender; //m - male, f - female

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "ФИО='" + firstName +
                    " " + secondName + '\'' +
                    ", пол=" + gender +
                    '}';
        }

        public Person(){
            this("", "", '-');
        }

        public Person(String secondName){
            this(secondName, "", '-');
        }
        public Person(String secondName, String firstName, char gender){
            this(secondName, firstName);
            this.gender = gender;
        }
        public Person(String secondName, String firstName){
            this.firstName = firstName;
            this.secondName = secondName;

        }

    }

    class Employee extends Person {
        protected String dolzhnost;

        /*public Employee(String secondName, String dolzhnost) {
            super(secondName);
            this.dolzhnost = dolzhnost;
        }*/

        public Employee(String secondName, String firstName, char gender, String dolzhnost) {
            super(secondName, firstName, gender);
            this.dolzhnost = dolzhnost;
        }

        /*public Employee(String secondName, String firstName, String dolzhnost) {
            super(secondName, firstName);
            this.dolzhnost = dolzhnost;
        }*/

        @Override
        public String toString() {
            return "Employee{" +
                    "Должность='" + dolzhnost + '\'' +
                    ", ФИО='" + firstName +
                    " " + secondName + '\'' +
                    ", пол=" + gender +
                    '}';
        }

        /*@Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", gender=" + gender +
                    '}';
        }*/

        public void tellMeWhoRU(){
            System.out.println("Hello, I'm an employee, and my class is " + this.getClass());
        }
    }

