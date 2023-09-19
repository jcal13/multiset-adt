public class Tree {
    Tree root;
    Tree subtrees;

    private static String str(){
        return Tree.str_indented();
    }

    private static String str_indented(Integer depth){
        if (Tree.is_empty()){
            return "";
        }
        else{
            StringBuilder s = new StringBuilder((" " * depth) + str(Tree.root) + '\n');
            for (Tree.root: subtree){
                s.append(subtree.str_indented(depth + 1));
            }
            return s.toString();
        }
    }

    private static String str_indented(){
        return "";
    }
}

