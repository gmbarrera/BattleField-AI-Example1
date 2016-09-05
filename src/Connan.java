import java.util.ArrayList;

import ia.battle.core.BattleField;
import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.WarriorData;
import ia.battle.core.actions.Action;
import ia.battle.core.actions.Move;
import ia.battle.core.actions.Skip;
import ia.exceptions.RuleException;

public class Connan extends Warrior {

	public Connan(String name, int health, int defense, int strength, int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
	}

	@Override
	public Action playTurn(long tick, int actionNumber) {
		
		Action miAccion = new Skip();
		
		BattleField.getInstance().getSpecialItems();
		
		
		WarriorData wd = BattleField.getInstance().getHunterData();
		
		if (wd.getInRange()) {
			
			final FieldCell dondeEstoy = this.getPosition();
			
			miAccion = new Move(){
				@Override
				public ArrayList<FieldCell> move() {
					ArrayList<FieldCell> miCamino = new ArrayList<>();
					
					FieldCell f = BattleField.getInstance().getFieldCell(dondeEstoy.getX() + 1, dondeEstoy.getY());
					
					miCamino.add(f);
					
					return miCamino;
				}
			};
		}
		
		return miAccion;
	}

	@Override
	public void wasAttacked(int damage, FieldCell source) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enemyKilled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void worldChanged(FieldCell oldCell, FieldCell newCell) {
		// TODO Auto-generated method stub
		
	}

}
