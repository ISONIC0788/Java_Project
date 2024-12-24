public class splintArray {
    public static void main(String[] args) {
        String str = "this is java string class";
        String[] arr = str.split(" ");
        System.out.println(arr.length);
        for(String s: arr){
          System.out.println(s);
        }
        String str2 = "This my frist string with regexplation";
        String[] reg = str2.split("\\s");
        System.out.println(reg.length);
        for (String h:reg){
            System.out.println(h);
        }

        // second string
        String s = "geeks@for@geeks";
        String[] hello = s.split("@" ,-2);
        for (String eh : hello){
            System.out.println(eh);
        }


    }
}
