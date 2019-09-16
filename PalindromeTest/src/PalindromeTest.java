
public class PalindromeTest {
	
	static boolean isPalindrome(String input) {
		boolean result;
		
		int length  = input.length();
	    int i, begin, end, middle;
	 
	    begin  = 0;
	    end    = length - 1;
	    middle = (begin + end)/2;
	 
	    for (i = begin; i <= middle; i++) {
	    	
	      if (Character.toUpperCase(input.charAt(begin)) == Character.toUpperCase(input.charAt(end))) {
	    	  
	        begin++;
	        end--;
	      }
	      else {
	        break;
	      }
	    }
	    
	    if (i == middle + 1) {
	    	result = true;
	    } else {
	    	result = false;
	    } 	
		
		
		return result;
	}
	

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("liril"));
		System.out.println(isPalindrome("Anna")); 
		System.out.println(isPalindrome("Civic")); 
		System.out.println(isPalindrome("Kayak")); 
		System.out.println(isPalindrome("Level")); 
		System.out.println(isPalindrome("Madam")); 
		System.out.println(isPalindrome("Mom")); 
		System.out.println(isPalindrome("Noon")); 
		System.out.println(isPalindrome("Racecar")); 
		System.out.println(isPalindrome("Radar")); 
		System.out.println(isPalindrome("Redder")); 
		System.out.println(isPalindrome("Refer")); 
		System.out.println(isPalindrome("Repaper")); 
		System.out.println(isPalindrome("Rotator")); 
		System.out.println(isPalindrome("Rotor")); 
		System.out.println(isPalindrome("Sagas")); 
		System.out.println(isPalindrome("Solos")); 
		System.out.println(isPalindrome("Stats")); 
		System.out.println(isPalindrome("Tenet")); 
		System.out.println(isPalindrome("Wow")); 
		

	}

}
