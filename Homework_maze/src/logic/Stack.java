package logic;
import java.util.ArrayList;
import map.Position;

public class Stack {
	private ArrayList<Position> stack =  new ArrayList<Position>();
	private int indicator;
	private Position result;
	private int stackcounter;
	
	public int getStackcounter() {
		return stackcounter;
	}

	private static Stack instance = new Stack();
	private Stack() {
		this.indicator = 0;
		this.stackcounter = 0;
	}
	
	public static Stack getStack() {
		if(instance == null) {
			instance = new Stack();
		} //싱글톤 객체 
		return instance;
	}
	
	public void push(Position pos) {
		stack.add(pos);
		this.indicator++;
		this.stackcounter++;
	}
	
	public Position pop() {
		this.indicator--;
		result = stack.get(indicator);
		stack.remove(indicator);
		return  result;
	}
	
	public Boolean isClear() {
		return stack.isEmpty();
	}
}
