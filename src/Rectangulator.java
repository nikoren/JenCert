import org.w3c.dom.css.Rect;

public class Rectangulor {
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
       
        Rectangle myRectangle = new Rectangle(length, width);
        String output = String.format(
            "<Rectangle :w=%d l=%d a=%d p=%d>",
                myRectangle.width, myRectangle.length,
                myRectangle.getArea(), myRectangle.getPerimeter()
        );
        System.out.println(output);
    }
}