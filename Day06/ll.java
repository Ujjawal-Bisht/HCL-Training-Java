package Day06;

class node {
	int data ;
	node next ;
	
	node(int data){
		this.data = data ;
		this.next = null;
	}
}

public class ll {
	node head ;
	
	public void addEl(int n){
		node newNode = new node(n) ;
		if(head == null) {
			head = newNode ;
		}else {
			node curr = head ;
			while(curr.next != null) {
				curr = curr.next ;
			}
			curr.next = newNode ;
		}
	}
	
	public void display() {
		node temp = head ;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next ;
		}
	}
	
	public static void main(String[] args) {
		ll lst = new ll() ;
		lst.addEl(10);
		lst.addEl(20);
		lst.addEl(30);
		lst.addEl(40);
		
		lst.display();
	}
}
