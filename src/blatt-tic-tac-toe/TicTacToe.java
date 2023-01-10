public class TicTacToe {
    // ------------------------------------------------------------------------------------------------ //
    // a b c d kommen hier hin                                                                          //
    // ------------------------------------------------------------------------------------------------ //


    private char[][] board;
    private char[] playerMarks;
    private int player;

    void constructor() {
        this.board = new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        this.playerMarks = new char[]{'x', 'o'};

        this.player = 0;

    }


    public char getBoardEntry(int i, int j) {
        return this.board[i][j];
    }

    public int getPlayer() {
        return this.player;
    }

    public void resetGame() {
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = ' ';
            }
        }

        this.player = 1;
    }

    public boolean hasWon() {
        // Überprüfen Sie, ob der aktuelle Spieler 3 in einer waagerechten Reihe hat
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Überprüfen Sie, ob der aktuelle Spieler 3 in einer senkrechten Reihe hat
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // Überprüfen Sie, ob der aktuelle Spieler 3 in einer diagonalen Reihe hat
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        // Kein Gewinner gefunden
        return false;
    }


    // ------------------------------------------------------------------------------------------------ //
    // gegebene Methoden                                                                                //
    // ------------------------------------------------------------------------------------------------ //

    // prueft ob das gesamte Spielfeld mit den Zeichen der Spieler gefuellt ist.
    // wenn ja gib true zurueck, andernfalls false
    private boolean isBoardFull(char[][] board) {
        boolean isFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') isFull = false;
            }
        }
        return isFull;
    }

    // gibt den aktuellen Zustand des Spielfeldes auf der Konsole aus.
    private void printBoard(char[][] board) {
        String fieldVis = "";
        // zeichne Spielfeld
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fieldVis += " " + board[i][j] + " ";
                if (j != 2) fieldVis += "|";
            }
            fieldVis += "\n";
            if (i != 2) fieldVis += "-----------\n";
        }
        System.out.println(fieldVis);
    }

    // ------------------------------------------------------------------------------------------------ //
    // main                                                                                             //
    // ------------------------------------------------------------------------------------------------ //

    public static void main(String[] args) {

    }
}