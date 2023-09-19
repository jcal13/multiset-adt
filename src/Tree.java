public class Tree {

  private class Node{

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

