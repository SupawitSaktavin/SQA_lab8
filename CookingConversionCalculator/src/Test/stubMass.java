//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import sqa.main.MassConverter;

public class stubMass extends MassConverter {

	//from tablespoon to gram
	@Override
	public double convert(double massValue, String fromUnit, String toUnit) {
		return 80.0;
	}
	
	//from tablespoon to gram
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 8.0;
	}

}
