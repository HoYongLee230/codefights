//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
boolean isTreeSymmetric(Tree<Integer> t) {
    if(t == null || (t.left == null && t.right == null))
        return true;
    if((t.left == null && t.right != null) || (t.left != null && t.right == null) || !t.left.value.equals(t.right.value))
        return false;
    Queue<Tree<Integer>> qLeft = new LinkedList<>(), qRight = new LinkedList<>();
    List<Integer> left = new ArrayList<>(), right = new ArrayList<>();
    qLeft.add(t.left);
    qRight.add(t.right);
    left.add(t.left.value);
    right.add(t.right.value);
    while(!qLeft.isEmpty()) {
        Tree<Integer> tempL = qLeft.remove();
        if(tempL.left != null) 
            qLeft.add(tempL.left);
        left.add(tempL.left != null?tempL.left.value:null);
        if(tempL.right != null)
            qLeft.add(tempL.right);
        left.add(tempL.right != null?tempL.right.value:null);
    }
    while(!qRight.isEmpty()) {
        Tree<Integer> tempR = qRight.remove();
        if(tempR.right != null)
            qRight.add(tempR.right);
        right.add(tempR.right != null?tempR.right.value:null);
        if(tempR.left != null) 
            qRight.add(tempR.left);
        right.add(tempR.left != null?tempR.left.value:null);
    }
    for(int i = 0; i < Math.min(left.size(), right.size()); i++) {
        if((left.get(i) == null && right.get(i) != null) || (left.get(i) != null && right.get(i) == null) || (left.get(i) != null && !left.get(i).equals(right.get(i))))
            return false;
    }
    return true;
}
