package output;

import map.Map;

public class ConsoleOutput extends GenerateOutPut {

	public static final String NEWLINE = System.getProperty("line.separator");
	
	public void show(Map map) {
		for (int i=0 ; i <= map.mapSizeX ; i++) {
			for(int j=0 ; j <= map.mapSizeY ; j++) {
				System.out.print(map.getMap()[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void show(String str) {
		System.out.println(str);
	}
	
	public void show(int i) {
		System.out.println(i);
	}
}
