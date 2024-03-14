package baitap.baitap2;

public class main {
    public static void main(String[] args) {
        GeometricShape[] shapes = new GeometricShape[2];
        shapes[0] = new Cicle(5, 2*3.14*5);
        shapes[1] = new Square(3);

        for (GeometricShape shape : shapes) {
            if(shape instanceof Colorable){
                Colorable colorableShape = (Colorable) shape;
                colorableShape.howToColor();
            }
            System.out.println(shape.toString());
        }
    }
}



