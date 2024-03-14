package baitap.baitap1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //-------------------Circle-----------------
        Circle circle = new Circle(30);
        System.out.println("Circle:nhập phần trăm thay đổi");
        circle.resize(sc.nextDouble());
        //-------------------Rectangle-----------------
        Rectangle rectangle = new Rectangle(10,15);
        System.out.println("Rectangle:nhập phần trăm thay đổi");
        rectangle.resize(sc.nextDouble());
        //-------------------Square -----------------
        Square square = new Square(10);
        System.out.println("Square:nhập phần trăm thay đổi");
        square.resize(sc.nextDouble());
    }
}
