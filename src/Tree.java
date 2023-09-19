public class Tree {

  private class Node{

    }
  private int count(int item) {
    if (this.isEmpty()) {
      return 0;
    } else {
      int num = 0;
      if(this.root == item){
        num += 1;
      }
      for(subtree x : this.getSubtrees()){
        num += x.count(item);
      }
      return num;

    }
  }
}

