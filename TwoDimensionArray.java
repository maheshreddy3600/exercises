package deloittecore;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int x[][] = new int[3][3];
		for(int i=0;i<3;i++)
			for(int j= 0;j<3;j++)
				x[i][j]=i+j;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				System.out.print(x[i][j]+" ");
			System.out.println();
		}

	}

}
