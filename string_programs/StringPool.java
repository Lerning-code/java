
public class StringPool
{
public static void main(String [] args)
{
String str1="talan";
String str2="bhushan";
System.out.println(str1.equals(str2));
String  str3=new String();
str3=str1;

System.out.println(str3.equals(str2));
System.out.println(str3.equals(str1));
}
}
