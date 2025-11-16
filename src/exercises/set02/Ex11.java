void main() {
    startTicTacToe();
}

void startTicTacToe() {
    int[][] gameboard = new int[3][3];
    boolean isFirstPlayerTurn = true;

    while (!isBoardFull(gameboard)) {
        int playingNumber = isFirstPlayerTurn ? 1 : 2;
        int[] symbolPosition = getPlayerChoice(gameboard, isFirstPlayerTurn);
        gameboard[symbolPosition[0]][symbolPosition[1]] = playingNumber;
        printBoard(gameboard);
        isFirstPlayerTurn = !isFirstPlayerTurn;
    }
}

int[] getPlayerChoice(int[][] gameboard, boolean isFirstPlayerTurn) {
    String playingSymbol = isFirstPlayerTurn ? "X" : "O";
    String rowResponse = IO.readln(playingSymbol + " linha: ");
    String columnResponse = IO.readln(playingSymbol + " coluna: ");

    int row = Integer.parseInt(rowResponse);
    int column = Integer.parseInt(columnResponse);

    while (!isPlayerChoiceValid(gameboard, row, column)) {
        IO.println("That spot is already taken or invalid position, try again");
        rowResponse = IO.readln(playingSymbol + " linha: ");
        columnResponse = IO.readln(playingSymbol + " coluna: ");

        row = Integer.parseInt(rowResponse);
        column = Integer.parseInt(columnResponse);
    }
    return new int[]{row, column};
}

boolean isPlayerChoiceValid(int[][] gameboard, int row, int column) {
    return row < gameboard.length && column < gameboard[0].length && gameboard[row][column] == 0;
}


void printBoard(int[][] gameboard) {
    IO.println(Arrays.toString(gameboard[0]));
    for (int i = 0; i < gameboard.length; i++) {
        IO.println(i == 0 ? "" : "-----------");
        for (int j = 0; j < gameboard[i].length; j++) {
            String playingSymbol = "   ";
            IO.print(j == 0 ? "" : "|");
            if (gameboard[i][j] == 1) {
                playingSymbol = " X ";
            }
            if (gameboard[i][j] == 2) {
                playingSymbol = " O ";
            }
            IO.print(playingSymbol);
        }
        IO.println();
    }
    IO.println();
}

boolean isBoardFull(int[][] gameboard) {
    for (int i = 0; i < gameboard.length; i++) {
        for (int j = 0; j < gameboard[i].length; j++) {
            if (gameboard[i][j] == 0) {
                return false;
            }
        }
    }
    return true;
}

