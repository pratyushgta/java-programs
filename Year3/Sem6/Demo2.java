/**
 * This class contains methods for understanding getter-setter and toString methods
 * MSA-Lab Practise 2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;
public class Demo2 {
    double width, height;

    // auto-generated using Code > Generate > Getter and Setter
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

    // auto-generated using Code > Generate > toString
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
