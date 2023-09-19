import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
  // Private Attributes
  // The item stored at this tree's root, or null if the tree is empty.
  private T root;

    }
  private int count(int item) {
    if (this.isEmpty()) {
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

  public int count(int item) {
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

  public double average(){
    if(this.is_empty()){
      return 0.0;
    }
    count = this.Count();
    size = this.length();
    return count / size;

  }
  private int average_helper(){
    total = 0;
    if(this.root){
      total += 1;
    }
    for(Tree i: this.subtrees){
      total += this.average_helper();
    }
    return total;
  }
  @Override
  public boolean equals(Object o) {
    if (this.is_empty() & o.is_empty()) {
      return true;
    } else if (this.is_empty() || other.is_empty()) {
      return false;
    } else {
      if (this.root != other._root) {
        return false;
      }
      if (this.subtrees.length() != other._subtrees.length()) {
        return false;
      }
      return self._subtrees == other._subtrees;
    }
  }
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
