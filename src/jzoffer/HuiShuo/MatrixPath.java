package HuiShuo;

//利用回溯法的递归特性，判断字符矩阵是否存在一条字符串路径
public class MatrixPath {
	public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
		if(matrix==null || rows==0 || cols==0 || str==null ||str.length==0)
			return false;
		//由于不能重复访问同一个格子，需要定义一个Boolean数组判断是否访问过
		boolean[][] visited = new boolean[rows][cols];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				visited[i][j]=false;
		//定义一个字符串下标的起始位置
		int index =0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(DFS(matrix,rows,cols,i,j,str,index,visited))
					return true;
			}
		}
		return false;
	}
	public boolean DFS(char[] matrix,int rows,int cols,int i,int j,char[] str,int index,boolean[][] visited){
		//如果匹配到最后的一个，即找到路径
		if(index == str.length)
			return true;
		//i和j表示现在访问的位置
		//如果现在的位置超过了矩阵的边界,或者字符串与矩阵中字符不匹配，或者该位置已经访问过
		if(i<0 || j<0 ||i==rows || j==cols || matrix[i*cols+j]!=str[index] || visited[i][j]==true)
			return false;
		
		
		//首次访问该位置
		visited[i][j] = true;
		//进行递归查询
		boolean path = DFS(matrix,rows,cols,i+1,j,str,index+1,visited)||
				DFS(matrix,rows,cols,i,j+1,str,index+1,visited)||
				DFS(matrix,rows,cols,i-1,j,str,index+1,visited)||
				DFS(matrix,rows,cols,i,j-1,str,index+1,visited);
		//当该位置的路径不存在时，将该位置标志位false
		if(path==false){
			visited[i][j] = false;
			index--;
		}
			
				
		return path;
	}

	public static void main(String[] args) {
		MatrixPath matrixPath = new MatrixPath();
		System.out.println(matrixPath.hasPath("ABCESFCSADEE".toCharArray(), 3, 4,"ABCCED".toCharArray()) + "--true");

	}

}
