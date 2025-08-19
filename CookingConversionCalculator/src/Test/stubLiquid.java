//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import sqa.main.LiquidVolumeConverter;

public class stubLiquid extends LiquidVolumeConverter {
	
	//from cup to ml
	@Override
	public double convert(double liquidValue, String fromUnit, String toUnit) {
		return 1000.0;
	}
	
	//from cup to ml
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		return 250.0;
	}

}
