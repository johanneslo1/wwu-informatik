public class CoolList<CoolListItem> {

    private CoolList<CoolListItem> nextItem;

    private CoolListItem value;

    public CoolList() {
        this.value = null;
        this.nextItem = null;
    }

    public CoolList(CoolListItem value) {
        this.value = value;
        this.nextItem = null;
    }


    public CoolList<CoolListItem> getNextListItem() {
        return this.nextItem;
    }

    public void insert(CoolListItem value) {
        if(this.value == null) {
            this.value = value;
            return;
        }

//        if(this.value.compareTo(value) > 0) {
//            this.nextItem = new CoolList<CoolListItem>(value);
//        }
    }

    public void printTree() {
//        System.out.println("Aktueller Wert: " + this.value.print());
        if(this.nextItem != null) {
            System.out.println("Next: (");
            this.nextItem.printTree();
            System.out.println(")");
        }

    }
}
