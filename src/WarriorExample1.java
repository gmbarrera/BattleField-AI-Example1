import java.util.ArrayList;

import ia.battle.core.BattleField;
import ia.battle.core.ConfigurationManager;
import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.actions.Action;
import ia.battle.core.actions.Attack;
import ia.battle.core.actions.BuildWall;
import ia.battle.core.actions.Move;
import ia.battle.core.actions.Skip;
import ia.exceptions.BattleException;
import ia.exceptions.RuleException;


public class WarriorExample1 extends Warrior {

	public WarriorExample1(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
	}

	@Override
	public Action playTurn(long tick, int actionNumber) {
		// TODO Auto-generated method stub
		if (BattleField.getInstance().getEnemyData().getInRange()){
			Action a = new Attack(BattleField.getInstance().getEnemyData().getFieldCell());
			return a;
		}
		
		
		if (tick > 50) {
			FieldCell f = BattleField.getInstance().getFieldCell(this.getPosition().getX() + 1, this.getPosition().getY());
			return new BuildWall(f);
		}
		
		if (tick > 10) {
			Move m = new Move(){

				@Override
				public ArrayList<FieldCell> move() {
					// A*
					return null;
				}
				
			}; 
			
			
		}
		
		return new Skip();
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
