package patterns;

//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 

public class Pattern15 {
	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			int num=5;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num--;
			}
			System.out.println();
		}
	}
}
