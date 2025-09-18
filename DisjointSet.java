class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n = accounts.size();
        int[] rank = new int[n];
        int[] parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
     private int findParent(int node, int[] rank, int[] parent) {
        if (node == parent[node])
            return node;
        int ult = findParent(parent[node], rank ,parent);
        parent[node] = ult;
        return ult;
    }

    private void union(int u, int v,int[] rank, int[] parent) {
        int pu = findParent(u, rank, parent);
        int pv = findParent(v ,rank, parent);
        if (pu == pv)
            return;
        int ru = rank[pu];
        int rv = rank[pv];
        if (ru > rv) {
            parent[pv] = parent[pu];
        } else if (ru < rv) {
            parent[pu] = parent[pv];
        } else {
            parent[pv] = parent[pu];
            rank[pu]++;
        }
    }
}
