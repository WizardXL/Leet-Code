public class Solution {
	public boolean authString(String str) {
		for (int i = 0; i < str.length(); i++) {                                       //���ɾ��Դ�����ַ�
			if (auth(str.substring(0, i) + str.substring(i+1, str.length()))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean auth(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.codePointAt(i) != str.codePointAt(str.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
