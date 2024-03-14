package baitap.baitap2;

public class Cicle extends GeometricShape{
    private int radius;


    public Cicle() {
    }

    public Cicle(int radius, double area) {
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }




    @Override
    public String toString(){
        System.out.println("radius  "+ this.getRadius());
        System.out.println("area  "+ (float)(this.radius*2*3.14));
        return"--------------";
    }


}
