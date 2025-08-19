//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import sqa.main.CookingConversionCalculator;

public class stubCooking extends CookingConversionCalculator{
	
	//41, temp, fahrenheit, celsius
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		return 5.0;
	}

}
