package hackthon;

public class StringEn {
	static final int Max = 26;
	static String encryptStr(String str, int n, int x) {
		x = x%Max;
		char arr[] = str.toCharArray();
		int freq[] = new int[Max];
		for(int i = 0;i<n;i++) {
			freq[arr[i] - 'a']++;
			
		}
		for(int i = 0;i<n;i++) {
			if(freq[arr[i] - 'a'] %2 ==0) {
				int pos = (arr[i] - 'a' +x) % Max;
				arr[i] = (char)(pos +'a');
			}
			else {
				int pos = (arr[i] -'a'-x);
				if(pos<0)
					pos +=Max;
				arr[i] = (char)(pos +'a');
			}
		}
		
		
		return String.valueOf(arr);
	}
	public static void main(String[] args) {
		String s = "abcda";
		int n = s.length();
		int x = 3;
		System.out.println(encryptStr(s, n, x));
	}

}
