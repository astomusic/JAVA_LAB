package main;

import java.util.Scanner;

import output.ConsoleOutput;
import output.GenerateOutPut;
import logic.Logic;
import map.Map;
import map.Position;

public class Maze {

	public static void main(String[] args) {
		
		Map mazemap = new Map();
		Position pos = new Position();
		GenerateOutPut output = new ConsoleOutput();
		String strategy;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			output.show("Choice your Strategy(4 : 4-direction / 8: 8-direction)");
			strategy = sc.nextLine();
			
			if (strategy.equals("4") || strategy.equals("8")) {
				break;
			} else {
				output.show("We have only 2 ways(4: 4-direction / 8: 8-direction)");
			}
		}
		
		Logic logic = new Logic(strategy);
		logic.start(pos, mazemap);
	}

}
