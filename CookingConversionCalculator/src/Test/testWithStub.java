//นายศุภวิชญ์ ศักดิ์เทวินทร์ 663380239-8 Sec.1
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWithStub {

	@Test
	void test_Cooking_convert() {
		stubCooking stub = new stubCooking();
		double expectedResult = 5;
		assertEquals(expectedResult, stub.convert(41, "temperature", "fahrenheit", "celsius"));
	}
	
	@Test
	void test_Liquid_convert() {
		stubLiquid stub = new stubLiquid();
		double expectedResult = 1000.0;
		assertEquals(expectedResult, stub.convert(4, "cup", "ml"));
	}
	
	@Test
	void test_Liquid_getConversionFactor() {
		stubLiquid stub = new stubLiquid();
		double expectedResult = 250.0;
		assertEquals(expectedResult, stub.getConversionFactor("cup", "ml"));
	}
	
	@Test
	void test_Mass_convert() {
		stubMass stub = new stubMass();
		double expectedResult = 80.0;
		assertEquals(expectedResult, stub.convert(10, "tablespoon", "gram"));
	}
	
	@Test
	void test_Mass_getConversionFactor() {
		stubMass stub = new stubMass();
		double expectedResult = 8.0;
		assertEquals(expectedResult, stub.getConversionFactor("tablespoon", "gram"));
	}
	
	@Test
	void test_Temperature_convert() {
		stubTemperature stub = new stubTemperature();
		double expectedResult = 10.0;
		assertEquals(expectedResult, stub.convert(50.0, "fahrenheit", "celsius"));
	}
}
