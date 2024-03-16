package Technical;

public class ReverseStringExceptSpecialChar {
    
    public static void reverse(char s[])  
    {  
        // Initializing the l1 and r1 pointers  
        int r1 = s.length - 1, l1 = 0;  
   
        // Traversing the string from both ends until 'l1' and 'r1'  
        while (l1 < r1) {  
            // Ignoring the special characters  
            if (!Character.isAlphabetic(s[l1]))  
                l1++;  
            else if (!Character.isAlphabetic(s[r1]))  
                r1--;  
   
            // Both s[l1] and s[r1] are not special characters  
            else {  
                char t = s[l1];  
                s[l1] = s[r1];  
                s[r1] = t;  
                l1++;  
                r1--;  
            }  
        }  
    }  
    // Driver Code  
    public static void main(String args[])  
    {  
        String s = "b!!!c.d.e,f'g,hij";  
        char[] cA = s.toCharArray();  
   
        System.out.println(" Given string is: " + s);  
        reverse(cA);  
        String rS = new String(cA);  
   
        System.out.println(" The string after reversing is: " + rS);  
    }  
}
