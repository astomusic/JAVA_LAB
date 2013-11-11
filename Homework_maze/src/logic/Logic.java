package logic;

import map.Map;
import map.Position;
import output.ConsoleOutput;
import output.GenerateOutPut;

public class Logic {
	Stack stack = Stack.getStack();
	GenerateOutPut output = new ConsoleOutput();
	LogicStrategy logicstrategy = new FourDirectionStrategy();
	String strategy;
	
	public Logic(String strategy) {
		this.strategy = strategy;
	}

	public void start(Position pos, Map map) {
		
		if(strategy.equals("8")) {
			logicstrategy = new EightDirectionStrategy();
		}
		
		int count = 0;
		output.show("START");

		do {
			count++;
			map.setMap(pos, 3);
			output.show("----" + count + " Turn----");
			output.show(map);

			output.show("");
			logicstrategy.pushAround(pos, map);
			pos = stack.pop();
			if(pos.x == 7 && pos.y ==7) {
				count++;
				map.setMap(pos, 3);
				output.show("----" + count + " Turn----");
				output.show(map);
				break;
			}
			
		} while(true);
		

		output.show("EXIT");
		output.show("Stack Counter : " + stack.getStackcounter());

	}
}
