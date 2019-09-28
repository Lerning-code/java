public class StringImmute{
   public static void main(String []args){
      String s1 = "bhushan";
      String s2 = "talan";
   //s2="manhesh";
       String s3 = new String ("bhushan");
        s3="talan";
       // String s3 = new String ();
       // s3=s2;
      /**  #output 
        true
        false

    */
      System.out.println(s3);   //true because == check references.
     // System.out.println(s2 == s3);   //false because == check references.

      //  System.out.println(s2.equals(s3));  //true because equals check values.
   }
}
