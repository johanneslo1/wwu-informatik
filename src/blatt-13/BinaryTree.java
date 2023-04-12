
public class BinaryTree<T extends Comparable<T>> {
    private BinaryTree<T> mLeftTree;
    private BinaryTree<T> mRightTree;
    private T mValue;

    // Standard Konstruktor
    public BinaryTree() {
        mLeftTree = null;
        mRightTree = null;
        mValue = null;
    }

    // Konstruktor mit Knotenwert
    public BinaryTree(T value) {
        mLeftTree = null;
        mRightTree = null;
        mValue = value;
    }

    // insert fuegt einen Wert rekursiv in den Bin¨arbaum ein. Dabei wird in
// jedem Rekursionsschritt der Wert mit dem aktuellen Knotenwert verglichen.
// Ist der Wert kleiner als der Knotenwert, so wird der Wert an den linken
// Teilbaum weitergereicht, ist der Wert groesser als der Knotenwert, so
// wird er an den rechten Teilbaum weitergereicht, sind beide Werte gleich
// wird der Wert nicht eingefuegt und die Rekursion bricht ab. Andernfalls
// wird die Rekursion abgebrochen, wenn ein Teilbaum erreicht wird, der null
// ist. An dieser Stelle wird ein neuer Bin¨arbaum mit dem Wert als Knotenwert
// erzeugt.
    public void insert(T value) {
// ist der Wert null, so wird der Wert an dieser Stelle eingefuegt
        if (mValue == null) mValue = value;
// Wert ist kleiner als der Knotenwert
        if (value.compareTo(mValue) < 0) {
            if (mLeftTree == null) mLeftTree = new BinaryTree<T>(value);
            else mLeftTree.insert(value);
        }
// Wert ist groesser als der Knotenwert
        else if (value.compareTo(mValue) > 0) {
            if (mRightTree == null) mRightTree = new BinaryTree<T>(value);
            else mRightTree.insert(value);
        }
    }

    // Methode zum ausgeben des Baumes, um die Implementierung zu testen
    public void printTree() {
        System.out.println("Aktueller Wert: " + mValue);
        if (mLeftTree != null) {
            System.out.println("Left: (");
            mLeftTree.printTree();
            System.out.println(")");
        }
        if (mRightTree != null) {
            System.out.println("Right: (");
            mRightTree.printTree();
            System.out.println(")");
        }
    }
}
