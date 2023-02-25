/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool flag = true;
    bool isBalanced(TreeNode* root) {
        flag = true;
        solve(root);
        return flag;
    }
    int solve(TreeNode *root) {
        if(root == NULL) {
            return 0;
        }
        int left = solve(root->left);
        int right = solve(root->right);
        if(abs(left - right) > 1) {
            flag = false;
        } 
        return max(left,right)+1;
    }
};