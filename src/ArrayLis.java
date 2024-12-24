import java.util.ArrayList;
public class ArrayLis {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("fold");
        cars.add("mozda");
        cars.add("Karina");
//        insert the element at the bigning
        cars.add(0,"Ramobgn");
        System.out.println(cars);

    }
}
