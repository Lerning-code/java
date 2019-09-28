public class StringCompare1{
   public static void main(String []args){
      String s1 = "bhushan";
      String s2 = "bhushan";
   
       String s3 = new String ("bhushan");
       // String s3 = new String ();
       // s3=s2;
      /**  #output 
        true
        false

    */
      System.out.println(s1 == s2);   //true because == check references.
      System.out.println(s2 == s3);   //false because == check references.

        System.out.println(s2.equals(s3));  //true because equals check values.
   }
}
