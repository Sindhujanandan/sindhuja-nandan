import java.util.*;
public class Queston3 {
    static class Node{
        int data;
        Node left,right;
        public Node (int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
      int lh=height(root.left);
      int rh=height(root.right);  
      return Math.max(lh, rh)+1;
    }
    public static int count(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftcount=count(root.left);
        int rightcount=count(root.right);
        return leftcount+rightcount+1;

    }
    public static int sum(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int diameter(Node root)//O(n^2)
    {
        if(root==null)
        {
            return 0;
        }
        int leftDiam=diameter(root.left);
        int leftht=height(root.left);
        int rightDiam=diameter(root.right);
        int rightHt=height(root.right);
        int selfDiam=leftht+rightHt+1;
        return Math.max(selfDiam,Math.max(leftDiam, rightDiam));
    }
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht)
        {
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){
        if(root==null)
        {
            return new Info(0, 0);
        }
        Info leftInfo=diameter2(root.left);
        Info righInfo=diameter2(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,righInfo.diam),leftInfo.ht+righInfo.ht+1);
        int ht=Math.max(leftInfo.ht,righInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static boolean isIdentical(Node node, Node subroot)
    {
        if(node==null&&subroot==null)
        {
            return true;
        }
        else if(node==null||subroot==null||node.data!=subroot.data)
        {
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root,Node subroot)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
       return isSubtree(root.left, subroot)|| isSubtree(root.right, subroot);
    }
    static class Info1{
        Node node;
        int hd;
        public Info1(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topview(Node root)
    {
        Queue<Info1> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info1(root, 0));
        q.add(null);
        while(!q.isEmpty())
        {
            Info1 curr=q.remove();
            if(curr==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
            if(!map.containsKey(curr.hd))
            {
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left!=null)
            {
                q.add(new Info1(curr.node.left, curr.hd-1));
                min=Math.min(min, curr.hd-1);
            }
            if(curr.node.right!=null)
            {
                q.add(new Info1(curr.node.right, curr.hd+1));
                max=Math.max(max, curr.hd+1);
            }
        }
        }
        for(int i=min;i<=max;i++)
        {
            System.out.print(map.get(i).data+" ");
        }
            System.out.println();
        }
        public static void kLevel(Node root,int level,int k)
        {
            if(root==null)
            {
                return;
            }
            if(level==k)
            {
                System.out.print(root.data+" ");
                return;
            }
            kLevel(root.left, level+1, k);
            kLevel(root.right, level+1, k);
        }
        
        public static boolean getPath(Node root,int n,ArrayList<Node> path)
        {
            if(root==null)
            {
                return false;
            }
            path.add(root);
            if(root.data==n)
            {
                return true;
            }
            boolean foundleft=getPath(root.left, n, path);
            boolean foundright=getPath(root.right, n, path);
            if(foundleft||foundright)
            {
                return true;
            }
            path.remove(path.size()-1);
            return false;

        }
public static Node lca(Node root,int n1,int n2)
{
    ArrayList<Node> path1=new ArrayList<>();
    ArrayList<Node> path2=new ArrayList<>();
    getPath(root,n1,path1);
    getPath(root,n2,path2);

    int i=0;
    for(;i<path1.size()&&i<path2.size();i++)
    {
        if(path1.get(i)!=path2.get(i))
        {
            break;
        }
    }
    Node lca=path1.get(i-1);
    return lca;
}
public static Node lca2(Node root,int n1,int n2)
{
    if(root==null||root.data==n1|| root.data==n2)
    {
        return root;
    }
   Node leftlca= lca2( root.left, n1, n2);
   Node rightlca= lca2( root.right, n1, n2);
   //leftLCA=val rightLCA=null
   if(rightlca==null)
{
    return leftlca;
}   
if(leftlca==null)
{
    return rightlca;
}
return root;
}

public static int lcaDist(Node root,int n)
{
    if(root==null)
    {
        return -1;
    }
    if(root.data==n)
    {
        return 0;
    }
int leftDist=lcaDist(root.left, n);
int rightDist=lcaDist(root.right, n);
if(leftDist==-1&&rightDist==-1)
{
    return -1;
}
else if(leftDist==-1)
{
    return rightDist+1;
}
else 
{
    return leftDist+1;
}
}
public static int minDis(Node root,int n1,int n2)
{
    Node lca=lca2(root, n1, n2);
    int dist1=lcaDist(root,n1);
    int dist2=lcaDist(root,n2);
    return dist1+dist2;
}
public static int Kancestor(Node root,int n,int k)
{
    if(root==null)
    {
        return -1;
    }
    if(root.data==n)
    {
        return 0;
    }
    int leftDist=Kancestor(root.left, n, k);
    int rightDist=Kancestor(root.right, n, k);
    if(leftDist==-1&&rightDist==-1)
    {
        return -1;
    }
    int max=Math.max(leftDist, rightDist);
    if(max+1==k)
    {
        System.out.println(root.data);
    }
        return max+1;
 
}
public static int transform(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int leftChild=transform(root.left);
    int rightChild=transform(root.right);
    int data=root.data;
    int newLeft=root.left==null?0:root.left.data;
    int newright=root.right==null?0:root.right.data;

    root.data=newLeft+leftChild+newright+rightChild;
    return data;
}
public static void preorder(Node root)
{
    if(root==null)
   {
    return;
   }
   System.out.print(root.data+" ");
   preorder(root.left);
   preorder(root.right);
}
    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
     /* 
        System.out.println(height(root));
       System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root));
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);*/
       // System.out.println(isSubtree(root, subroot));
      // topview(root);
    //  kLevel(root, 1, 3);
      int n1=5 , n2=6,k=2;
      System.out.println("lowest comman ancestors");
     // System.out.println(lca(root,n1,n2).data);
     // System.out.println(lca2(root, n1, n2).data);
System.out.println(minDis(root, n1,n2));
Kancestor(root, n1, k);
transform(root);
preorder(root);
    }   

}
