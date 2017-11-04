	/**
	 * Recursion is a technique in which the method calls itself
	 * to solve a problem more efficiently, more quickly, and 
	 * also prevent repeated code.
	 *
	 * Below is a decimal to binary converter to represent
	 * the example of recursion. One can assume bits are not
	 * specifically implied, therefore no two's complement.
	 * (i.e. 100101 != -27, rather = 37)
	 *
	 * @author Logan Duck (logan.duck@yahoo.com)
	 * @version 11/3/17
	 */
	public class DecimalToBinary {
		static int decimalNum = 0;
		static String binaryNum = "";
		static String remainder;

		/* Constructor */
		public DecimalToBinary() {
			decimalNum = 0;
			binaryNum = "";
		}
		
		/**
		 * Converts the given decimal number in the parameter to a binary-form. 
		 * @param decimalNumIn - decimal number to be converted to binary.
		 * @return - binary form of the decimal number.
		 */
		public static String decimalToBinary(int decimalNumIn) {
			decimalNum = decimalNumIn;
			if (decimalNum == 0) {
				String ret = binaryNum;
				binaryNum = "";
				if (ret == "") { // forces intial 0 to output 0.
					ret = "0";
				}
				return ret;
			}
			if (decimalNum != 0) {
				if (decimalNum % 2 != 0) {
					remainder = "1";
				} else {
					remainder = "0";
				}
			}
			binaryNum = remainder + binaryNum;
			decimalNum = decimalNum / 2;
			return (decimalToBinary(decimalNum));
		}
		
		/* Examples */
		public static void main(String[] args) {
			System.out.println("5: " + DecimalToBinary.decimalToBinary(5));
			System.out.println("42: " + DecimalToBinary.decimalToBinary(42));
			System.out.println("74: " + DecimalToBinary.decimalToBinary(74));
			System.out.println("0: " + DecimalToBinary.decimalToBinary(0));
			System.out.println("180: " + DecimalToBinary.decimalToBinary(180));
			System.out.println("239: " + DecimalToBinary.decimalToBinary(239));
			System.out.println("1: " + DecimalToBinary.decimalToBinary(1));
			System.out.println("37: " + DecimalToBinary.decimalToBinary(37));}
	}