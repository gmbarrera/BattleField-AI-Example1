import ia.battle.camp.Warrior;
import ia.battle.camp.WarriorManager;
import ia.exceptions.RuleException;


public class WMExample1 extends WarriorManager {

	@Override
	public String getName() {
		return "Example 1";
	}

	@Override
	public Warrior getNextWarrior() throws RuleException {
		
		return new WarriorExample1("Example", 30, 20, 20, 10, 20);
	}

}
