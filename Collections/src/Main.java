import java.io.*; 

class Main { 
	public static void main(String[] args) throws IOException { 
		String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split("@", 2); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
        
        
        
        String s = "Shujaat#Ali#Ansari";
        String arr[] = s.split("#", 3);
        
        for(String str1 : arr) {
        	System.out.println(str1);
        	
        	
        	
        	
        }
        
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        if (s1.equals(s2))
            System.out.println("s1==s2");
        if(s1==s3)
            System.out.println("s1==s3");
        if(s2==s3)
            System.out.println("s2==s3");
        
        if(s1.equals(s3)) {
        	 System.out.println("a");
        }
	} 
} 
	