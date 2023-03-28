package p2.extract_method.org;

import java.util.List;


public class ClassA extends Base {
  
	Node m1(List<Node> nodes,String p) {
		
		return null;
	}
	
	Edge m2(List<Edge> edges, String p) {
		
		ex(edges, p);
		return null;
	}
	
	<T extends Graph> void ex(List<T> objs, String p) {
		
		for (T obj : objs) {
			if (obj.contains(p)) 
				System.out.println(obj);
		}
		return;
	}
}

class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Graph {
	
}
class Edge extends Graph {
	
}


class Base {
  
}