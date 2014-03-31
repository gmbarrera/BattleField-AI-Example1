import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;

public class ExampleManager extends WarriorManager {

	@Override
	public Warrior getNextWarrior() throws RuleException {

		return new ExampleBot("Ejemplito", 60, 10, 10, 10, 10);
	}

}
