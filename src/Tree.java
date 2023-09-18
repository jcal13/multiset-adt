import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Tree<T> {
	private T root;
	private List<Tree<T>> subtrees;

	public Tree(T root, List<Tree<T>> subtrees) {
		this.root = root;
		this.subtrees = new ArrayList<>(subtrees);
	}

	public Tree(T root) {
		this(root, new ArrayList<>());
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int size = 1;  // count the root
			for (Tree<T> subtree : subtrees) {
				size += subtree.size();
			}
			return size;
		}
	}

	public int count(T item) {
		if (isEmpty()) {
			return 0;
		} else {
			int num = 0;
			if (root.equals(item)) {
				num += 1;
			}
			for (Tree<T> subtree : subtrees) {
				num += subtree.count(item);
			}
			return num;
		}
	}

	@Override
	public String toString() {
		return toStringIndented(0);
	}

	private String toStringIndented(int depth) {
		if (isEmpty()) {
			return "";
		} else {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < depth; i++) {
				builder.append("  ");
			}
			builder.append(root).append("\n");
			for (Tree<T> subtree : subtrees) {
				builder.append(subtree.toStringIndented(depth + 1));
			}
			return builder.toString();
		}
	}

	public float average() {
		if (isEmpty()) {
			return 0.0f;
		} else {
			float[] result = averageHelper();
			return result[0] / result[1];
		}
	}

	private float[] averageHelper() {
		if (isEmpty()) {
			return new float[]{0.0f, 0.0f};
		} else {
			float total = 0.0f;
			float count = 0.0f;
			total += ((Number) root).floatValue();
			count += 1.0f;
			for (Tree<T> subtree : subtrees) {
				float[] subtreeResult = subtree.averageHelper();
				total += subtreeResult[0];
				count += subtreeResult[1];
			}
			return new float[]{total, count};
		}
	}

	public boolean equals(Tree<T> other) {
		if (isEmpty() && other.isEmpty()) {
			return true;
		} else if (isEmpty() || other.isEmpty()) {
			return false;
		} else {
			if (!root.equals(other.root)) {
				return false;
			}

			if (subtrees.size() != other.subtrees.size()) {
				return false;
			}

			for (int i = 0; i < subtrees.size(); i++) {
				if (!subtrees.get(i).equals(other.subtrees.get(i))) {
					return false;
				}
			}

			return true;
		}
	}

	public boolean contains(T item) {
		if (isEmpty()) {
			return false;
		} else if (root.equals(item)) {
			return true;
		} else {
			for (Tree<T> subtree : subtrees) {
				if (subtree.contains(item)) {
					return true;
				}
			}
			return false;
		}
	}

	public List<T> leaves() {
		if (isEmpty()) {
			return new ArrayList<>();
		} else if (subtrees.isEmpty()) {
			return List.of(root);
		} else {
			List<T> result = new ArrayList<>();
			for (Tree<T> subtree : subtrees) {
				result.addAll(subtree.leaves());
			}
			return result;
		}
	}

	public boolean deleteItem(T item) {
		if (isEmpty()) {
			return false;
		} else if (root.equals(item)) {
			deleteRoot();
			return true;
		} else {
			for (Tree<T> subtree : subtrees) {
				if (subtree.deleteItem(item)) {
					if (subtree.isEmpty()) {
						subtrees.remove(subtree);
					}
					return true;
				}
			}
			return false;
		}
	}

	private void deleteRoot() {
		if (subtrees.isEmpty()) {
			root = null;
		} else {
			Tree<T> chosenSubtree = subtrees.remove(subtrees.size() - 1);
			root = chosenSubtree.root;
			subtrees.addAll(chosenSubtree.subtrees);
		}
	}

	public void insert(T item) {
		if (isEmpty()) {
			root = item;
		} else if (subtrees.isEmpty()) {
			subtrees.add(new Tree<>(item));
		} else {
			int random = new Random().nextInt(3) + 1;
			if (random == 3) {
				subtrees.add(new Tree<>(item));
			} else {
				int subtreeIndex = new Random().nextInt(subtrees.size());
				subtrees.get(subtreeIndex).insert(item);
			}
		}
	}

	public boolean insertChild(T item, T parent) {
		if (isEmpty()) {
			return false;
		} else if (root.equals(parent)) {
			subtrees.add(new Tree<>(item));
			return true;
		} else {
			for (Tree<T> subtree : subtrees) {
				if (subtree.insertChild(item, parent)) {
					return true;
				}
			}
			return false;
		}
	}
}
