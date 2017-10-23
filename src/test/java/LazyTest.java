import static org.junit.Assert.*;
import org.junit.Test;

public class LazyTest{
	@SuppressWarnings("unchecked")

	@Test
	public void testCatererPosNumber() {
		Caterer t = new Caterer();
		assertEquals(t.lazyCaterer(3), 7);
	}

	@Test
	public void testCatererNegative() {
		Caterer t = new Caterer();
		assertEquals(t.lazyCaterer(-5), 11);
	}

	@Test
	public void testCatererZero() {
		Caterer t = new Caterer();
		assertEquals(t.lazyCaterer(0), 1);
	}

}
