public class Main {

    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.height = 10;
        rect.width = 15;

        Rect rect1 = new Rect();
        rect1.height = 5;
        rect1.width = 25;

        Rect rect2 = new Rect();
        rect2.height = 20;
        rect2.width = 4;

        //System.out.println(rect.width * rect.height); //150.0
        System.out.println(rect == rect1); //false - треугольники не равны
    }
}