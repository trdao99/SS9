package baitap.baitap4;

public class Main {
    public static void main(String[] args) {
        Shape hinhChuNhat = new Rectangle("do", 3.5, 5.5);
        hinhChuNhat.disPlay();
        hinhChuNhat.getArea();
        System.out.println("diện tích hình chữ nhật là: "+hinhChuNhat.getArea());



        Shape hinhTron = new Circle("xanh", 5.7);
        hinhTron.disPlay();
        hinhChuNhat.getArea();
        System.out.println("diện tích hình tròn là: "+hinhTron.getArea());

    }
}
