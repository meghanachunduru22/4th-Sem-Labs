import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String first = "Java ";
        System.out.println("First String: " + first);

        String second = "Programming";
        System.out.println("Second String: " + second);

        String joinedString = first.concat(second);
        System.out.println("Joined String: " + joinedString);

        int length = joinedString.length();
        System.out.println("Length: " + length);

        System.out.println("Character at 5th index   :  " + joinedString.charAt(5));

        String first1 = "java programming";
        String second2 = "java programming";
        String third = "python programming";

        boolean result1 = first1.equals(second2);
        System.out.println("Strings first and second are equal: " + result1);

        boolean result2 = first1.equals(third);
        System.out.println("Strings first and third are equal: " + result2);        

        System.out.println("Java Programming starts with Java " + joinedString.startsWith("Java"));

        System.out.println("Java Programming ends with Programming " + joinedString.endsWith("Programming"));

        System.out.println("Index of P in Java Programming  : " + joinedString.indexOf('P'));

        System.out.println("Last Index of a in Java Programming  : " + joinedString.lastIndexOf('a'));

        System.out.println("Substring of Java Programming form 0 to 7th index : " + joinedString.substring(0, 7));

        System.out.println("Converting to lowercase  " + joinedString.toLowerCase());

        System.out.println("Converting to Uppercase  " + joinedString.toUpperCase());

        String vowels = "a::b::c::d::e";

        String[] result = vowels.split("::");

        System.out.println("Splitting the string and putting into array= " + Arrays.toString(result));

        System.out.println("Replacing a with z in Java Programming   " + joinedString.replace('a', 'z'));

        String str1 = "sachin tendulkar";
        String str2 = "amrood admin";
        String str3 = "AMROOD ADMIN";
        
        boolean retval1 = str2.equalsIgnoreCase(str1);
        boolean retval2 = str2.equalsIgnoreCase(str3);
    
        System.out.println("str2 is equal to str1 = " + retval1);
        System.out.println("str2 is equal to str3 = " + retval2);  
        String myStr = "       Hello World!       ";
        System.out.println("Before trimming : " + myStr);
        System.out.println("After trimming : " + myStr.trim());

        }    
}
