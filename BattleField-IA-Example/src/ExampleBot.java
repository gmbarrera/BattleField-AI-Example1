import ia.battle.camp.Action;
import ia.battle.camp.BattleField;
import ia.battle.camp.ConfigurationManager;
import ia.battle.camp.FieldCellType;
import ia.battle.camp.Warrior;
import ia.exceptions.OutOfMapException;
import ia.exceptions.RuleException;

public class ExampleBot extends Warrior {

	private boolean direccionHorizontal = true;

	public ExampleBot(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);

	}

	@Override
	public Action playTurn(long tick, int actionNumber) {

		if (actionNumber == 1) {

			ExampleMove m = new ExampleMove();

			int x = getPosition().getX(), y = getPosition().getY();

			if (direccionHorizontal)
				x++;
			else
				x--;
			
			try {
				if (x < ConfigurationManager.getInstance().getMapWidth() && x > 0 
						&& BattleField.getInstance().getFieldCell(x, y)
								.getFieldCellType() != FieldCellType.BLOCKED )
					
					m.setDestino(x, y);
				else {
					direccionHorizontal = !direccionHorizontal;
					m.setDestino(--x, y);
				}

			} catch (OutOfMapException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return m;
		}

		return null;
	}
}
