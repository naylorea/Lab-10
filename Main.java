// Evan Naylor & Andrew Edelen


class Main {
  public static void main(String[] args) {
    Sugar tree = new Sugar();

    tree.setShape("tree");

    String treeShape = tree.getShape();

    tree.cutShape(treeShape, 10);

    tree.bake(350,12);

    tree.decorations();

    Sugar aCookie = new Sugar();

    aCookie.decorations();





    
  }
}