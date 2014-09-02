import java.util.Random;

import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;

public class ExampleManager extends WarriorManager {
	
	private static int id = 0;
	private Random rnd = new Random();
	
	@Override
	public Warrior getNextWarrior() throws RuleException {

		if (rnd.nextBoolean())
			return new ExampleBot2("Bot 2" + id++, 60, 10, 10, 10, 10);
		
		return new ExampleBot("Bot 1" + id++, 60, 10, 10, 10, 10);
	}

	@Override
	public String getName() {
		return "WarriorManager Example";
	}
}
