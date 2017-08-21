package easy;

import java.util.Arrays;

public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		//将g和s排序
        Arrays.sort(g);
        Arrays.sort(s);
        int num=0;
        //找到最小的比g[i]大的数，g和s同时标记0
        for(int i=0;i<g.length;i++){
        	for(int j=0;j<s.length;j++){
        		if(g[i]<=s[j])
        		{
        			g[i]=0;
        			s[j]=0; 
        			break;
        		}
        	}
        }
        //找到g中标记的数目
        for(int i=0;i<g.length;i++){
        	if(g[i]==0)
        		num++;
        }
         
		return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignCookies a = new AssignCookies();
		int[] g={1,2,3};
		int[] s={1,1};
		System.out.println(a.findContentChildren(g, s));
		

	}

}
