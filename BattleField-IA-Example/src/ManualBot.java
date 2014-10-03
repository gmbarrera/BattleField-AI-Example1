import java.util.ArrayList;
import java.util.Scanner;

import ia.battle.camp.BattleField;
import ia.battle.camp.FieldCell;
import ia.battle.camp.FieldCellType;
import ia.battle.camp.Warrior;
import ia.battle.camp.actions.Action;
import ia.battle.camp.actions.Move;
import ia.exceptions.OutOfMapException;
import ia.exceptions.RuleException;

public class ManualBot extends Warrior {
	private Scanner sc = new Scanner(System.in);

	public ManualBot(String name, int health, int defense, int strength,
			int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Action playTurn(long tick, int actionNumber) {

		System.out.println("Opcion: ");
		String option = sc.next();

		switch (option) {
		case "w":
			return new Move() {

				@Override
				public ArrayList<FieldCell> move() {
					FieldCell current = getPosition();
					ArrayList<FieldCell> m = new ArrayList<FieldCell>();

					try {
						if (BattleField
								.getInstance()
								.getFieldCell(current.getX(),
										current.getY() - 1).getFieldCellType() != FieldCellType.BLOCKED)
							m.add(BattleField.getInstance().getFieldCell(
									current.getX(), current.getY() - 1));
					} catch (OutOfMapException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return m;
				}
			};

		case "s":
			return new Move() {

				@Override
				public ArrayList<FieldCell> move() {
					FieldCell current = getPosition();
					ArrayList<FieldCell> m = new ArrayList<FieldCell>();

					try {
						if (BattleField
								.getInstance()
								.getFieldCell(current.getX(),
										current.getY() + 1).getFieldCellType() != FieldCellType.BLOCKED)
							m.add(BattleField.getInstance().getFieldCell(
									current.getX(), current.getY() + 1));
					} catch (OutOfMapException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return m;
				}

			};

		case "a":
			return new Move() {

				@Override
				public ArrayList<FieldCell> move() {
					FieldCell current = getPosition();
					ArrayList<FieldCell> m = new ArrayList<FieldCell>();

					try {
						if (BattleField
								.getInstance()
								.getFieldCell(current.getX() - 1,
										current.getY()).getFieldCellType() != FieldCellType.BLOCKED)
							m.add(BattleField.getInstance().getFieldCell(
									current.getX() - 1, current.getY()));
					} catch (OutOfMapException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return m;
				}
			};

		case "d":
			return new Move() {

				@Override
				public ArrayList<FieldCell> move() {
					FieldCell current = getPosition();
					ArrayList<FieldCell> m = new ArrayList<FieldCell>();

					try {
						if (BattleField
								.getInstance()
								.getFieldCell(current.getX() + 1,
										current.getY()).getFieldCellType() != FieldCellType.BLOCKED)
							m.add(BattleField.getInstance().getFieldCell(
									current.getX() + 1, current.getY()));
					} catch (OutOfMapException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					return m;
				}
			};

		}

		return null;
	}

	@Override
	public void wasAttacked(int damage, FieldCell source) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enemyKilled() {
		// TODO Auto-generated method stub

	}

}
