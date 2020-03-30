
package ue02;

public class Verkettung_von_Konstruktoren {
    public static String getAndPrint (String s) {
     System.out.println(s);
     return s;
   }
 
    public static void main(String[] args) {
      Son son = new Son();
    }
}
 
class Father {
   private String s1 = Verkettung_von_Konstruktoren.getAndPrint("Father.s1");
 
   public Father() {
     Verkettung_von_Konstruktoren.getAndPrint("Father.<init>");
    }
}
 
 class Son
 extends Father {
    private String s1 = Verkettung_von_Konstruktoren.getAndPrint("Son.s1");
 
    public Son() {
     Verkettung_von_Konstruktoren.getAndPrint("Son.<init>");
    }
}