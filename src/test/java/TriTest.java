import static org.junit.Assert.*;
import org.junit.Test;

public class TriTest{
	@SuppressWarnings("unchecked")

	@Test
	public void testTriPosNumber() {
		Tri t = new Tri();
		assertEqual(t(5), 15);
	}

	@Test
	public void testTriNegNumber() {
		Tri t = new Tri();
		assertEqual(t(-44), 0);
	}

	@Test
	public void testTriReallyBigNumber() {
		Tri t = new Tri();
		assertEqual(t(222222222), 24691358086419753);
	}
}