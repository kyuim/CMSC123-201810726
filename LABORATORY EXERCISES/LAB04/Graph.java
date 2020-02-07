import java.io.*; 
import java.util.*; 
  

class Graph 
{ 
    private int V;   
    private LinkedList<Integer> list[]; 
  
    
    Graph(int v) 
    { 
        V = v; 
        list = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            {list[i] = new LinkedList(); }
    } 
  

    void addEdge(int v,int w) 
    { list[v].add(w); } 
  
  
    void topologicalSortUtil(int v, boolean visited[], Stack stack) 
    { 
       
        visited[v] = true; 
        Integer i; 
  
      
        Iterator<Integer> it = list[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
            if (!visited[i]) 
               { topologicalSortUtil(i, visited, stack); }
        } 
  
    
        stack.push(new Integer(v)); 
    } 
   
    void topologicalSort() 
    { 
        Stack stack = new Stack(); 
 
        boolean visited[] = new boolean[V]; 
        for (int i = 0; i < V; i++) 
            {visited[i] = false; }
  

        for (int i = 0; i < V; i++) 
            if (visited[i] == false) 
                {topologicalSortUtil(i, visited, stack); }
   
        while (stack.empty()==false) 
            {System.out.print(stack.pop() + " "); }
    } 
 
    public static void main(String args[]) 
    { 

        Graph g = new Graph(6); 
        g.addEdge(5, 1); 
        g.addEdge(5, 3); 
        g.addEdge(4, 0); 
        g.addEdge(4, 1); 
        g.addEdge(1, 2); 
        g.addEdge(3, 1); 
  
        g.topologicalSort();
    } 
}