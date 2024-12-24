import java.util.ArrayList;

public class ArrayFunction {
    public static void main(String[] args) {


        int[] cars  = { 2,3 , 4 , 3};
        System.out.println(cars.length);
        myF();
        myFun();
        // printline
        System.out.println(age(23,23 ,45 ,45 ));

        System.out.println(addname("ITUZEebedi", "AGACYO", "kalisa" , "Sagwa joseph"));

    }
    static  void  myF(){
        String str = "Hy my name is ITUZE AGACYO EBEDI MELECK";
        String[] spl = str.split("\\s");
        System.out.println(spl.length);
        for (String nu : spl){
            System.out.println(nu);
        }
    }
    static void myFun(){
        String fname = "Sagwa";
        String sname = "Josephat";
        String pname = "Nishimirwe";
        String psname = "Epa";
        String[][] allname = {{"hellow", "kaila "},{"heee", "weee"}};
       System.out.println(allname[0][1]);
        ArrayList<String> hobi = new ArrayList<String >();
        hobi.add("Football");
        hobi.add("Coding");
        hobi.add("Watch move");
        hobi.add("like to play games");
        System.out.println(hobi);
    }
    static  int age (int a , int b , int c , int d ){
        return a + b + c + d;
    }
    static String addname(String name1 , String name2 , String name3 , String name4){
        return name1.concat(name2.concat(name3.concat(name3.concat(name4))));
    }

}
