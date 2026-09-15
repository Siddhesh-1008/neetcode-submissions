/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    // TWO POINTER APPROACH
    // IF P=2 AND Q=1 THEN FOR P THE PARENTS ARE<2 3 5 > AND FOR 1 IS <1 3 5> THUS LOWEST CPMMON PARENT IS 3
    // WE NEED TO FIND LOWEST COMMON PARENT FOR BOTH NODES
    // WHAT WE DO IS FIRST FIND ALL PARENTS(.parent) OF NODE P AND THEN ADD IT TO SET
    // THEN GO FOR NODE Q NOW SEE WHERTHER NODE Q PARENT EXIST IN SET OR NOT IF EXIST THEN SEE IS IT THE LOWEST PARENT IF YES RETURN NODE Q
    // IF NOT RETURN NULL
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node>set=new HashSet<>();

        while(p!=null)
        {
            set.add(p);
            p=p.parent;
        }

        while(q!=null)
        {
            if(set.contains(q))
            {
                return q;
            }
            q=q.parent;
        }

        return null;


    }
}