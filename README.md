# PalindromeTest
PalindromeTest using Java

<h1>Source Code<h1>
<p>
  
  
  
  
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
  
  
  
</p>

<h2>input</h2>
<p></p>

<h2>output</h2>
<p></p/>
