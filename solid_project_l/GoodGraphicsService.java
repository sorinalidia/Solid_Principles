
public class GoodGraphicsService {
    public void checkForArea(Shape rectangle) {
        if(rectangle instanceof GoodRectangle) {
            int height = 20;
            int width = 5;
            rectangle.setHeight(height);
            rectangle.setWidth(width);
        }

        if (rectangle instanceof GoodSquare) {
            verify(rectangle, rectangle.getWidth(), rectangle.getWidth(), "Square");
        } else {
            verify(rectangle, rectangle.getWidth(), rectangle.getHeight(), "Rectangle");
        }
    }

    private void verify(Shape rectangle, int width, int height, String entity) {
        if (rectangle.getArea() == (width * height)) {
            System.out.println("Great " + entity + " you got there!");
        } else {
            System.out.println("Well, not a " + entity + ".");
        }
    }
}
