package logic;

import map.Map;
import map.Position;

public class EightDirectionStrategy implements LogicStrategy {
	Stack stack = Stack.getStack();

	@Override
	public void pushAround(Position pos, Map map) {
		// TODO Auto-generated method stub
		if (map.getMapEach(pos.x - 1, pos.y + 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x - 1;
			tempPos.y = pos.y + 1;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x - 1, pos.y) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x - 1;
			tempPos.y = pos.y;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x - 1, pos.y - 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x - 1;
			tempPos.y = pos.y - 1;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x, pos.y - 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x;
			tempPos.y = pos.y - 1;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x + 1, pos.y - 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x + 1;
			tempPos.y = pos.y - 1;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x + 1, pos.y) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x + 1;
			tempPos.y = pos.y;
			stack.push(tempPos);
		}
		
		if (map.getMapEach(pos.x + 1, pos.y + 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x + 1;
			tempPos.y = pos.y + 1;
			stack.push(tempPos);
		}	
		
		if (map.getMapEach(pos.x, pos.y + 1) == 0) {
			Position tempPos = new Position();
			tempPos.x = pos.x;
			tempPos.y = pos.y + 1;
			stack.push(tempPos);
		}
	}

}
