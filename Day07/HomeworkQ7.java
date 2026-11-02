package Day07;

public class HomeworkQ7 {
	static void show(Object o) {
		System.out.println("Object");    
		}
	static void show(String s) {
		System.out.println("String");    
		}    
	static void show(int n) {
		System.out.println("int");    
		}    
	static void show(long n) { 
		System.out.println("long");    
		}   
	public static void main(String[] args) {
		Object o = null;        
		Integer i = 7;        
		show(null);        
		show((Object) "Java");      
		show('A');        
		show(10L);        
		show(5);        
		show(o);        
		show(i);    
	}
}
