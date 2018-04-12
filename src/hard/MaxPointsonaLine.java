package hard;
import java.util.HashMap;

//149. Max Points on a Line

public class MaxPointsonaLine {
	public int maxPoints(Point[] points) {
		 if (points.length < 3) return points.length;//点数少于3，直接输出  
         
	        int max = 0;//用于保存最终结果，即共线点的最大个数  
	          
	        for (int i = 0; i < points.length; i++) {  
	            for (int j = 0; j < points.length; j++) {//固定两个点      
	                if (i == j) continue;  
	                int cnt = 2;//用于保存跟这两个点斜率相同的点的个数（包括这两个点）  
	                int ycnt = 2;//用于保存y值相同的点的个数，本代码计算斜率时误用成了 (x1-x2)/(y1-y2)  
	                  
	                if (points[i].y == points[j].y) {//如果这两个点y值相同，不用能用(x1-x2)/(y1-y2)计算斜率  
	                    for (int k = 0; k < points.length; k++) {  
	                        if (k == i || k == j) continue;  
	                        if (points[k].y == points[i].y) ycnt++;  
	                    }  
	                } else {//如果这两个点y值不同，可以用(x1-x2)/(y1-y2)计算斜率  
	                    double k1 = (double)(points[j].x - points[i].x) / (points[j].y - points[i].y);//固定的两个点的斜率  
	                    for (int k = 0; k < points.length; k++) {  
	                        if (k == i || k == j) continue;  
	                        double k2 = (double)(points[k].x - points[i].x) / (points[k].y - points[i].y);  
	                        double k3 = (double)(points[k].x - points[j].x) / (points[k].y - points[j].y);  
	                        if (k1 == k2 || k1 == k3) cnt++;//因为第三个点可能与固定的两个点中的某个重合，所以要分别计算这个点与原来两个点的斜率。重合时，斜率就会为 0.0/0.0=NaN。幸亏是double类型，如果是 0/0 就会报错  
	                    }  
	                }  
	                if (cnt > max) max = cnt;//如果当前解大于最优解，则替换原始最优解  
	                if (ycnt > max) max = ycnt;  
	            }  
	        }  
	        return max;  
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
