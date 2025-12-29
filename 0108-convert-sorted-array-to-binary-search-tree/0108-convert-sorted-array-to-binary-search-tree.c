/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
 struct TreeNode *create(int data){
    struct TreeNode *Node=(struct TreeNode*)malloc(sizeof(struct TreeNode));
    Node->val=data;
    Node->left=NULL;
    Node->right=NULL;
    return Node;
 }
 struct TreeNode *buildBST(int *nums,int start,int end){
    if(start>end){
        return NULL;
    }
    int mid=(start+end)/2;
    struct TreeNode *root=create(nums[mid]);
    root->left=buildBST(nums,start,mid-1);
    root->right=buildBST(nums,mid+1,end);
    return root;
 }
struct TreeNode* sortedArrayToBST(int* nums, int numsSize) {
   return buildBST(nums,0,numsSize-1);
}