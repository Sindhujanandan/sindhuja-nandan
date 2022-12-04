import java.util.LinkedList;
import java.util.Queue;
public class Question1 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data )
        {
          this.data=data;
          this.left=null;
          this.right=null;  
        }
    }
    static class BinaryTree
    {
        static int idx=-1;
       public static Node buildtree(int nodes[])
       {
        idx++;
        if(nodes[idx]==-1)
        {
            return null;
        }
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildtree(nodes);
        newNode.right=buildtree(nodes);
        return newNode;
       }
       public static void preOrder(Node root )
       {
        int a=-1;
        if(root==null)
        {
            System.out.print(a+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
       }
       public static void inorder(Node root)
       {
        int a=-1;
        if(root==null)
        {
            System.out.print(a+" ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
       }
       public static void postOrder(Node root)
       {
        int a=-1;
        if(root==null)
        {
            System.out.print(a+" ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
       }
    public static void levelorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node currnode=q.remove();
            if(currnode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                   q.add(null); 
                }
            }
                else{
                    System.out.print(currnode.data+" ");
                    if(currnode.left!=null)
                    {
                        q.add(currnode.left);
                    }
                    if(currnode.right!=null){
                        q.add(currnode.right);
                    }
                }
            }
        }
    }   
    
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(nodes);
        tree.preOrder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postOrder(root);
        System.out.println();
        tree.levelorder(root);
     //  System.out.println(root.data); 
    }
}
