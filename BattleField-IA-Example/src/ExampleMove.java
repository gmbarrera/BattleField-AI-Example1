import java.util.ArrayList;

import ia.battle.camp.BattleField;
import ia.battle.camp.FieldCell;
import ia.battle.camp.actions.Move;
import ia.exceptions.OutOfMapException;


public class ExampleMove extends Move {
	
	private FieldCell destino;
	
	public FieldCell getDestino() {
		return destino;
	}

	public void setDestino(int x, int y) {
		try {
			destino = BattleField.getInstance().getFieldCell(x, y);
		} catch (OutOfMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	@Override
	public ArrayList<FieldCell> move() {

		ArrayList<FieldCell> path = new ArrayList<>();
		
		path.add(destino);
		
		return path;
	}


}
