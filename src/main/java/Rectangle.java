public class Rectangle {

    private int length;
    private int width;
    private boolean isRectangle;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
        this.isRectangle = true;
    }

    public int calculateArea() {
        return length * width;
    }

    public boolean checkIfSquare() {
        if (length == width) {
            this.isRectangle = true;
        } else this.isRectangle = false;

    return this.isRectangle;}


}
