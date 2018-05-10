# PalindromeTest
<p>
PalindromeTest using Java
I created the Palindrome Function using Java.
Declare the beginning, middle, and end index of the input parameter.
Compares the start and end values, if they are the same, return true, if they are not, return false.
Use the toUpperCase method to distinguish between uppercase and lowercase letters.
</p>
<h2>Source Code</h2>
  <pre><code>
  
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
  
  </code></pre>

<h2>input</h2>
<pre><code>

public static void main(String[] args) {
		
		System.out.println(isPalindrome("civic"));
		System.out.println(isPalindrome("abc"));
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

</code></pre>

<h2>output</h2>
<pre><code>
true
false
true
true
true
true
true
true
true
true
true
true
true
true
true
true
true
true
true
true
true
</code></pre>
