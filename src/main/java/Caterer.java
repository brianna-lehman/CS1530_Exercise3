public class Caterer {

	public int lazyCaterer(int n){
		return (int) ((Math.pow(n,2)+n+2)/2);
	}

	public int tri(int value) {
		if (value <= 0) {
			return 1;
		}

		return (value*(value+1))/2;
	}

	public static void main(String[] args){
		if(args.length > 2){
			System.out.println("Too many args");
			System.exit(1);
		}

		Caterer caterer = new Caterer();
		int triangles = caterer.tri(Integer.parseInt(args[1]));
		int pieces = caterer.lazyCaterer(Integer.parseInt(args[0]));
		System.out.println("Lazy("+args[0]+") = "+pieces);
		System.out.println("Tri("+args[0]+") = "+triangles);

	}
}
