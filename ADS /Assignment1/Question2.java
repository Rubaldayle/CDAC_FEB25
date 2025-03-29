
import java.util.Arrays;

class Question2{
//Function for Check whether two given strings are anagrams of each other.
public static boolean checkanagrams(String str1, String str2){
	char[] arr1 = str1.toCharArray();
	char[] arr2 = str2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	return Arrays.equals(arr1, arr2);
	}
	
//Function for Identify the longest word in a given sentence.

public static String longestword(String str){
	String[] word = str.split(" ");
	String longest = " ";
	
	for(String words1 : word){
		if(words1.length() > longest.length()){
			longest = words1;
		}
	}
	return longest;
}
//Count the number of vowels and consonants in the same sentence.

public static int[] vowelsconsonants(String str){
	
	int vowels = 0;
	int consonants = 0;
	
	String vowelset = "aeiouAEIOU";
	String consonantset = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
	
	for(char chh: str.toCharArray()){
		if(vowelset.indexOf(chh) != -1){
			vowels++;
		}else if(consonantset.indexOf(chh) != -1){
			consonants++;
		       }
			}
			return new int[]{vowels, consonants};
	}
	
    public static void main(String[] args){
	String str1 = "listen";
	String str2 = "silent";
	String str = "Practice makes a man perfect";
	
	System.out.println("Are 'listen' and 'silent' anagrams? " +checkanagrams(str1, str2));
	System.out.println("Longest word: " +longestword(str));
	
	int[] counts = vowelsconsonants(str);
	System.out.println("Vowels:" + counts[0]);
    System.out.println("consonants:" + counts[1]);
           }
}
