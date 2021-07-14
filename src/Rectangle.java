public class Rectangle {

    int width;
    int height;

    public Rectangle() {
        this.width = 20;
        this.height = 10;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Integer area() {
        return width * height;
    }

    public Integer p() {
        return (width + height) * 2;
    }

}
