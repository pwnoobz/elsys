package org.elsys.lab.statics;

import java.util.HashMap;
import java.util.Map;

public class Plane {
	private final String FEMALE = "F";
	private final String MALE = "M";
	private int planeLength = 27;
	private int columnWidth = 3;
	private int columnCount = 2;
	private int capacity = 0;
	private int males = 0;
	private int females = 0;
	private Human[][][] seats = new Human[columnCount][planeLength][columnWidth];

	public Plane()
	{
		capacity = planeLength * columnWidth * columnCount;
	}
	public void add(Human h) throws Exception{
		if(!insertPassenger(h)){
			throw new Exception("Could not find place for passenger.");
		}
	}
	
	public void remove(Human h) {
		removePassenger(h);
	}
	
	
	public void clear() {
		clearAll();
	}
	
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getMales() {
		return males;
	}
	
	public int getFemales() {
		return females;
	}
	private void clearAll() {
		for(int col = 0; col<columnCount; col++){
			for(int row = 0; row < planeLength;row++){
				for(int colplace = 0; colplace < columnWidth; colplace++){
					if(!isPlaceFree(col,row,colplace)){
						removePassengerFrom(col, row, colplace);
					}
				}
			}
		}
	}
	private boolean removePassenger(Human human) {
		for(int col = 0; col<columnCount; col++){
			for(int row = 0; row < planeLength;row++){
				for(int colplace = 0; colplace < columnWidth; colplace++){
					if(doesPlaceContain(human, col, row, colplace)){
						removePassengerFrom(col, row, colplace);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private void removePassengerFrom(int col, int row, int colplace) {
		Human human = seats[col][row][colplace];
		if(isMale(human)) males--;
		if(isFemale(human)) females--;
		seats[col][row][colplace] = null;
		
	}
	private boolean doesPlaceContain(Human human, int col, int row, int colplace) {
		return seats[col][row][colplace] == human;
	}
	private boolean isMale(Human h){
		if(h.getGender().equals(MALE)) return true;
		return false;
	}
	private boolean isFemale(Human h){
		if(h.getGender().equals(FEMALE)) return true;
		return false;
	}
	private boolean isFull(){
		return (males+females)>=capacity;
	}
	private boolean insertPassenger(Human human){ //returns true if place for all is found, else false
		if(isFull()) return false;
		for(int col = 0; col<columnCount; col++){
			for(int row = 0; row < planeLength;row++){
				for(int colplace = 0; colplace < columnWidth; colplace++){
					if(isPlaceFree(col, row, colplace)){
						putPassengerAt(human, col, row, colplace);
						return true;
					}
				}
			}
		}
		return false;
	}
	private void putPassengerAt(Human human, int col, int row, int colplace) {
		seats[col][row][colplace] = human;
		if(isFemale(human)) females++;
		if(isMale(human)) males++;
	}
	private boolean isPlaceFree(int col, int row, int colpos)
	{
		//if(colpos >= columnWidth) return false;
		if(seats[col][row][colpos] != null) {
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
	
}
