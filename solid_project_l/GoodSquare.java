public class GoodSquare implements Shape {
    private int length;
    public GoodSquare(int i) {
        this.length=i;
    }


    @Override
    public int getHeight() {
        return length;
    }

    @Override
    public void setHeight(int height) {

    }

    @Override
    public int getWidth() {
        return length;
    }

    @Override
    public void setWidth(int width) {

    }

    @Override
    public int getArea() {
        return this.length * this.length;
    }
}
