import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
  // Private Attributes
  // The item stored at this tree's root, or null if the tree is empty.
  private T root;

  // The list of all subtrees of this tree.
  private List<Tree<T>> subtrees;

  public Tree(T root) {
    this.root = root;
    this.subtrees = new ArrayList<>();
  }

  public Tree(T root, List<Tree<T>> subtrees) {
    this.root = root;
    this.subtrees = new ArrayList<>(subtrees);
  }

  public T getRoot() {
    return root;
  }

  public List<Tree<T>> getSubtrees() {
    return subtrees;
  }

  public void setRoot(T root) {
    this.root = root;
  }

  public void setSubtrees(List<Tree<T>> subtrees) {
    this.subtrees = subtrees;
  }

  public boolean is_empty() {
    return (this.root == null);
  }

  public int count(T item) {
    if (this.is_empty()) {
      return 0;
    } else {
      int num = 0;
      if (this.root.equals(item)) {
        num += 1;
      }
      for (Tree<T> x : this.getSubtrees()) {
        num += x.count(item);
      }
      return num;
    }
  }

  public int length() {
    if (this.is_empty()) {
      return 0;
    } else {
      int size = 1;
      for (Tree<T> x : this.getSubtrees()) {
        size += x.length();
      }
      return size;
    }
  }
}
