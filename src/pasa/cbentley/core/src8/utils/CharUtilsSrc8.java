package pasa.cbentley.core.src8.utils;

public class CharUtilsSrc8 {

   /**
    * 
    * @param c
    * @return
    */
   public static boolean isPrivate(char c) {
      //TODO does not check on the 2 supplementaries
      if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.PRIVATE_USE_AREA) {
         return true;
      }
      return false;
   }

}
