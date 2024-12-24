public class Array2 {
    static  void arrayR(){
        String[] Cars  = {"BMS" , "Chevelot " , "Fords " , "Colora"} ;
        System.out.println(Cars[0]);
        for (String C : Cars){
            System.out.println(C);
        }
    }
    static  void arrayMul(){
        String[][] Cars = {{ "Cows", "Hen", "Goats"},
                            { "bags", "Books", "Pens"},
                             { "Computer ", "Internet", "Editor"}};
        System.out.println(Cars[0][0]);
        System.out.println(Cars[0][1]);
        System.out.println(Cars[0][2]);
        System.out.println(Cars[1][0]);
        System.out.println(Cars[1][1]);
        System.out.println(Cars[1][2]);
        System.out.println(Cars[2][0]);
        System.out.println(Cars[2][1]);
        System.out.println(Cars[2][2]);
        int randomN = (int) (Math.random()*100);
        System.out.println(randomN);
    }
    static void search(){
        int[] numr={1,2,3,4,5,5};
        int i = 0;
        while(i<numr.length){
            System.out.println(numr[i]);
            if(numr[i] == 3){
               System.out.println("the number is searched"+numr[i]);
             }
            i++;
        }
    }
    static  int recusivefun (int a ){
        if(a>0){
            return a + recusivefun(a-1 );
        }else {
            return 1;
        }
    }
    static int byFomula(int n){
        return  n * (n+1)/2;
    }
    public static void main(String[] args) {
        arrayR();
        arrayMul();
        String name1 = "Ebed";
        /*
          2 * 2 * 2
          2^3
          1+
         */
        System.out.println(name1.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(recusivefun(5));
        System.out.println("the number is "+byFomula(5));
    }
}
