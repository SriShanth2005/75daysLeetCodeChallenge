/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        map.put(root,null);
        while(!qu.isEmpty()){
            TreeNode node=qu.poll();
            if(node.left!=null){
                qu.add(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                qu.add(node.right);
                map.put(node.right,node);
            }
        }
        HashSet<TreeNode> set=new HashSet<>();
        while(p!=null){
            set.add(p);
            p=map.get(p);
        }
        while(!set.contains(q)){
            q=map.get(q);
        }
        return q;
    }
}