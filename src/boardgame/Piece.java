package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) { 
		this.board = board;
		position = null; // Por padrão o java já define como null, indicado para conhecimento
	}
	
	protected Board getBoard() { 
		return board;
	}
	
	
}
