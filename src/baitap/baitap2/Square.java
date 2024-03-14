package baitap.baitap2;

public class Square extends GeometricShape implements Colorable  {
    public Square() {
    }

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
public String toString(){
     System.out.println("side: "+this.getSide());
return"--------------";
}

    @Override
    public void howToColor() {
        System.out.println("Color all four side is blue");
    }
}
