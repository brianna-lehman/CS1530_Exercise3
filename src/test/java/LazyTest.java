import static org.junit.Assert.*;
import org.junit.Test;

public class CatererTest{
	@SuppressWarnings("unchecked")

	@Test
	public void testCatererPosNumber() {
		Caterer t = new Caterer();
		assertEquals(t.lazycaterer(3), 7);
	}

	@Test
	public void testCatererNegative() {
		Caterer t = new Caterer();
		assertEquals(t.lazycaterer(-5), 11);
	}

	@Test
	public void testCatererZero() {
		Caterer t = new Caterer();
		assertEquals(t.lazycaterer(0), 1);
	}

}
