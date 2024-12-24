public class Tryit {

    public static void main(String[] args) {
        String[] Cars = {"Volvo", "BMWS" , "Ford" , "Mazda"};
        int SizeArray = Cars.length;
        System.out.println("Size of array is: " + SizeArray);
        System.out.println(Cars[0]);
        String myname = "ITUZE AGACYO EBED MELECK";
        String myoneNm = " ebedi ";


        String[] Sout = myname.split(" ");
        for (String n : Sout){
            System.out.println(n);
        }
        System.out.println(myoneNm.getClass().getSimpleName());
        System.out.println(Cars.getClass().getSimpleName());
        System.out.println(myoneNm.equals("Ebedi"));
        String trim = myoneNm.trim();
        System.out.println(trim.charAt(1));
        String num1 = "20";
        int  num2 = 40;
        int num = Integer.parseInt(num1);
        System.out.println(num2+num);



    }
}
