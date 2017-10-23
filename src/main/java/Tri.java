public class Tri {
	public int tri(int value) {
		if (value = 1) {
			return 1;
		}
		return value + tri(value-1)
	}
}
