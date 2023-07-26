package section06;
/*
 * 숙제!
 * 이중 배열 7*7 선언 (1-49)
 * 
 * 1. 2중 배열 선언
 * 2. for문으로 1-49까지 대입하기
 * 3. 아래 모양을 출력하기 
 * 
 * 1
 * 2 8
 * 15 9 3 
 * ....
 * 
 */

public class ArrayHomework {
public static void main(String[] args) {
	int[][]nums= {
			{1,2,3,4,5,6,7},
			{8,9,10,11,12,13,14},
			{15,16,17,18,19,20,21},
			{22,23,24,25,26,27,28},
			{29,30,31,32,33,34,35},
			{36,37,38,39,40,41,42},
			{43,44,45,46,47,48,49}
	};

	for(int i=0; i<13;i++) {
		
		if(i==0) {
			System.out.print(nums[0][0]);
		}
		
		if(i<=6 && i!=0) {
			if(i%2>=1) {
				int j=0;
				int k=i;
				
				while(true) {
					System.out.print(nums[j][k]+" ");
					j++;
					
					if(k==0) {
						break;
					}
					k--;
				}
			}
			
			else {
				int a=i;
				int b=0;
				
				while(true) {
					System.out.print(nums[a][b]+" ");
					b++;
					
					if(a==0) {
						break;
					}
					a--;
				}
			}
		}
		
			
			
			
		
		
		if(i>=7 && i!=12) {
			if(i%2>=1) {
				
				int c=i-6;
				int d=6;
				int e=c;
				
				while(true) {
					System.out.print(nums[e][d]+" ");
					
					e++;
					if(d==c) {
						break;
					}
					d--;
				}
			}
			
			else {
				
				int f=i-6;
				int g=6;
				int h=f;
				
				while(true) {
					
					System.out.print(nums[g][h]+" ");
					h++;
					
					if(g==f) {
						break;
					}
					g--;
				}
				
				
			}
		}
		
		
		if(i==12) {
			System.out.print(nums[6][6]);
		}
		
		System.out.println();
	}
	
}
}
