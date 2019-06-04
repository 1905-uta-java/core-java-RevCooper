package com.revature.api;

public class Acronym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phrase = "Easy Peazy Lemon Squeezy ";
		String rtn = "";

		String[]  phraseArr = phrase.split(" ");
		
		for(String a : phraseArr) {
			
			rtn += a.split("")[0];
			//System.out.print(a.split("")[0]);
			
		}
 	
		System.out.print(rtn);
	}

}
