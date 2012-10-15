import java.util.*;

public class Airplane {
	private int planeLength = 27;
	private int columnWidth = 3;
	private int columnCount = 2;
	private int[][][] seats = new int[columnCount][planeLength][columnWidth];
			
	public void printSeats(){
		System.out.println("Seats:");
		for(int row = 0; row < planeLength;row++){
			System.out.print(row + " ");
			for(int col = 0; col<columnCount; col++){
				for(int colpos = 0; colpos < columnWidth; colpos++)
				{
					System.out.print(seats[col][row][colpos]);
				}
				System.out.print(' ');
			}
			System.out.println();
		}
	}
	public boolean isFull(){
		for(int col = 0; col<columnCount; col++){
			for(int row = 0; row < planeLength;row++){
				for(int colpos = 0; colpos < columnWidth; colpos++)
				{
					if(seats[col][row][colpos] == 0) return false;
				}
			}
		}
		return true;
	}
	public boolean insertPassengers(int count){ //returns true if place for all is found, else false
		for(int col = 0; col<columnCount; col++){
			for(int row = 0; row < planeLength;row++){
				switch(count){
				case 3:
					if(arePlacesFree(col, row, 0, 3)){
						setPlacesToTaken(col, row, 0, 3);
						return true;
					}
					break;
				case 2:
					if(arePlacesFree(col, row, 0, 2)){
						setPlacesToTaken(col, row, 0, 2);
						return true;
					}
					if(arePlacesFree(col, row, 1, 2)){
						setPlacesToTaken(col, row, 1, 2);
						return true;
					}
					break;
				case 1:
					if(isPlaceFree(col,row,0)) {
						setPlacesToTaken(col, row, 0, 1);
						return true;
					}
					if(isPlaceFree(col,row,1)) {
						setPlacesToTaken(col, row, 1, 1);
						return true;
					}
					if(isPlaceFree(col,row,2)) {
						setPlacesToTaken(col, row, 2, 1);
						return true;
					}
					break;
				}
			}
		}
		return false;
	}
	private boolean isPlaceFree(int col, int row, int colpos)
	{
		//if(colpos >= columnWidth) return false;
		if(seats[col][row][colpos] == 1) {
			return false;
		}
		return true;
	}
	private boolean arePlacesFree(int col, int row, int colpos, int count){
		
		for(int i=0;i<count;i++){
			if(!isPlaceFree(col, row, colpos+i)) {
				return false;
			}
		}
		return true;
	}
	private void setPlacesToTaken(int col, int row, int colpos, int count){
		//if(count + colpos > columnWidth) count = columnWidth - colpos;
		for(int i=0;i<count;i++){
			seats[col][row][colpos+i] = 1;
		}
	}
	public static void main(String[] args) {
		Airplane plane = new Airplane();
		Random r = new Random();
		
		while(!plane.isFull()){
			int pasCount = r.nextInt(3) + 1;
			System.out.println("Finding place for " + pasCount);
			if(plane.insertPassengers(pasCount))
			{
				
				plane.printSeats();
			}
		}
	}
}
