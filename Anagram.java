/**
 * 
 */
package com.bridgelabz.AlgorithmPrograms;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

/**
 * Created By:Medini P.D
 * Date:- 19/05/2018
 * Purpose: To find the given string is anagram or not.
 */
public class Anagram {
	public static void main(String[] args) {
		
		Utility u=new Utility();
		System.out.println("string1");
		String s1=u.getString();
		System.out.println("string2");
		String s2=u.getString();
		   char[] s1Array = s1.toCharArray();
           char[] s2Array = s2.toCharArray();

           Arrays.sort(s1Array);
           Arrays.sort(s2Array);
           boolean status = Arrays.equals(s1Array, s2Array);
           
	    if(status)
            System.out.println("anagrams");
        else 
            System.out.println("not anagrams");
    }
}