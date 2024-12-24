public class ScopeVar {
    public static void main(String[] args) {
         String name = "Ebed";

        {
            int x = 100;
            System.out.println(x);
            System.out.println(name);
        }
//        System.out.println(x);


    }
}
