package section05;
/*
 * 구구단
 *                       i   
 * 2X1=2  3X1=3  4X1=4   1     
 * 2X2=4  3X2=3  4X2=4   2
 * 2X1=2  3X1=3  4X1=4   3
 * 2X1=2  3X1=3  4X1=4   4
 * 2X1=2  3X1=3  4X1=4   5
 * 2X1=2  3X1=3  4X1=4   6
 * 2X1=2  3X1=3  4X1=4   7
 * 
 */

public class Loophomework02 {
	public static void main(String[] args) {
	for(int k=0; k<3; k++) {
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<3; j++) {
				System.out.printf("%dX%d=%d\t",j+2, i+1,(j+2)*(i+1));
				}
			System.out.println();
		}
		
	}
	}
		
	}
		
	}
	
