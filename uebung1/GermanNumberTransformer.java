package uebung1;
import java.text.*;

public class GermanNumberTransformer implements NumberTransformer {

	private static DecimalFormat F = new DecimalFormat("#,###");
	static {
		DecimalFormatSymbols s = new DecimalFormatSymbols();
		s.setGroupingSeparator('.');
		F.setDecimalFormatSymbols(s);
	}
	
	@Override
	public String transformNumber(int number) {
		if (number < 1 || number > 3000) {
			return "ERROR";
		}
		return F.format(number);
	}

	@Override
	public String getTransformerType() {
		return "Transformer für deutsche Zahlenformatierungen";
	}

}
