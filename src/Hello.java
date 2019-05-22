
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.print("hello java");
		
		String s = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String answer = "";
		int i, j, size = s.length();
		char[] ch = s.toCharArray();
		char arr;
		
		for(i = 0; i < ch.length-1; i++) {
			for(j = 1; j < ch.length-i; j++) {
				if(ch[j-1] > ch[j]) {
					arr = ch[j-1];
					ch[j-1] = ch[j];
					ch[j] = arr;
				}
			}
		}
		
//		System.out.print(s.length()-1);
//		System.out.print(ch.length-1);
//		System.out.print(size-1);
		System.out.println(s);
		System.out.print(ch);
	}

}

//  if('A' <= ch && ch <= 'Z') >> 대소문자 구분
// 

class Solution {
	  public String solution(String s) {
	      String answer = "";
	      int i, j, size = s.length();
	      char[] ch = s.toCharArray();
	      char arr;
	      
	      for(i = 0; i < size-1; i++) {
	          for(j = 1; j < size-i; j++) {
	              if(ch[j-1] > ch[j]) {
	                  arr = ch[j-1];
	                  ch[j-1] = ch[j];
	                  ch[j] = arr;
	              }              
	          }
	          
	          
//	          answer = ch;
	      
	      }
//	      System.out.print(ch);
	      return answer;
	  }
	}