package baitap.baitap1;

public class Rectangle implements Resizable{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        System.out.println("chiều dài trước khi thay đổi: "+ this.getHeight());
        System.out.println("chiều rộng trước khi thay đổi: "+ this.getWidth());
        System.out.println("chiều dài sau khi thay đổi: "+  (this.getHeight()+this.getHeight()*(percent/100)));
        System.out.println("chiều rộng sau khi thay đổi: "+  (this.getWidth()+this.getWidth()*(percent/100)));
    }
}
