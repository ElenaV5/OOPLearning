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
        System.out.println(rect == rect1); //false - треугольники не равны
        System.out.println(rect1);
        rect1 = rect;
        System.out.println(rect == rect1);
        System.out.println(rect1); //Rect{width=15.0, height=10.0, rect=null}
    }
}