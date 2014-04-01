import ia.battle.camp.Action;
import ia.battle.camp.ConfigurationManager;
import ia.battle.camp.Warrior;
import ia.exceptions.RuleException;

public class ExampleBot extends Warrior {

	public ExampleBot(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);

	}

	@Override
	public Action playTurn(long tick, int actionNumber) {

		if (actionNumber == 1) {

			ExampleMove m = new ExampleMove();

			int x = getPosition().getX(), y = getPosition().getY();

			if (x < ConfigurationManager.getInstance().getMapWidth()) {
				m.setDestino(++x, y);

				System.out.println(x + "  " + y);
			}
			return m;
		}

		return null;
	}

}
