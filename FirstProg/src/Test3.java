import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3{
	
	public static void main(String arg[])
	{
		
		int[][] matrix = new int[][]{
				  { 9, 8, 7 },
				  { 6, 5, 4 },
				  { 3, 2, 1 }
				
				};
		  	int r = matrix.length ;
		  	int c = matrix[0].length ;
		  	int [] dp = new int [r * c] ;
		  	for (int i = 1 ; i < c ;++i ) {	  		
		  		dp[id (0 , i, c)] = id (0 , i - 1, c) ; 
		  	}
		  	for (int i = 1 ; i < r ; ++i) {
		  		dp[id (i , 0, c)] = id (i - 1 , 0, c) ;
		  	}
			for (int i = 1 ; i < r ; ++i) {
			  for (int j = 1 ; j < c ; ++j ) {
				  if (matrix[i - 1][j] <= matrix[i][j - 1]) {
					  dp[id(i , j , c)] = id (i - 1, j, c);				  
				  } else {
					  dp[id(i , j , c)] = id (i, j - 1, c);
				  }
			  }
			}		
			int i = dp.length - 1 ;		
			List<Integer> rst = new ArrayList<> ();
		    int [] start = coordinator (dp.length - 1, c) ;
		    rst.add(matrix[start[0]][start[1]]) ;
			while (i > 0 ) {
				i = dp[i] ;
				int [] pre = coordinator (i, c) ;
				rst.add(matrix[pre[0]][pre[1]]) ;
			}		
			Collections.sort(rst); 
			
			for (int v : rst) {
				System.out.print(v + " ");
			}
			System.out.println();
	}
	

public void  mostBeautifuPath (int [][] matrix){
	
	}
	
	public static int id (int x, int y, int c){
		return x * c + y ;
	}
	
	public static int [] coordinator (int id, int c){
		return new int [] {id / c , id % c } ;
	}
}