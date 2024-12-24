import java.util.ArrayList;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("ebedi");
        cars.add("volve");
        cars.add("Fords");
        cars.add("Toyota");
        System.out.println(cars);
        cars.add(0,"tesla");
        System.out.println(cars);
    }
}
