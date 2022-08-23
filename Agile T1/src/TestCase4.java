import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCase4 {
	
	SortNumbers sn4 = new SortNumbers();

	@Test
	void test4() {
		int a[]= {90,-100,-80,70,-60,50,-40,30,-20,10};
		Arrays.sort(a);
		assertEquals(a, sn4.returnArray(a));
	}

}
