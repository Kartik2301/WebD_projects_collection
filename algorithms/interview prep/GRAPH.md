Use Cases: Shortest path in an unweighted graph, Shortest path in a grid, Can be used to find the shortest weight in a graph with binary edge weights (https://cp-algorithms.com/graph/01_bfs.html)
  1. https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1?page=1&category=BFS&sortBy=submissions
  2. https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1?page=1&category=BFS&sortBy=submissions
  3. https://www.geeksforgeeks.org/problems/shortest-source-to-destination-path3544/1?page=1&category=BFS&sortBy=submissions
  4. https://www.geeksforgeeks.org/problems/knight-walk4521/1?page=1&category=BFS&sortBy=submissions

Spread / Fire Pattern: Pick the sources of fire and put them in the queue and start a multi source BFS
  1. https://leetcode.com/problems/rotting-oranges/description/
  2. https://leetcode.com/problems/as-far-from-land-as-possible/description/
  3. https://leetcode.com/problems/01-matrix/description/
  4. https://cses.fi/problemset/task/1194 (Fire Pattern + BFS)

DFS Depth First Search
Use Cases: Useful when traversing the graph matters more than traversing in a particular order.
  1. https://leetcode.com/problems/number-of-islands/description/
  2. https://www.geeksforgeeks.org/problems/replace-os-with-xs0052/1?
  3. https://leetcode.com/problems/number-of-closed-islands/description/

 Time Complexity (BFS / DFS): O(V+E)
  
  Brief derivation: BFS will be called for all the vertices so O(V)
    
    => For each vertice we'll explore it's neighbors 
    
    TC: O(V) + O(x1) + O(X2) + ... + O(Xv)
      = O(V) + O(2E) : for undirected graph, as the edges are undirected so u -> v and v -> u are treated separately, hence the inner loop will run double the times
      = O(V) + O(E) for directed graph

Cycle Detection
1. Undirected Graph: https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1 [BFS / DFS]
2. Directed Graph: https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1 DFS / [BFS (Kahn's algorithm)]
3. https://www.geeksforgeeks.org/problems/eventual-safe-states/1
4. Printing cycle in undirected / Directed graph: https://cp-algorithms.com/graph/finding-cycle.html [problem - https://cses.fi/problemset/task/1669]
https://cp-algorithms.com/graph/finding-cycle.html

Toplogical Sort [DFS / BFS (Kahn's algorithm)]
Use Cases: Detect cycle in a graph, Find shortest distances in a DAG (single source shortest path algorithm), Count number of paths to a node in a DAG 
1. https://www.geeksforgeeks.org/problems/topological-sort/1
2. Cycle Detection Using Toplogical Sort: https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1
3. Shortest Path in Directed Acyclic Weighted Graph: https://www.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1
4. Count number of paths to a node in a DAG https://cses.fi/problemset/task/1681 - If the graph is a unweighted DAG we can calculate the all the ways to reach a node (or number of paths using the Toplogical sort algorithm).

Shortest Paths
**Shortest path in unweighted [directed / undirected] graph - BFS**

1. Print Shortest path - https://cses.fi/problemset/task/1667
2. Count Number of shortest paths: https://www.geeksforgeeks.org/number-shortest-paths-unweighted-directed-graph/](https://atcoder.jp/contests/abc211/tasks/abc211_d
3. Print all paths: Recurssion / Backtracking
4. If the graph is DAG, then we an use toplogical sort to find the number of paths to each node.

**Shortest path in weighted DAG - Topological Sort**

**Shortest path in weighted [directed / undirected] graph (no negative cycle) - Dijkstra**

4. https://www.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
5. https://www.geeksforgeeks.org/problems/minimum-cost-path3833/1?page=2&category=Graph&sortBy=submissions
6. Find K shortest paths to the destination - https://cses.fi/problemset/task/1196/

Finding bridges in the graph
1. https://www.geeksforgeeks.org/problems/critical-connections/1?page=3&category=Graph&sortBy=submissions



Path Based Questions:
1. Find shortest path in non-weighted (or unit weighted) undirected or directed graph: BFS
2. Count number of shortest paths in a non-weighted graph: BFS
3. Count number of shortest paths in a weighted graph: Dijkstra
4. Count the number of all paths (all the ways) to reach a node in a "DAG": Topological Sort
5. Find the shortest path in a DAG: Topological Sort
6. Print shortest paths: BFS / Dijkstra using Parent array
7. Detect Negative cycle: Bellamn Ford or Floyd Warshall
8. Single source shortest path algorithms: Dijkstra, Bellman Ford
9. All shource shortest path algorithms: Floyd Warshall
10. Find all the paths to a destination in a directed / undirected graph containing cycles (not a DAG): Backtracking, DP based solutions.
