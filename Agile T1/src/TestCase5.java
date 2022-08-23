import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCase5 {
	
	SortNumbers sn5 = new SortNumbers();

	@Test
	void test5() {
		int a[]= {0,10,8,7,6,-5,-4,3,2,1};
		Arrays.sort(a);
		assertEquals(a, sn5.returnArray(a));
	}

}
