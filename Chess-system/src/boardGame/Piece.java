package boardGame;

public class Piece {

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

}
