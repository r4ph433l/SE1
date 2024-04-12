package uebung1;

public class RomanNumberTransformer implements NumberTransformer {

	String[] romanSymbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
	int[] romanValues  = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	
	@Override
	public String transformNumber(int number) {
		if (number < 1 || number > 3000) {
			return "ERROR";
		}
		String string = "";
		while (number > 0) {
			for (int i = romanValues.length-1; i >= 0; i--) {
				if (romanValues[i] <= number) {
					number = number - romanValues[i];
					string += romanSymbols[i];
					break;
				}
			}
		}
		return string;
	}

	@Override
	public String getTransformerType() {
		return "Transformer für römische Zahlen";
	}
	
}
