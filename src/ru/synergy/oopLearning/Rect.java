package ru.synergy.oopLearning;

class Rect {
    double width;
    double height;
    //ru.synergy.oopLearning.Rect rect;
    String nameOfRect;

    double getArea(){
        return width*height; //расчет площади прямоугольника
    }

   /* @Override
    public String toString() {
        return "ru.synergy.oopLearning.Rect{" +
                "width=" + width +
                ", height=" + height +
                ", rect=" + rect +
                '}';
    }*/

    @Override
    public String toString() {
        return "ru.synergy.oopLearning.Rect{" +
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
