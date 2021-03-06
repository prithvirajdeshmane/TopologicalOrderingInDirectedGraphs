import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String data;
	private boolean visited;
	private List<Vertex> adjacencyList;
	
	public Vertex(String data) {
		this.data = data;
		this.adjacencyList = new ArrayList<Vertex>();
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(List<Vertex> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}

	public void addAdjacentVertex(Vertex v) {
		this.adjacencyList.add(v);
	}
	
	@Override
	public String toString() {
		return this.data;
	}
	
	
}
