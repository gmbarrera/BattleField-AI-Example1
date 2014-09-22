import ia.battle.camp.Action;
import ia.battle.camp.BattleField;
import ia.battle.camp.FieldCell;
import ia.battle.camp.FieldCellType;
import ia.battle.camp.Warrior;
import ia.exceptions.OutOfMapException;
import ia.exceptions.RuleException;

public class ExampleBot2 extends Warrior {

	private enum Direccion {
		ARRIBA, ABAJO, IZQUIERDA, DERECHA,
	}

	private Direccion direction = Direccion.DERECHA;

	public ExampleBot2(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);

	}

	@Override
	public Action playTurn(long tick, int actionNumber) {

		ExampleMove m = new ExampleMove();

		FieldCell current = getPosition();
		FieldCell nextPosition = getPosition();

		try {

			while (current == nextPosition) {
				switch (direction) {
				case ARRIBA:
					if (BattleField.getInstance().getFieldCell(current.getX(), current.getY() - 1).getFieldCellType() != FieldCellType.BLOCKED)
						nextPosition = BattleField.getInstance().getFieldCell(current.getX(), current.getY() - 1);
					else
						direction = Direccion.DERECHA;
					break;

				case ABAJO:
					if (BattleField.getInstance().getFieldCell(current.getX(), current.getY() + 1).getFieldCellType() != FieldCellType.BLOCKED)
						nextPosition = BattleField.getInstance().getFieldCell(current.getX(), current.getY() + 1);
					else
						direction = Direccion.IZQUIERDA;
					break;

				case DERECHA:
					if (BattleField.getInstance().getFieldCell(current.getX() + 1, current.getY()).getFieldCellType() != FieldCellType.BLOCKED)
						nextPosition = BattleField.getInstance().getFieldCell(current.getX() + 1, current.getY());
					else
						direction = Direccion.ABAJO;
					break;

				case IZQUIERDA:
					if (BattleField.getInstance().getFieldCell(current.getX() - 1, current.getY()).getFieldCellType() != FieldCellType.BLOCKED)
						nextPosition = BattleField.getInstance().getFieldCell(current.getX() - 1, current.getY());
					else
						direction = Direccion.ARRIBA;
					break;
				}
			}

			m.setDestino(nextPosition.getX(), nextPosition.getY());

		} catch (OutOfMapException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return m;
	}

	@Override
	public void wasAttacked(int damage, FieldCell source) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enemyKilled() {
		// TODO Auto-generated method stub

	}

}
