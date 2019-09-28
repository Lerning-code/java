
public class StringOccurance1{

   public static void main(String[] args) {

      String str = "Hello world ,Hello Reader";
      int lastIndex = str.lastIndexOf("Hello");
      
      if(lastIndex == - 1)
         {

         System.out.println("Hello not found");

          }
         else 
        {    

         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
       
         }
     
        }
     }
