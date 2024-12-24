import java.util.Scanner;

public class NewLgic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hellow Enter number To reverse: ");
        int inpNum = scanner.nextInt();
       /* int rev = 0;
        while (inpNum != 0){
            rev = rev * 10 + inpNum%10;
            inpNum = inpNum/10;

        }
        */
        StringBuffer sb = new StringBuffer(String.valueOf(inpNum));
        StringBuffer rev = sb.reverse();
        System.out.println("The revirse num is: "+ rev);

    }
}
