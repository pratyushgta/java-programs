package Year3.Sem6;

public class Demo2 {
    double width, height;

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
    public String toString() {
        return "Demo2{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Demo2 ob = new Demo2();

        double w = 20;
        double h = 20;

        ob.setHeight(h);
        ob.setWidth(w);

        System.out.println("Area: " + ob.getHeight() * ob.getWidth());

        // to display toString output
        System.out.println(ob);
    }
}
