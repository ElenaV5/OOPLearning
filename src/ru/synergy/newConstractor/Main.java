package ru.synergy.newConstractor;

public class Main {

    public static void main(String[] args) {
        Fraction fr = new Fraction (1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator();

        Person oleg = new Person("Kolin", "Oleg", 'm');
        System.out.println(oleg); //Person{firstName='Oleg', secondName='Kolin', gender=m}

        Person elena = new Person("Nefedeva", "Elena", 'f');
        System.out.println(elena);
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
        private String firstName;
        private String secondName;
        private char gender; //m - male, f - female

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", secondName='" + secondName + '\'' +
                    ", gender=" + gender +
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

