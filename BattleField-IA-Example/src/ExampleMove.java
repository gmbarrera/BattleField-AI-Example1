import java.util.ArrayList;

import ia.battle.camp.FieldCell;
import ia.battle.camp.Move;


public class ExampleMove extends Move {
	
	private FieldCell destino;
	
	public FieldCell getDestino() {
		return destino;
	}

	public void setDestino(FieldCell destino) {
		this.destino = destino;
	}

	@Override
	public ArrayList<FieldCell> move() {

		ArrayList<FieldCell> path = new ArrayList<>();
		
		path.add(destino);
		
		return path;
	}

}
