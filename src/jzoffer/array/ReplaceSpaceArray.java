package array;

/*
����1���滻�ַ���������ԭ�����ַ��������滻�������¿���һ���ַ������滻��
����2���ڵ�ǰ�ַ����滻����ô�滻�Ÿ���Ч�ʣ�������java�����е�replace��������
      ��ǰ�����滻��������ַ�Ҫ���������ƶ���Ҫ����ƶ�������Ч�ʵ���
      �Ӻ���ǰ���ȼ�����Ҫ���ٿռ䣬Ȼ��Ӻ���ǰ�ƶ�����ÿ���ַ�ֻΪ�ƶ�һ�Σ�����Ч�ʸ���һ�㡣
*/
public class ReplaceSpaceArray {
	public String replaceSpace(StringBuffer str){
		int spacenum = 0;//ͳ�ƿո���Ŀ
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				spacenum++;
		}
		int indexold = str.length()-1;  //�滻ǰ��str�±�
		int newlength = str.length()+spacenum*2; //����ת������³���
		int indexnew = newlength-1; //�滻���str�±�
		str.setLength(newlength);
		for(;indexold>=0&&indexold<newlength;indexold--){
			 
			if(str.charAt(indexold)==' '){  
				str.setCharAt(indexnew--, '0');
				str.setCharAt(indexnew--, '2');
				str.setCharAt(indexnew--, '%');
			}
		 
			else {
				str.setCharAt(indexnew--, str.charAt(indexold));
			}
		}
		//��stringbuffer����ת��Wiestring����
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceSpaceArray r = new ReplaceSpaceArray();
		//��string����ת��Ϊstringbuffer����
		StringBuffer str = new StringBuffer("we are happy");
		System.out.println(r.replaceSpace(str));

	}

}
