package easy;

//463. Island Perimeter
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int allcount = 0;
		int connect = 0;
		for(int row=0;row<grid.length;row++)
			for(int col=0;col<grid[0].length;col++ ){
				//横向遍历数组中所有元素
				if(grid[row][col]==1){
					allcount++; //找出所有1的个数
					if((col<grid[0].length-1)&&(grid[row][col+1]==1)){
						connect++; //找出横向有连接的1个数
					}
				}
			
		}
		for(int col=0;col<grid[0].length;col++)
			for(int row=0;row<grid.length;row++ ){
				//纵向遍历数组中所有元素
				if(grid[row][col]==1){
					if((row<grid.length-1)&&(grid[row+1][col]==1)){ //先判断是否越界，再看下一个元素
						connect++; //找出纵向有连接的1的个数 
					}
				}
			
		}
		
		return 4*allcount-2*connect;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		IslandPerimeter is = new IslandPerimeter();
		
		System.out.println(is.islandPerimeter(grid));

	}

}
