package sem.hw5;

//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
public class ChessBoard {
    public static void main(String[] args) {
        boolean[][] board = new boolean[8][8];
        if (placeQueens(board, 0)) {
            printBoard(board);
        } else {
            System.out.println("Решение не найдено");
        }
    }

    static boolean placeQueens(boolean[][] board, int row) {
        // если мы успешно разместили всех ферзей, возвращаем true
        if (row == 8) {
            return true;
        }

        // пробуем разместить ферзя на каждой клетке в текущей строке
        for (int col = 0; col < 8; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                if (placeQueens(board, row + 1)) {
                    return true;
                }
                board[row][col] = false; // откатываемся назад
            }
        }

        // не удалось разместить ферзя в этой строке
        return false;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        // проверяем горизонталь
        for (int i = 0; i < 8; i++) {
            if (board[row][i]) {
                return false;
            }
        }

        // проверяем вертикаль
        for (int i = 0; i < 8; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // проверяем диагональ
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

    static void printBoard(boolean[][] board) {
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print((char)('a' + i) + " ");
        }
        System.out.println();
    
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("+ ");
                }
            }
            System.out.print(8 - i);
            System.out.println();
        }
    
        System.out.print("  ");
        for (int i = 0; i < 8; i++) {
            System.out.print((char)('a' + i) + " ");
        }
        System.out.println();
    }
}
