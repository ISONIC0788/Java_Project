public class javaFunct {

    public static void main(String[] args) {
        System.out.println(myAge(23 , 34));
        myFullname("ITUZE AGACYO" , "EBEDI MELECK");
        System.out.println(myFullname("ITUZE AGACYO " , " EBEDI MELECK"));
        myLocatio();
        System.out.println(myFmember(25));
        getdata();

    }
    static  int myAge(int x , int y ){
        int sum = x + y;
        return sum;
    }
    static String myFullname(String fname , String sname ){
        String fullname = fname.concat(sname);
        return fullname;
    }
    static void myLocatio(){
        System.out.println("Kigali");
    }
    static int myFmember(int i){
        for (int j = 0; j < i ; j++) {
           j = i;
        }
        return i;
    }
    static void getdata(){
        int name = 23 ;
        Integer warrper = name;
        System.out.println("the type of " + warrper.getClass().getSimpleName());
    }

}
