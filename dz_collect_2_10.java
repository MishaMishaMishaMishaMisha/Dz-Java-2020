import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;


class Tree
{
    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node nodeA) 
    {
        nodes.add(nodeA);
    }

    public Set<Node> getNodes() 
    {
        return nodes;
    }

    public void setNodes(Set<Node> nodes) 
    {
        this.nodes = nodes;
    }
}


class Node 
{
    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map<Node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Node destination, int distance) 
    {
        adjacentNodes.put(destination, distance);
    }

    public Node(String name) 
    {
        this.name = name;
    }

   public void setDistance(int d)
   {
	   distance = d;
   }
   
   public void setShortestPath(List l)
   {
	   shortestPath = l;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public int getDistance()
   {
	   return distance;
   }
   
   public Map<Node, Integer> getAdjacentNodes()
   {
	   return  adjacentNodes;
   }
   
   public List getShortestPath()
   {
	   return shortestPath;
   }
}


class Dijkstra
{
	public static Tree calculateShortestPathFromSource(Tree t, Node source) 
	{
	    source.setDistance(0);

	    Set<Node> settledNodes = new HashSet<>();
	    Set<Node> unsettledNodes = new HashSet<>();

	    unsettledNodes.add(source);

	    while (unsettledNodes.size() != 0) 
	    {
	        Node currentNode = getLowestDistanceNode(unsettledNodes);
	        unsettledNodes.remove(currentNode);
	        for (Entry<Node, Integer> adjacencyPair: currentNode.getAdjacentNodes().entrySet()) 
	        {
	            Node adjacentNode = adjacencyPair.getKey();
	            Integer edgeWeight = adjacencyPair.getValue();
	            if (!settledNodes.contains(adjacentNode)) 
	            {
	                CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
	                unsettledNodes.add(adjacentNode);
	            }
	        }
	        settledNodes.add(currentNode);
	    }
	    return t;
	}
	
	public static Node getLowestDistanceNode(Set < Node > unsettledNodes) 
	{
	    Node lowestDistanceNode = null;
	    int lowestDistance = Integer.MAX_VALUE;
	    for (Node node: unsettledNodes) 
	    {
	        int nodeDistance = node.getDistance();
	        if (nodeDistance < lowestDistance) 
	        {
	            lowestDistance = nodeDistance;
	            lowestDistanceNode = node;
	        }
	    }
	    return lowestDistanceNode;
	}
	
	public static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) 
	{
	    Integer sourceDistance = sourceNode.getDistance();
	    if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) 
	    {
	        evaluationNode.setDistance(sourceDistance + edgeWeigh);
	        LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
	        shortestPath.add(sourceNode);
	        evaluationNode.setShortestPath(shortestPath);
	    }
	}
}



class dz_collect_2_10
{
	public static boolean nodeContains(ArrayList<Node> ar, String name)
	{
		for (int i = 0; i < ar.size(); i++)
		{
			if (ar.get(i).getName().equals(name))
			{
				return true;
			}
		}
		return false;
	}
	
	public static void setDist(ArrayList<Node> ar, String name1, String name2, int d)
	{
		int ind1 = 0;
		int ind2 = 0;
		for (int i = 0; i < ar.size(); i++)
		{
			if (ar.get(i).getName().equals(name1))
			{
				ind1 = i;
			}
			if (ar.get(i).getName().equals(name2))
			{
				ind2 = i;
			}
		}
		
		ar.get(ind1).addDestination(ar.get(ind2), d);
	}
	
	
	public static void main(String[] args)
	{
        ArrayList<Node> ar = new ArrayList<Node>();
		
		try(FileReader reader = new FileReader("roads.txt"))        // Рядки записані у вигляді: Місто1 Місто2 відстань між ними (Київ Одеса 480)
        {
        	BufferedReader breader = new BufferedReader(reader);
            String line = breader.readLine();
            while (line != null) 
            {
            	String[] AR = line.split(" ");
            	if (!nodeContains(ar, AR[0]))
            	{
            		ar.add(new Node(AR[0]));
            	}
            	if (!nodeContains(ar, AR[1]))
            	{
            		ar.add(new Node(AR[1]));
            	}
            	setDist(ar, AR[0], AR[1], Integer.valueOf(AR[2]));

                line = breader.readLine();
            }
        }
        catch(IOException ex)
        {
             
            System.out.println(ex.getMessage());
        }
		
		int indOfKyiv = ar.indexOf("Київ");
		Tree tree = new Tree();
		for (int i = 0; i < ar.size(); i++)
		{
			tree.addNode(ar.get(i));
		}
		
		tree = Dijkstra.calculateShortestPathFromSource(tree, ar.get(indOfKyiv)); 
	}
}









