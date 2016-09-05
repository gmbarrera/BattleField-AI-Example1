import ia.battle.core.ConfigurationManager;
import ia.battle.core.Warrior;
import ia.battle.core.WarriorManager;
import ia.exceptions.RuleException;

public class Paton extends WarriorManager {
	private int warriorsEnviados;
	
	@Override
	public String getName() {
		return "Paton Bauza";
	}

	@Override
	public Warrior getNextWarrior() throws RuleException {
		int maxPoints = ConfigurationManager.getInstance().getMaxPointsPerWarrior();
		Warrior w;
		
		if (warriorsEnviados % 2 == 0)
			w = new Connan("El Barbaro", 20, 20, 20, 20, 20);
		else
			w = new Xena("La princesa", 20, 20, 20, 20, 20);
		
		warriorsEnviados++;
		
		return w;
	}

}
