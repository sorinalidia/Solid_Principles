public class GoodRectangle implements Shape {
    private int height;
    private int width;
    public GoodRectangle(int height, int width){
       this.height=height;
       this.width=width;
  }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height=height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
    }

    @Override
    public int getArea() {
        return height * width;
    }
}
