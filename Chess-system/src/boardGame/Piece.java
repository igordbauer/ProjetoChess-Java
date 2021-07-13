package boardGame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {// quando � criado o tabuleiro ainda n�o h� posi��es de pe�as para serem
								// setadas.
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // m�todo get protegido pois a inform��o do tabuleiro s� � de interesse da
									// classe tabuleiro, quest�o de seguran�a de c�digo
		return board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
