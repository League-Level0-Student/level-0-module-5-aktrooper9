package _06_for_loop_gauntlet;

public class Nested_Loops {
	public static void main(String[] args) {
		for (int n = 0; n < 3; n += 1) {
			for (int z = 0; z < 3; z++) {
				System.out.println(+n + " " + z);
			}
		}
		for (int start = 1; start < 10; start += 3) {
			for (int stort = start; stort < start + 3; stort++) {
				System.out.print(+stort + " ");
			}
			System.out.println("");
		}
		for (int stert = 1; stert < 101; stert += 10) {
			for (int sttrt = stert; sttrt < stert + 10; sttrt++) {
				if (sttrt < 10) {
					System.out.print(+sttrt + "  ");
				} else {
					System.out.print(+sttrt + " ");
				}
			}
			System.out.println("");
		}
		for (int i = 1; i < 7; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int y = 0; y > -101; y--) {
System.out.println(y+100);
		}
	}

}
