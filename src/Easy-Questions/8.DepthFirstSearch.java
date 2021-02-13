import java.util.*;

/*
    Depth First Search (DFS) Question
    ----------------------------------
*/


/*
    Only Solution - Simple DFS

    - O(v + e) time | O(v) space

    - O(v + e) time because the search
      only involves visiting the vertices
      and edges within the tree.

    - O(v) space because no additional
      memory is required to iterate
      through the array.
 */



class Program {

    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        pulbic Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            array.add(this.name);
            for (int i = 0; i < children.size(); i++) {
                children.get(i).depthFirstSearch(array);
            }
            return array;
        }

        public Node addChild(String name) {
            Node childre = new Node(name);
            children.add(child);
            return this;
        }
    }
}
