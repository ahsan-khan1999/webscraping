public class Main {
        N root ;

        public Main() {
            root = null;
        }
        public void add(int data){
            if (root == null){
                root = new N(data);
            }
            else {
                if (root.left == null){
//                root.left.data = data;
                    root.left = new N(data);
                }
                else if (root.right == null){
                    root.right = new N(data);
//                root.right.data = data;
                }
            }
//        Node node = new Node();
        }
        public void display(){
            print(this.root);

        }

        public void print(N root){
            if(root == null){
                return;
            }
            print(root.left);
            System.out.println(root.data);
            print(root.right);
        }
//    public void s(){
//        System.out.println(search(root));
//
//    }
//

        public void delete(){
            search(root);
        }

        public void search(N n){
            if (root!=null){
                if (n.data == root.data){
                    n=null;
                }
                else {
//                    root.left = search(root.left);
//                    root.right=search(root.right);
                }
            }
        }



        public void addData(int data){
            root = addRecord(root,data);
        }
        public N addRecord(N root , int data){
            if (root == null){
                root = new N(data);
                return root;
            }
            if (data < root.data){
                root.left =addRecord(root.left,data);
            }
            else if (data>root.data){
                root.right = addRecord(root.right,data);
            }
            return root;
        }
    }



//        if(root.right == null && root.left == null) {
//            System.out.println(root.data);
//        }
//                System.out.println(root.left.data);

//        while (root!=null){
//            System.out.println(root.data);
//        }
//        while (root.left != null || root.right != null) {
//                    root = root.left;
//            System.out.println(root.data);
//        }
//        System.out.println(printRecord(root));