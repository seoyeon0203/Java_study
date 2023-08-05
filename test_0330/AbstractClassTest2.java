package test_0330;

import java.util.ArrayList;

public class AbstractClassTest2 {
    public static void main(String[] args){

    }
}
abstract class Tag{
    protected String name;
    protected String text;
    protected boolean isEmpty;
   public Tag(String name, String text, boolean isEmpty){
       this.name = name;
       this.text = text;
       this.isEmpty = isEmpty;
   }


    void setText(String s){
        this.text=s;
    }
    public String getText(){
         return this.text;
    }

    abstract void addTag(Tag t);
}

//class P extends Tag{
//
//    void setText(String s) {
//        this.text = s;
//    }
//    String getText() {
//        return this.text;
//    }
//
//    void addTag(Tag t) {
////
//    }
//}
//class Image extends Tag{
//
//    public Image(){
//        super("image", null, true);
//    }
//
//}
