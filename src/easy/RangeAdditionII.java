package easy;

//598. Range Addition II
public class RangeAdditionII {
	public int maxCount(int m, int n, int[][] ops) {
		//寻找最小公共子集，比较长度
		int length=m;
		int width=n;
		for(int i=0;i<ops.length;i++){
			ops[i][0]=Math.min(ops[i][0], m);
			ops[i][1]=Math.min(ops[i][1], n);
			length = Math.min(length, ops[i][0]);
			width = Math.min(width, ops[i][1]);
		}
		return length*width;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeAdditionII r = new RangeAdditionII();
		int m = 3;
		int n = 3;
		int[][] ops = {{2,3},{3,2}};
		System.out.println(r.maxCount(m, n, ops));

	}

}
