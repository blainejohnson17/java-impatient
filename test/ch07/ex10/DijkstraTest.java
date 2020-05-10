package ch07.ex10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class DijkstraTest {

  @Test
  void testSolve() {
    Map<String, Set<Neighbor>> graph = new HashMap<>();
    Set<Neighbor> aNeighbor = new HashSet<>();
    aNeighbor.add(new Neighbor("b", 6));
    aNeighbor.add(new Neighbor("d", 1));
    graph.put("a", aNeighbor);

    Set<Neighbor> bNeighbor = new HashSet<>();
    bNeighbor.add(new Neighbor("a", 6));
    bNeighbor.add(new Neighbor("c", 5));
    bNeighbor.add(new Neighbor("d", 2));
    bNeighbor.add(new Neighbor("e", 2));
    graph.put("b", bNeighbor);


    Set<Neighbor> cNeighbor = new HashSet<>();
    cNeighbor.add(new Neighbor("b", 5));
    cNeighbor.add(new Neighbor("e", 5));
    graph.put("c", cNeighbor);

    Set<Neighbor> dNeighbor = new HashSet<>();
    dNeighbor.add(new Neighbor("a", 1));
    dNeighbor.add(new Neighbor("b", 2));
    dNeighbor.add(new Neighbor("e", 1));
    graph.put("d", dNeighbor);

    Set<Neighbor> eNeighbor = new HashSet<>();
    eNeighbor.add(new Neighbor("b", 2));
    eNeighbor.add(new Neighbor("c", 5));
    eNeighbor.add(new Neighbor("d", 1));
    graph.put("e", eNeighbor);

    Map<String, Result> solution = Dijkstra.solve(graph, "a");

    assertEquals(new Result(0, null), solution.get("a"));
    assertEquals(new Result(3, "d"), solution.get("b"));
    assertEquals(new Result(7, "e"), solution.get("c"));
    assertEquals(new Result(1, "a"), solution.get("d"));
    assertEquals(new Result(2, "d"), solution.get("e"));
  }

}
