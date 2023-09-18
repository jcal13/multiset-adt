public class Tree {

    public int count(Object item) {

        if (this.is_empty()) {
            return 0;
        } else {

            int num = 0;

            if (this.root == item) {
                num += 1;
            }

            for (Tree subtree : this.subtrees) {
                num += subtree.count(item);
            }

            return num;
        }
    }

    public String toString() {
        return this.str_indented();
    }

    private String str_indented(int depth) {

        if (this.is_empty()) {
            return "";
        } else {
            String s = "  ".repeat(depth) + toString(this.root) + "\n";
            for (Tree subtree : this.subtrees) {
                s += subtree.str_indented(depth + 1);
            }

            return s;

        }
    }

    private String str_indented() {
        return this.str_indented(0);
    }
}
