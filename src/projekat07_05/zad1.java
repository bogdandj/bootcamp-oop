package projekat07_05;

public class zad1 {

	public static void main(String[] args) {

			System.out.println(stepen(5, 3));
	}
		
		
			public static int stepen(int n, int k) {
				int c = 1;
				for (int i = 0; i < k; i++) {
					c = c * n;
					
				}
				return c;
				
			}

	}



