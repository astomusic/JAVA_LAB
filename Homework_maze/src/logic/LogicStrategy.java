package logic;

import map.Map;
import map.Position;

public interface LogicStrategy {
	public void pushAround(Position pos, Map map);
}
