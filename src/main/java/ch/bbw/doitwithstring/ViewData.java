package ch.bbw.doitwithstring;

/**
 * ViewData
 *    Daten für die Anzeige in der View.
 * @author Peter Rutschmann
 * @version 07.09.2021
 */
public class ViewData {
   private String string1 = "";
   private String string2 = "";
   private String string3 = "";
   private String result = "";

   public String getString1() {
      return string1;
   }

   public void setString1(String string1) {
      this.string1 = string1;
   }

   public String getString2() {
      return string2;
   }

   public void setString2(String string2) {
      this.string2 = string2;
   }

   public String getString3() {
      return string3;
   }

   public void setString3(String string3) {
      this.string3 = string3;
   }

   public String getResult() {
      return result;
   }

   public void setResult(String result) {
      this.result = result;
   }

   @Override
   public String toString() {
      return "ViewData{" +
            "string1='" + string1 + '\'' +
            ", string2='" + string2 + '\'' +
            ", string3='" + string3 + '\'' +
            ", result='" + result + '\'' +
            '}';
   }
}
