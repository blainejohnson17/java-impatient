package ch07.ex10;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Dijkstra {


  public static Map<String, Result> solve(Map<String, Set<Neighbor>> graph, String start) {
    if (!graph.containsKey(start)) {
      throw new IllegalArgumentException("Graph must include start");
    }

    PriorityQueue<Neighbor> queue = new PriorityQueue<>();
    Map<String, Result> solution = new HashMap<>();

    graph.forEach((name, neighbors) -> {
      if (name == start) {
        solution.put(name, new Result(0, null));
        queue.add(new Neighbor(name, 0));
      } else {
        solution.put(name, new Result(Integer.MAX_VALUE, null));
        queue.add(new Neighbor(name, Integer.MAX_VALUE));
      }
    });

    while (!queue.isEmpty()) {
      Neighbor node = queue.remove();
      if (node.getDistance() == Integer.MAX_VALUE) {
        break;
      }
      graph.get(node.getName()).forEach(neighbor -> {
        if (queue.contains(neighbor)) {
          int newDistance = neighbor.getDistance() + node.getDistance();
          if (newDistance < solution.get(neighbor.getName()).getDistance()) {
            solution.put(neighbor.getName(), new Result(newDistance, node.getName()));
            queue.remove(neighbor);
            queue.add(new Neighbor(neighbor.getName(), newDistance));
          }
        }
      });
    }

    return solution;
  }
}
