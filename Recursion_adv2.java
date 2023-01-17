
public class Recursion_adv2 {
//Q-> Count total paths in a Maze to move from (0,0) to (n,m)
	
	public static int countPaths(int row,int column,int n,int m) {
	    if(row==n||column==m) {
	    	return 0;
	    }	
	    if(row==n-1 && column==m-1) {
	    	return 1;
	    }
		
		// move downward
		int downwardPaths = countPaths(row+1,column,n,m);
		
		// move right 
		int rightPaths = countPaths(row,column+1,n,m);
		
		return rightPaths+downwardPaths ;
	}
	
	
	public static void main(String[]args) {
		int n = 3, m = 5;
		int totalPaths = countPaths(0,0,n,m);
		System.out.println("Total paths: "+totalPaths);
	}
	
	
}
