import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCase3 {
	
	SortNumbers sn3 = new SortNumbers();

	@Test
	void test3() {
		int a[]= {-90,-100,-80,-70,-60,-50,-40,-30,-20,-10};
		Arrays.sort(a);
		assertEquals(a, sn3.returnArray(a));
	}

}
