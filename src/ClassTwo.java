public class ClassTwo {
    public static void main(String[] args) {
        ClassOne Obj1 = new ClassOne();
//        Obj1.name = "Ebedi";
//        Obj1.age = 23;
//        Obj1.level = 6 ;
       System.out.println(Obj1.age);
       System.out.println(Obj1.name);

       ClassOne Obj2 = new ClassOne( "helloMy name", 23 ,34);
       System.out.println(Obj2.level   );


    }
}
