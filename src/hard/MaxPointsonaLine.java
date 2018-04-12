package hard;
import java.util.HashMap;

//149. Max Points on a Line

public class MaxPointsonaLine {
	public int maxPoints(Point[] points) {
		 if (points.length < 3) return points.length;//��������3��ֱ�����  
         
	        int max = 0;//���ڱ������ս���������ߵ��������  
	          
	        for (int i = 0; i < points.length; i++) {  
	            for (int j = 0; j < points.length; j++) {//�̶�������      
	                if (i == j) continue;  
	                int cnt = 2;//���ڱ������������б����ͬ�ĵ�ĸ����������������㣩  
	                int ycnt = 2;//���ڱ���yֵ��ͬ�ĵ�ĸ��������������б��ʱ���ó��� (x1-x2)/(y1-y2)  
	                  
	                if (points[i].y == points[j].y) {//�����������yֵ��ͬ����������(x1-x2)/(y1-y2)����б��  
	                    for (int k = 0; k < points.length; k++) {  
	                        if (k == i || k == j) continue;  
	                        if (points[k].y == points[i].y) ycnt++;  
	                    }  
	                } else {//�����������yֵ��ͬ��������(x1-x2)/(y1-y2)����б��  
	                    double k1 = (double)(points[j].x - points[i].x) / (points[j].y - points[i].y);//�̶����������б��  
	                    for (int k = 0; k < points.length; k++) {  
	                        if (k == i || k == j) continue;  
	                        double k2 = (double)(points[k].x - points[i].x) / (points[k].y - points[i].y);  
	                        double k3 = (double)(points[k].x - points[j].x) / (points[k].y - points[j].y);  
	                        if (k1 == k2 || k1 == k3) cnt++;//��Ϊ�������������̶����������е�ĳ���غϣ�����Ҫ�ֱ�����������ԭ���������б�ʡ��غ�ʱ��б�ʾͻ�Ϊ 0.0/0.0=NaN���ҿ���double���ͣ������ 0/0 �ͻᱨ��  
	                    }  
	                }  
	                if (cnt > max) max = cnt;//�����ǰ��������Ž⣬���滻ԭʼ���Ž�  
	                if (ycnt > max) max = ycnt;  
	            }  
	        }  
	        return max;  
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
