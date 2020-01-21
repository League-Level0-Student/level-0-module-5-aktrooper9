package _06_for_loop_gauntlet;

public class _06_for_loop_gauntlet {
	public static void main(String[] args) {
		int one = 0;
		for (int i = 0; i < 101; i++) {
			System.out.println(one);
			one++;
			{
				//
				one = 100;
				for (int c = 101; c > 0; c--) {
					System.out.println(one);
					one--;
				}
				one = 2;
				for (int d = 1; d < 51; d++) {
					System.out.println(one);
					one+=2; 
				}
				one =3;
				for(int o = 0;o<49;o++) {
					System.out.println(one);
					one+=2;
				}
				one = 0;
				for(int e=0;e<501;e++) {
					if(one%2==0) {
						System.out.println(one);
						System.out.println("even");
					}
					else {
						System.out.println(one);
					System.out.println("odd");
					}
					one++;
				}
				one=7;
				for(int w = 0;w<111;w++) {
					System.out.println(one);
					one+=7;
				}
				one=2007;
				for(int y = 0; y<13;y++) {
					System.out.println("in "+one+" I was "+y+" years old");
					one++;
				}
			}
		}
	}
}
