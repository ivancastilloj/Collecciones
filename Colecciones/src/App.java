import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		ArrayList<String> ciudades = new ArrayList<String>();

		ciudades.add("Madrid");
		ciudades.add("Paris");
		ciudades.add("Milan");
		ciudades.add("Milan");
		ciudades.add("Malaga");
		ciudades.add("Venecia");
		ciudades.add("Sevilla");

		System.out.println(ciudades);

		for (int i = 0; i < ciudades.size(); i++) {
			System.out.println(ciudades.get(i));
		}

		System.out.println("");

		Queue<String> cola = new PriorityQueue();

		cola.add("Pa");
		cola.add("Pa");
		cola.add("Pe");
		cola.add("Pi");
		cola.add("Po");
		cola.add("Pu");
		// cola.remove("Pu");
		// cola.poll();
		//
		// cola.poll();
		// System.out.println(cola.peek());
		// System.out.println(cola.element());

		System.out.println(cola);
		// for(String co : cola) {
		//
		//

		HashMap<Integer, String> hs = new HashMap<Integer, String>();

		hs.put(0, "Elena");
		hs.put(5, "Ivan");
		hs.put(3, "Julio");
		hs.put(11, "Agustin");

		System.out.println(hs);

		HashMap<String, String> hs1 = new HashMap<String, String>();

		hs1.put("Elena", "Elena");
		hs1.put("Ivan", "Ivan");
		hs1.put("Ivan", "Ivan");
		hs1.put("Julio", "Julio");
		hs1.put("Agustin", "Agustin");

		System.out.println(hs1);

		TreeSet<Integer> s = new TreeSet<Integer>();

		s.add(5);
		s.add(6);
		s.add(1);

		System.out.println(s);
		System.out.println("");
System.out.println("TreeSET con POJO");
System.out.println("");
		TreeSet<Book> set = new TreeSet<Book>();
		// Creating Books
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);

		// Adding Books to TreeSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		// Traversing TreeSet
		for (Book b : set) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
		

	}
}
