package ru.synergy.oopLearning;

public class Main {

    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.height = 10;
        rect.width = 15;
        rect.nameOfRect = "I'm rect";

        Rect rect1 = new Rect();
        rect1.height = 5;
        rect1.width = 25;
        rect1.nameOfRect = "I'm rect1";

        Rect rect2 = new Rect();
        rect2.height = 20;
        rect2.width = 4;
        rect2.nameOfRect = "I'm rect2";

        //System.out.println(rect.width * rect.height); //150.0
        /*System.out.println(rect == rect1); //false - треугольники не равны
        System.out.println(rect1);
        rect1 = rect;
        System.out.println(rect == rect1);
        System.out.println(rect1); //ru.synergy.oopLearning.Rect{width=15.0, height=10.0, rect=null}
        */
/*        System.out.println(rect.getArea()); //150.0 - 18.32
        System.out.println(rect1.getArea()); //125.0 25*5
        System.out.println(rect2.getArea()); //80.0 = 20*4

        //метод модернизирующий значение внутри класса
        rect2.maignify(1.5);
        System.out.println(rect2.getArea()); //30*6 = 180.0
*/
/*        ru.synergy.oopLearning.Point point1 = new ru.synergy.oopLearning.Point();
        ru.synergy.oopLearning.Point point2 = new ru.synergy.oopLearning.Point();

        point1.input();
        System.out.println(point1);
        point2.input();
        System.out.println(point2);

        System.out.println(point1.getDinstance(point2));

        System.out.println("Start moving the point1");
        point1.move(100, 120);
        System.out.println(point1);
        System.out.println(point1.getDinstance(point2));
*/

        Double number = Double.valueOf(10.0);
        double numberCopy = number.doubleValue();
        number.toString();
        String a = "156";
        Integer interger = Integer.parseInt(a); //преобразует текстовое значение в число
        System.out.println("Значение a = " + a); //156
        //Integer.toOctalString(a); //переводит в 8 и 16ю систему //ошибка!
        //System.out.println("Значение a = " + a); //ошибка!
        int c = interger; //автораспаковка
        //System.out.println("Значение c = " + с); //ошибка!
        interger = c; //автоупаковка





    }
}