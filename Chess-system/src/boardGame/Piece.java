package boardGame;

public class Piece {

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

}
