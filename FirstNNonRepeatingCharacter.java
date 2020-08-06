
import java.util.*;

//stream c,v,b,d,b,c,v
//ans    c,c,c,c,c,v,d
//in O(n)


public class FirstNNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Character> queue = new LinkedList<>();
		Stack<Character> st = new Stack<Character>();
		while(sc.hasNext()) {
			char x = sc.next().charAt(0);
			if(queue.isEmpty()) {
				System.out.print(x + " ");
				queue.add(x);
			}else {
				
				if(queue.contains(x)) {
					if(queue.peek() == x) {
						queue.remove();		
						}
					System.out.print(queue.peek() + " ");
					}
				else {

				if(queue.contains(x)) {
					queue.remove(x);
				}else {
					queue.add(x);}
					System.out.print(queue.peek() + " ");
					
				}
		}
	}
		sc.close();
	}
}
