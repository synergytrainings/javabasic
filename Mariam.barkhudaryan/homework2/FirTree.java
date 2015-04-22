package test1;

public class FirTree {
	public static void PrintFirTree(int n) {
		if (n < 0) {throw new IllegalArgumentException("Illegal Argument. Not correct parameter for FirTree.PrintFirTree method.");}
		String a = " ";
		String b = "* ";
		String m = "";
		for (int i = 1; i <= n; i++) {
			String l = "";
			for (int j = 0; j < n - i; j++) {
				l = l + a;
			}
			m = m + b;
			System.out.println(l + m);
		}
	}

	public void main(String[] args) {
		int n = 4;
		FirTree.PrintFirTree(n);
	}
}
