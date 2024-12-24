import javax.xml.namespace.QName;

public class Recusive {
    public static void main(String[] args) {
      int result = sum(10);
      System.out.println(result);
      System.out.println(sec(5));
      System.out.println(thn(10, 50));
    }
    // recusive function
    static int sum(int k){
        if(k>0){
            return k + sum(k -1 );
        }else {
            return 0;
        }
    }
    static int sec(int g){
        if (g>0){
            return g + sec(g-1);
        }
        return 0;
    }

    static int thn(int start , int end){
        while (start > 0 ){
            return start + end - thn(start-2 , end - 3);
        }
        return 0;
    }
}
