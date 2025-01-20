public class Problem104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    public static void main(String[] args) {
        Problem104 binaryTreeDepth = new Problem104();
        Solution solution = binaryTreeDepth.new Solution();
        TreeNode root = binaryTreeDepth.new TreeNode(3);
        root.left = binaryTreeDepth.new TreeNode(9);
        root.right = binaryTreeDepth.new TreeNode(20);
        root.right.left = binaryTreeDepth.new TreeNode(15);
        root.right.right = binaryTreeDepth.new TreeNode(7);
        System.out.println(solution.maxDepth(root));
    }


}


