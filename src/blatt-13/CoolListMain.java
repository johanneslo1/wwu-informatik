public class CoolListMain {

    public static void main(String args[]) {
        CoolList<CoolListItem> list = new CoolList<CoolListItem>();

        list.insert(new CoolListItem("Skoda"));
        list.insert(new CoolListItem("BMW"));
        list.insert(new CoolListItem("Audi"));


        list.printTree();
    }
}
