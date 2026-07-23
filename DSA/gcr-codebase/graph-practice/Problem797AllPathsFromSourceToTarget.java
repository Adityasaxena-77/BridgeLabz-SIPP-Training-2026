import java.util.ArrayList;
import java.util.List;

public class Problem797AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        System.out.println(allPathsSourceTarget(graph));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(graph, 0, graph.length - 1, path, result);
        return result;
    }

    private static void dfs(int[][] graph, int node, int target, List<Integer> path, List<List<Integer>> result) {
        path.add(node);
        if (node == target) {
            result.add(new ArrayList<>(path));
        } else {
            for (int next : graph[node]) {
                dfs(graph, next, target, path, result);
            }
        }
        path.remove(path.size() - 1);
    }
}
