public class Rectangle {
    public int length;
    public int width;

    public Readable(init length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return this.length * this.width;
    }

    public int getPerimeter(){
        return 2 * ( this.length + this.width);
    }
}