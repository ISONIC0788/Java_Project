public  class Main {
    public static void main(String[] args) {
        String name = "Ebed";
        // to check if is equal
        boolean result = name.equals("ebed");
        boolean result2 = name.equalsIgnoreCase("ebed");
        int result3 = name.length();
        char result4 = name.charAt(0);
        int result5 = name.indexOf("e");
        boolean  result6 = name.isBlank();
        boolean result7 = name.isEmpty();
        String result8 = name.toUpperCase();
        String result9 = name.toLowerCase();
        // trim is used to remove all space above
        String Secondnm = " \b Ituze Ebedi " ;
        String Result10 = Secondnm.trim();
        String result12  = Secondnm.replace('E', 'k');
        String Fullname = name.concat(Secondnm);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);
//        Integer.parseInt()
        System.out.println(Result10);
        System.out.println(result12);
        System.out.println(Fullname);


    }
}