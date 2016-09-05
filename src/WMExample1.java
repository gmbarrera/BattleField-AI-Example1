import ia.battle.core.Warrior;
import ia.battle.core.WarriorManager;
import ia.exceptions.RuleException;


public class WMExample1 extends WarriorManager {

	@Override
	public String getName() {
		return "Example Manager 1";
	}

	@Override
	public Warrior getNextWarrior() throws RuleException {
		
		return new WarriorExample1("Example Bot", 30, 20, 20, 10, 20);
	}

}
