package boardGame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {// quando é criado o tabuleiro ainda não há posições de peças para serem
								// setadas.
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // método get protegido pois a informção do tabuleiro só é de interesse da
									// classe tabuleiro, questão de segurança de código
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
