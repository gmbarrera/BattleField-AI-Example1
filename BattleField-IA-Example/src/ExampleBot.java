import ia.battle.camp.Action;
import ia.battle.camp.Warrior;
import ia.exceptions.RuleException;


public class ExampleBot extends Warrior {

	public ExampleBot(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Action playTurn(long tick, int actionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
