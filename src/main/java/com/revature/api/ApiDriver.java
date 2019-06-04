package com.revature.api;
import java.io.Console;
import java.util.*;

public class ApiDriver {

	public String reverse(String string) {
		// TODO Write an implementation for this method declaration
		
		
		   char[] newStr = string.toCharArray();
		   
		    
		    int len = newStr.length;
		    int start = 0, end = len - 1;

		    while(start <= end) {
		      char temp = newStr[start];
		      newStr[start] = newStr[end];
		      newStr[end] = temp;
		      start++;
		      end--;
		    }
		   

		String outStr = String.copyValueOf(newStr);
		
		return outStr;
	}
}


