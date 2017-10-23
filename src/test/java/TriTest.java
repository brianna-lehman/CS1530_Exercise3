import static org.junit.Assert.*;
import org.junit.Test;

public class TriTest{
	@SuppressWarnings("unchecked")

	@Test
	public void testTriPosNumber() {
		Caterer t = new Caterer();
		assertEquals(t.tri(5), 15);
	}

	@Test
	public void testTriNegNumber() {
		Caterer t = new Caterer();
		assertEquals(t.tri(-44), 0);
	}

	@Test
	public void testTriZero() {
		Caterer t = new Caterer();
		assertEquals(t.tri(0), 0);
	}
}