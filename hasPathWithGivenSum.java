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
boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
    return (t == null && s == 0)?true:pathRecursion(t, s);
}

boolean pathRecursion(Tree<Integer> t, int s) {
    return t == null?false:(s == t.value && t.left == null && t.right == null)?true:pathRecursion(t.left, s - t.value) || pathRecursion(t.right, s - t.value);
}
