import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
	
	public static void main(String[] args) {
		
		TopologicalOrdering topologicalOrdering = new TopologicalOrdering();
		
		List<Vertex> graph = new ArrayList<Vertex>();
		
		graph.add(new Vertex("0"));
		graph.add(new Vertex("1"));
		graph.add(new Vertex("2"));
		graph.add(new Vertex("3"));
		graph.add(new Vertex("4"));
		graph.add(new Vertex("5"));
		
		//Create adjacencies
		graph.get(2).addAdjacentVertex(graph.get(3));
		
		graph.get(3).addAdjacentVertex(graph.get(1));
		
		graph.get(4).addAdjacentVertex(graph.get(0));
		graph.get(4).addAdjacentVertex(graph.get(1));
		
		graph.get(5).addAdjacentVertex(graph.get(0));
		graph.get(5).addAdjacentVertex(graph.get(2));
		
		for (int i = 0; i < graph.size(); ++i) {
			Vertex v = graph.get(i);
			if(!v.isVisited()) {
				topologicalOrdering.dfs(v);
			}
		}
		
		Stack<Vertex> stack = topologicalOrdering.getStack();
		
		int originalStackSize = stack.size();
		for (int i = 0; i < originalStackSize; i++) {
			Vertex v = stack.pop();
			System.out.println(v + " -> ");
		}
		
	}
	
}
