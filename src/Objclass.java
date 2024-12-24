 public class Objclass {
    String name ;
    int level ;

    // constructor
     Objclass(){
         level = 1;
         name = "Ebedi";
     }
 // second constructor
//     Objclass(String pname , int plevel){
//         name = pname ;
//         level = plevel;
//     }

     Objclass(String name , int level){
           this.name = name;
          this.level = level;
     }

    String attack (){
     return   this.name + "Attack!   ";
    }
}
