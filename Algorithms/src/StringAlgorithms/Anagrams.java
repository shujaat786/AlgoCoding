package StringAlgorithms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abcd";
		String str2 = "dacb";
		
   		isAnagram(str1,str2);
	}
	
	
	public static void isAnagram(String str1, String str2){
        //Remove all whitespace first
        String  s1= str1.replaceAll("\\s", "");
 
        System.out.println(s1);
        
        String s2 = str2.replaceAll("\\s", "");
        
        boolean status = true;
 
        if(s1.length() != s2.length())
        {
            status = false;
        }else {
            //Convert into character array
 
            char[] s1Array = s1.toLowerCase().toCharArray();
 
            char[] s2Array = s2.toLowerCase().toCharArray();
 
            //Sorting both character array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Check if both arrays are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
        if(status){
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
	
	
}


