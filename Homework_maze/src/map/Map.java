package map;


public class Map {
	public int mapSizeX = 7;
	public int mapSizeY = 7;
	
	private int map[][] = {
	    //[0][1][2][3][4][5][6][7]
	      {0, 1, 1, 1, 0, 1, 1, 1},    // map[0]
	      {0, 0, 0, 1, 0, 0, 0, 0},    // map[1]
	      {1, 1, 0, 0, 0, 1, 0, 1},    // map[2]
	      {1, 1, 0, 1, 1, 1, 0, 1},    // map[3]
	      {1, 0, 0, 1, 0, 0, 0, 0},    // map[4]
	      {0, 1, 1, 1, 0, 1, 1, 1},    // map[5]
	      {1, 0, 1, 1, 0, 0, 0, 0},    // map[6]
	      {0, 1, 1, 0, 1, 1, 1, 0},    // map[7]
	    };

	public int[][] getMap() {
		return map;
	}
	
	public int getMapEach(int x, int y) {
		if(x<0 || y<0 || x>7 || y>7){
			return -1;
		}
		return map[x][y];
	}

	public void setMap(Position pos, int value) {
		this.map[pos.x][pos.y] = value;
	}

}
