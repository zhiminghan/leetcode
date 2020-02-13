package com.alogrithm.leetcode.T297;

import com.alogrithm.leetcode.common.TreeNode;

import java.util.LinkedList;

/**
 * @description: 297. 二叉树的序列化与反序列化
 * @author: hanzhiming
 * @url: https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/
 * @time: 2020/2/13 16:36
 */

public class Main {


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuffer sb=new StringBuffer();
        preOrder(sb,root);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        LinkedList<String> list=new LinkedList<>();
        char[] chars=data.toCharArray();

        String str="";
        for (int i=0;i<chars.length;i++){
            if(chars[i]=='#'){
                list.add(str);
                str="";
                continue;
            }
            str+=chars[i];

        }
        return  buildTree(list);
    }

    private void preOrder(StringBuffer sb,TreeNode n) {
        if (n == null){
            sb.append("@");
            sb.append("#");
            return;
        }
       sb.append(n.val);
       sb.append("#");
       preOrder(sb,n.left);

       preOrder(sb,n.right);

    }

    private TreeNode buildTree(LinkedList<String> list) {

        String str=list.removeFirst();
        if(str.equals("@"))  return null;
        int val=Integer.parseInt(str);
        TreeNode root=new TreeNode(val);
        root.left=buildTree(list);
        root.right=buildTree(list);
        return root;
    }
}
