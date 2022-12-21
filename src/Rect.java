class Rect {
    double width;
    double height;
    //Rect rect;
    String nameOfRect;

    double getArea(){
        return width*height; //расчет площади прямоугольника
    }

   /* @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", rect=" + rect +
                '}';
    }*/

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }

    void maignify(double koeff){
        width *= koeff;
        height *= koeff;

    }
}
