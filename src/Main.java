public class Main {

    public static void main(String[] args) {
        Rect rect = new Rect();
        rect.height = 10;
        rect.width = 15;
        rect.rect = new Rect();
        System.out.println(rect.width * rect.height); //150.0

    }
}