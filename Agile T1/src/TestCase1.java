import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCase1 {
	
	SortNumbers sn1 = new SortNumbers();

	@Test
	void test1() {
		int a[]= {9,10,8,7,6,5,4,3,2,1};
		Arrays.sort(a);
		assertEquals(a, sn1.returnArray(a));
	}
	
	

}
