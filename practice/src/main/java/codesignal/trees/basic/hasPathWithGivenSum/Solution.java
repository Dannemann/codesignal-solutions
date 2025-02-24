package codesignal.trees.basic.hasPathWithGivenSum;

class Solution {

	class Tree<T> {

		T value;
		Tree<T> left;
		Tree<T> right;

		Tree(T x) {
			value = x;
		}

	}

	boolean hasPathWithGivenSum(Tree<Integer> t, int s) {
		if (t == null)
			return false;

		if (t.value == s && t.left == null && t.right == null)
			return true;

		return hasPathWithGivenSum(t.left, s - t.value) || hasPathWithGivenSum(t.right, s - t.value);
	}

}
