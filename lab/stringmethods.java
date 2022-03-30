class Abc{
	public static void main(String []args)
	{
	
		String s1 = "Graphicera";
		String s2 = "graphic";
		String s3 = " Java ";
		System.out.println(s1);  			// printing string s1
		System.out.println(s1.length());		// Printing length of the string
		System.out.println(s1.charAt(2));		// printing character at index no 2
		System.out.println(s1.equals(s2));		// comparing 2 strings (return true if euqall otherwise false)
		System.out.println(s1.equalsIgnoreCase(s2));	// comparing 2 strings (ignoring cases)
		System.out.println(s1.concat(s2));		// returns a concated string but s1 will not be in modified form
		System.out.println(s1);  			// printing string s1	
		System.out.println(s2);  			// printing string s2
		System.out.println(s1.indexOf('d'));		//Returns the index of character if present, Otherwise returns -1
		System.out.println(s1.lastIndexOf('r'));	//Returns the index of character (counts from last)
		System.out.println(s1.toLowerCase());	//returns a string which has characters in lowercase without modifying in main string
		System.out.println(s1); 
		System.out.println(s2.toUpperCase());	//returns a string which has characters in uppercase without modifying in main string
		System.out.println(s2);
		System.out.println(s3.trim());		//Removes white spaces from start and end if present
		System.out.println(s3);
		System.out.println(s1.substring(0,s1.length()-2)); // Returns a substring of length-2
		System.out.println(s1.indexOf('a',3));			// Return index of character after a index provided

		// String Buffer (functions in these modify the actual string)
		StringBuffer s4 = new StringBuffer("GRAPHICERA");
		System.out.println(s4);
		System.out.println(s4.insert(5,"HillUNIVERSITY"));      //insert a string at the index provided (Modify the actual string
		System.out.println(s4);
		System.out.println(s4.replace(5,19,"College"));	// replace the original string between the provided indeices with string given
		System.out.println(s4.delete(5,12));


	}
}
