package codesignal.trees.basic.isTreeSymmetric;

class Solution {

	class Tree<T> {

		T value;
		Tree<T> left;
		Tree<T> right;

		Tree(T x) {
			value = x;
		}

	}

	boolean isTreeSymmetric(Tree<Integer> t) {
		return t == null ? true : isMirror(t.left, t.right);
	}

	boolean isMirror(Tree<Integer> t1, Tree<Integer> t2) {
		return t1 == null || t2 == null ? t1 == t2 : t1.value.equals(t2.value) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
	}

}
