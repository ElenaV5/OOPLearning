package ru.synergy.oopLearning;

import java.util.Scanner;

public class Point {
    //double x, y;
    private double x, y;

    public double getX(){
        if(x == 0 && y == 0){
            System.out.println("Возможно вы забыли инициализировать поля");
        }
        return x;
    }

    public double getY(){
        if(x == 0 && y == 0){
            System.out.println("Возможно вы забыли инициализировать поля");
        }
        return y;
    }

    void move(double dx, double dy){
        x += dx;
        y += dy;
    }

    void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x: ");
        double x = in.nextDouble();
        System.out.println("Enter y: ");
        double y = in.nextDouble();

        move(x, y);
    }

    double getDinstance(Point a){
        return Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2));
    }

    @Override
    public String toString() {
        return "ru.synergy.oopLearning.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
