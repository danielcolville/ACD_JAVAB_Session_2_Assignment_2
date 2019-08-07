package printFormatTwo;

public class PrintFormatTwo {
	public static void main(String [] args) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(j<=2+i && j>= 2-i) {
					if(j==2-i ||j==2+i ) {
						System.out.print("a");
					}
					else if(j==2-i+1|| j==2+i-1) {
						System.out.print("b");
					}
					else {
						System.out.print("c");
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i>0;i--) {
			for(int j=0;j<5;j++) {
				if(j<=2+(i-1) && j>= 2-(i-1)) {
					if(j==2+(i-1) ||j==2-(i-1)) {
						System.out.print("a");
					}
					else if(j==i || j== -i) {
						System.out.print("b");
					}
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}
}
