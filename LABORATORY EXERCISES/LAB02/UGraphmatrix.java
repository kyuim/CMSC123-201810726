import java.util.LinkedList;

public class UGraphmatrix 
{
    static class Edge 
    {
        int source, destination, weight;

        public Edge(int source, int destination, int weight) 
        {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class MatrixGraph 
    {
        int v;
        LinkedList<Edge> [] adjacencymatrix;

        MatrixGraph(int v) 
        {
            this.v = v;
            adjacencymatrix = new LinkedList[v];
            
            for (int i = 0; i <v ; i++) 
            {
                adjacencymatrix[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination, int weight) 
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge);
        }

        /*public void printGraph()
        {
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Edge> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }*/

        public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < v; i++) {
            s.append(i + ": ");
            for (boolean j : adjacencymatrix[i]) {
                s.append((j?1:0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    }
      public static void main(String[] args) {
            int vertices = 6;
            Graph graph = new Graph(vertices);
            graph.addEgde(0, 1, 4);
            graph.addEgde(0, 2, 3);
            graph.addEgde(1, 3, 2);
            graph.addEgde(1, 2, 5);
            graph.addEgde(2, 3, 7);
            graph.addEgde(3, 4, 2);
            graph.addEgde(4, 0, 4);
            graph.addEgde(4, 1, 4);
            graph.addEgde(4, 5, 6);
        
            //graph.printGraph();

            System.out.print(g.toString());
        }

}
