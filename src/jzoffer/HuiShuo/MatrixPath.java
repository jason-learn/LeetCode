package HuiShuo;

//���û��ݷ��ĵݹ����ԣ��ж��ַ������Ƿ����һ���ַ���·��
public class MatrixPath {
	public boolean hasPath(char[] matrix,int rows,int cols,char[] str){
		if(matrix==null || rows==0 || cols==0 || str==null ||str.length==0)
			return false;
		//���ڲ����ظ�����ͬһ�����ӣ���Ҫ����һ��Boolean�����ж��Ƿ���ʹ�
		boolean[][] visited = new boolean[rows][cols];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				visited[i][j]=false;
		//����һ���ַ����±����ʼλ��
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
		//���ƥ�䵽����һ�������ҵ�·��
		if(index == str.length)
			return true;
		//i��j��ʾ���ڷ��ʵ�λ��
		//������ڵ�λ�ó����˾���ı߽�,�����ַ�����������ַ���ƥ�䣬���߸�λ���Ѿ����ʹ�
		if(i<0 || j<0 ||i==rows || j==cols || matrix[i*cols+j]!=str[index] || visited[i][j]==true)
			return false;
		
		
		//�״η��ʸ�λ��
		visited[i][j] = true;
		//���еݹ��ѯ
		boolean path = DFS(matrix,rows,cols,i+1,j,str,index+1,visited)||
				DFS(matrix,rows,cols,i,j+1,str,index+1,visited)||
				DFS(matrix,rows,cols,i-1,j,str,index+1,visited)||
				DFS(matrix,rows,cols,i,j-1,str,index+1,visited);
		//����λ�õ�·��������ʱ������λ�ñ�־λfalse
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
