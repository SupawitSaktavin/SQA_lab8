//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import sqa.main.TemperatureConverter;

public class stubTemperature extends TemperatureConverter {

	//from fahrenheit to celsius
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return 10.0;
	}

}
