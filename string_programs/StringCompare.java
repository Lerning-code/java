

/**
* auther:- bhushan talan
*compiler jdk 11
* program for string compairing
*/

public class StringCompare{

public static void main(String args[])
{
    String str1="Public Place";
    String str2="public place";
    Object str3 =str1;

    System.out.println(str1.compareTo(str2));
    System.out.println( str1.compareToIgnoreCase(str2) );
    System.out.println( str1.compareTo(str2.toString()));
}
}


/**
*Output
*   -32
*   0
*   -32
*/
