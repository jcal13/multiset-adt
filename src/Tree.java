import java.util.*;
import java.util.Random;
import java.time.*;

public class Tree<T> {

    private T root;
    private ArrayList<Tree> subtrees;

    public Tree(T root, ArrayList<Tree> subtrees) {
        this.root = root;

        if (subtrees == null) {
            this.subtrees = new ArrayList<>();
        }
        else{
            this.subtrees = subtrees;
        }
    }

    public T getRoot() {
        return root;
    }

    public ArrayList<Tree> getSubtrees() {
        return subtrees;
    }

    public boolean is_empty() {
        return this.root == null;
    }

    public int size() {
        if (is_empty()) {
            return 0;
        }
        else {
            int size = 1;
            for (Tree subtree : subtrees) {
                size += subtree.size();
            }
            return size;
        }
    }

    public int count(T item) {
        if (is_empty()) {
            return 0;
        }
        else {
            int num = 0;
            if (root == item) {
                num += 1;
            }
            for (Tree subtree : subtrees) {
                num += subtree.count(item);
            }
            return num;
        }
    }

    public String toString() {
        return toStringIndented(0);
    }

    private String toStringIndented(int depth) {

        if (is_empty()) {
            return "";
        }
        else {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < depth; i++) {
                s.append("  ");
            }
            s.append((String) root + "\n");
            for (Tree subtree : subtrees) {
                s.append(subtree.toStringIndented(depth + 1));
            }
            return s.toString();
        }

    }

    public float average() {
        if (is_empty()) {
            return 0f;
        }
        else {
            List<Integer> average = average_helper();
            float total = average.get(0);
            float count = average.get(1);
            return total / count;
        }
    }

    private List<Integer> average_helper() {
        if (is_empty()) {
            return Arrays.asList(0, 0);
        }
        else {
            int total = (int) root;
            int size = 1;
            for (Tree subtree: subtrees) {
                List<Integer> average = subtree.average_helper();
                int subtree_total = average.get(0);
                int subtree_size = average.get(1);
                total += subtree_total;
                size += subtree_size;
            }
            return Arrays.asList(total, size);
        }
    }

    public boolean equals(Tree other) {
        if (is_empty() && other.is_empty()) {
            return true;
        }
        else if (is_empty() || other.is_empty()) {
            return false;
        }
        else {

            if (root != other.getRoot()) {
                return false;
            }

            if (subtrees.size() != other.getSubtrees().size()) {
                return false;
            }

            return subtrees == other.getSubtrees();

        }
    }

    public boolean contains(T item) {
        if (is_empty()) {
            return false;
        }

        if (root == item) {
            return true;
        }
        else {
            for (Tree subtree: subtrees) {
                if (subtree.contains(item)) {
                    return true;
                }
            }
            return false;
        }
    }

    public List<T> leaves() {
        if (is_empty()) {
            return Arrays.asList();
        }
        else if (subtrees.isEmpty()) {
            return Arrays.asList(root);
        }
        else {
            ArrayList<T> leaves = new ArrayList<>();
            for (Tree subtree : subtrees) {
                leaves.addAll(subtree.leaves());
            }
            return leaves;
        }
    }

    public boolean deleteItem(T item) {
        if (is_empty()) {
            return false;
        }
        else if (root == item) {
            deleteRoot();
            return true;
        }
        else {
            for (Tree subtree: subtrees) {
                boolean deleted = subtree.deleteItem(item);
                if (deleted && subtree.is_empty()) {
                    subtrees.remove(subtree);
                    return true;
                }
                else if (deleted) {
                    return true;
                }
            }
            return false;
        }

    }

    private void deleteRoot() {
        if (subtrees.isEmpty()) {
            root = null;
        }
        else {
            Tree choseSubtree = subtrees.remove(subtrees.size() - 1);

            root = (T)choseSubtree.getRoot();
            subtrees.addAll(choseSubtree.getSubtrees());
        }
    }

    private T extractLeaf() {
        if (subtrees.isEmpty()) {
            T oldRoot = root;
            root = null;
            return oldRoot;
        }
        else {
            T leaf = (T)subtrees.get(0).extractLeaf();

            if (subtrees.get(0).is_empty()) {
                subtrees.remove(0);
            }

            return leaf;
        }
    }

    public void insert(T item) {

        if (is_empty()) {
            root = item;
        }
        else if (subtrees.isEmpty()) {
            subtrees = new ArrayList<Tree>();
            subtrees.add(new Tree(item, new ArrayList<>()));
        }
        else {
            Random random = new Random();
            int randomInt = random.nextInt(3) + 1;

            if (randomInt == 3) {
                subtrees = new ArrayList<Tree>();
                subtrees.add(new Tree(item, new ArrayList<>()));
            }
            else {
                int subtreeIndex = random.nextInt(subtrees.size() - 1);
                subtrees.get(subtreeIndex).insert(item);
            }
        }

    }

    public boolean insertChild(T item, T parent) {
        if (is_empty()) {
            return false;
        }
        else if (root == parent) {
            subtrees = new ArrayList<Tree>();
            subtrees.add(new Tree(item, new ArrayList<>()));
            return true;
        }
        else {
            for (Tree subtree : subtrees) {
                if (subtree.insertChild(item, parent)) {
                    return true;
                }
            }
            return false;
        }
    }
}
