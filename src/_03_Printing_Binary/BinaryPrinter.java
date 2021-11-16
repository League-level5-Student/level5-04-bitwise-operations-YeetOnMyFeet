package _03_Printing_Binary;

public class BinaryPrinter {
	/*
	 * Complete the methods below so they print the passed in parameter in binary.
	 * Do not use the Integer.toBinaryString method!
	 * Use the main method to test your methods.
	 */

	
	public static void printByteBinary(byte b) {
		// We first want to print the bit in the one's place
		System.out.println(b);
		int numShifted = b << 7;
		// Shift b seven bits to the right
		System.out.println(numShifted);
		// Use the & operator to "mask" the bit in the one's place
		// This can be done by "anding" (&) it with the value of 1
		int num1 = b & 1;
		// Print the result using System.out.print (NOT System.out.println)
		System.out.print(num1);
		//Use this method to print the remaining 7 bits of b
		int num2 = b & 32;
		System.out.print(num2);
	}
	
	public static void printShortBinary(short s) {
		// Create 2 byte variables
		byte byte1 = 1;
		byte byte2 = 2;
		// Use bit shifting and masking (&) to save the first
		// 8 bits of s in one byte, and the second 8 bits of
		// s in the other byte
		int byteShifted = byte1 << 7;
		int byteShifted2 = byte2 << 7;
		// Call printByteBinary twice using the two bytes
		// Make sure they are in the correct order
		printByteBinary(byte1);
		printByteBinary(byte2);
	}
	
	public void printIntBinary(int i) {
		// Create 2 short variables
		
		// Use bit shifting and masking (&) to save the first
		// 16 bits of i in one short, and the second 16 bits of
		// i in the other short
		
		// Call printShortBinary twice using the two short variables
		// Make sure they are in the correct order
	}
	
	public void printLongBinary(long l) {
		// Use the same method as before to complete this method
	}
	
	public static void main(String[] args) {
		// Test your methods here
		byte num1 = 1;
		short short1 = 1;
		//printByteBinary(num1);
		printShortBinary(short1);
	}
}
