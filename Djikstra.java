class Pair{
  int node,weight;
  Pair(int node, int weight){
    this.node = node;
    this.weight = weight;
  }
}
class solution{
  public static void main(String[] args){
    // main method
  }
  public static void djk(ArrayList<ArrayList<Pair>> adj, int[] res, int src){
    Arrays.fill(res,Intger.MAX_VALUE/4);
    PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Integer.compare(a.weight,b.weight));
    pq.offer(new Pair(src,0));
    res[src] = 0;
    while(!pq.isEmpty()){
      Pair x = pq.poll();
      int node = x.node;
      int dist = x.weight;
      for(Pair pair : adj.get(node)){
        if(res[pair.node] > dist+pair.weight){
          res[pair.node] = dist+pair.weight;
          pq.offer(new Pair(pair.node,res[pair.node]));
        }
      }
    }
  }
  
}
