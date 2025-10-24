import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nLet's play tic tac toe");

        char[][] board = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };
        printBoard(board);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("Turn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);

            int count = checkWin(board);
            if (count == 3) {
                System.out.println("X WINS");
                break;
            } else if (count == -3) {
                System.out.println("O WINS");
                break;
            } else if ( i == 8) {
                System.out.println("IT'S A TIE");
            }
        }
        scan.close();
    }

    /**
     * Method name: printBoard()
     * 
     * @param board (char[][])
     * 
     *              Inside Method:
     *              1. print a new line.
     *              2. print the board.
     *              - separate each row by two line
     *              - each row precedes a tab of space
     *              - each charachter in the grid has one space from the other
     *              charachter
     */
    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    /**
     * Method name: askUser
     * 
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     *         Inside Method
     *         1 - Ask the user:
     *         - pick a row and a acolumn number:
     *         - Check if the spot is taken. If so, let the user choose again.
     *         - Return the row and column in an int[] array
     */
    public static int[] askUser(char[][] board) {
        System.out.print("Pick a row and a column number: ");
        int row = scan.nextInt();
        int element = scan.nextInt();
        // while(board[row][element] == 'X' || board[row][element] == 'O') {
        while (board[row][element] != '_') {
            System.out.print("Spot taken, try again: ");
            row = scan.nextInt();
            element = scan.nextInt();
        }
        return new int[] { row, element };
    }

    /**
     * Method name: checkWin
     * 
     * @param board (char[][])
     * @return count (int)
     *
     *         Inside the Method:
     *         1. checkRows(): Check every row for a straight X/O (Task 7)
     *         2. checkColumns(): Check every column for a straight X/O (Task 8)
     *         3. checkLeft(): Check the left diagonal for a straight X/O (Task 9).
     *         4. checkRight(): Check the right diagonal for a straight X/O (Task
     *         10).
     */
    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            } else {
                count = 0;
            }
        }
        return count;
    }

    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }
        }
        return count;
    }

    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[2 - i][i] == 'X') {
                count++;
            } else if (board[2 - i][i] == 'O') {
                count--;
            }
        }
        return count;
    }

    public static int checkWin(char[][] board) {
        int rows = checkRows(board);

        // Math.abs returns the absolute value of a given number, removing any negative
        // sign.
        if (Math.abs(rows) == 3)
            return rows; // If the block of code consists of only one line, you can omit the curly
                         // braces.

        int columns = checkColumns(board);
        if (Math.abs(columns) == 3)
            return columns;

        int leftDiagonal = checkLeft(board);
        if (Math.abs(leftDiagonal) == 3)
            return leftDiagonal;

        int rightDiagonal = checkRight(board);
        if (Math.abs(rightDiagonal) == 3)
            return rightDiagonal;

        return -1;

    }
}