import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestCase2 {
	
	SortNumbers sn2 = new SortNumbers();

	@Test
	void test2() {
		int a[]= {90,100,80,70,60,50,40,30,20,10};
		Arrays.sort(a);
	}

}
