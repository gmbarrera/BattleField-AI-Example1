import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;

public class ExampleManager extends WarriorManager {
	
	private static int id = 0;
	
	@Override
	public Warrior getNextWarrior() throws RuleException {

		return new ExampleBot("Ejemplito" + id++, 60, 10, 10, 10, 10);
	}

}
