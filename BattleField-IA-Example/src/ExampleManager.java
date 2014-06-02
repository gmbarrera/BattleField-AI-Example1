import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;

public class ExampleManager extends WarriorManager {
	
	private static int id = 0;
	
	@Override
	public Warrior getNextWarrior() throws RuleException {

		return new ExampleBot("ExampleBot" + id++, 60, 10, 10, 10, 10);
	}

	@Override
	public String getName() {
		return "WarriorManager Example";
	}
}
