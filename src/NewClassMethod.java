public class NewClassMethod {
    static  void some_out(){
        System.out.println("Hellow My frist 'Object' ");
    }
    static void myName(String name , int age , String location ){
        System.out.println(String.format("Hellow my name is %s age %d and locattion %s",name,age,location));
    }
    static void myFavorite() {
        System.out.println("hellow i back to course ");
    }
//    my own object
    public static void main(String[] args) {
        myFavorite();
        some_out();
        myName("ITUZE" , 12 ,"kigalis");
        myName("Ebed" , 30 ,"Bugesera");
        myName("ITUZE" , 45 ,"Karongi");
        hY();
        sum(1,3);
        System.out.println(sum(1 , 3));
    }
    static  void  hY(){
        System.out.println("hellow words");
    }
    static int  sum(int x , int y){
        int sum = x + y;
        return sum;
    }
}
