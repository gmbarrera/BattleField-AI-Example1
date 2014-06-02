

import ia.battle.camp.BattleField;
import ia.battle.camp.BattleFieldListener;
import ia.battle.camp.WarriorManager;


public class ExampleTest {

	public static void main(String[] args) {
		
		BattleField bf = BattleField.getInstance();
		
		WarriorManager wm1 = new ExampleManager();
		WarriorManager wm2 = new ExampleManager();
		
		bf.addWarriorManager(wm1);
		bf.addWarriorManager(wm2);

		bf.addListener(new BattleFieldListener() {
			
			@Override
			public void warriorAttacked() {
			}
			
			@Override
			public void turnLapsed(long tick, int turnNumber) {
				//System.out.println(tick);
			}
			
			@Override
			public void tickLapsed(long tick) {
				
			}
			
			@Override
			public void startFight() {
				System.out.println("Begin!!!");
			}
			
			@Override
			public boolean continueFighting() {
				return true;
			}
		});
		
		bf.fight();
		
		
	}

}
