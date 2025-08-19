//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import sqa.main.*;

public class Driver {

	private static double originalValue;
	private static double convertedValue;
	private static String from;
	private static String to;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CookingConversionCalculator
		CookingConversionCalculator cookiing = new CookingConversionCalculator();
		originalValue = 10.0;
		
		String choiceLiquid = "liquid";
		from = "teaspoon";
		to = "ml";
		System.out.println("CookingConversionCalculator");
		System.out.println("convert from " + from + " to " + to + " by LiquidVolumeConverter");
		convertedValue = cookiing.convert(originalValue, choiceLiquid, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
		
		String choiceMass = "mass";
		from = "oz";
		to = "gram";
		System.out.println("\nconvert from " + from + " to " + to + " by MassConverter");
		convertedValue = cookiing.convert(originalValue, choiceMass, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
		
		String choiceTemp = "temperature";
		from = "celsiusfahrenheit";
		to = "fahrenheit";
		System.out.println("\nconvert from " + from + " to " + to + " by TemperatureConverter");
		convertedValue = cookiing.convert(originalValue, choiceTemp, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
		System.out.println("-----------------------------------------------------------------");

		// LiquidVolumeConverter
		LiquidVolumeConverter liquid = new LiquidVolumeConverter();
		originalValue = 13.0;
		from = "pint";
		to = "ml";

		System.out.println("\nLiquidVolumeConverter");
		System.out.println("convert from " + from + " to " + to);
		convertedValue = liquid.convert(originalValue, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
		System.out.println("-----------------------------------------------------------------");

		// MassConverter
		MassConverter mass = new MassConverter();
		originalValue = 70.0;
		from = "kilogram";
		to = "pound";

		System.out.println("\nMassConverter");
		System.out.println("convert from " + from + " to " + to);
		convertedValue = mass.convert(originalValue, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
		System.out.println("-----------------------------------------------------------------");

		// TemperatureConverter
		TemperatureConverter temp = new TemperatureConverter();
		originalValue = 60.0;
		from = "celsiusfahrenheit";
		to = "fahrenheit";

		System.out.println("\nTemperatureConverter");
		System.out.println("convert from " + from + " to " + to);
		convertedValue = temp.convert(originalValue, from, to);
		System.out.println(originalValue + " " + from + " = " + convertedValue + " " + to);
	}

}
