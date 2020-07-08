import java.util.*;

/**
 * This class shows the implementation of ceasar cipher.
 * 
 * @author ankur gangwar
 * @version 1.0
 * @since 08-07-2020
 *
 */
public class CeasarCipher {
	
	/**
	 * converts the input string to 
	 * encrypted string
	 * 
	 * @param input input string to be encrypted
	 * @param key integer value by which characters will be shifted
	 * @return String encrypted input string
	 */
	public static String encrypt(String input, int key){
		
		//Make a StringBuilder to operate on input
		StringBuilder encrypted = new StringBuilder(input);
		
		//Write down alphabets
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		//Compute shifted alphabets
		String shiftedAlphabet = alphabet.substring(key)
				+ alphabet.substring(0, key);
		
		//loop through all characters in encrypted
		for(int i = 0;i < encrypted.length();i++){
			
			//look at ith character of encrypted (call it currChar)
			char currChar = encrypted.charAt(i);
			
			//find index of current char in alphabet (call it idx)
			int idx = alphabet.indexOf(currChar);
			
			//check if character is present in alphabet
			if(idx != -1){
				
				//get the idxth character of shiftedAlphabet (call it newChar)
				char newChar = shiftedAlphabet.charAt(idx);
				
				//Replace the ith character of encrypted with newChar
				encrypted.setCharAt(i, newChar);
			}
		}
		
		//finally return encrypted string
		return encrypted.toString();
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(encrypt(input, 17));
	}

}

