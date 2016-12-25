// Elizabeth Koshelev
// COSI 12B, Spring 2015 
// Programming Assignment #4, 3/14/16
// This is the TileList class, that makes an ArrayList for tiles. Further, it orders and retrieves information on Tiles in the list.
import java.util.ArrayList;

public class TileList {
	
	private ArrayList<Tile> tile;
	
	public TileList(){ //This constructs the TileList object, which stores the Tiles in an arraylist.
		 tile = new ArrayList<Tile>(); //Creates empty list.
	}
	
	public Tile moveToBack(int x, int y){
		 for (int i=0; i< tile.size(); i++){
			 if (tile.get(i).inside(x,y)){ //Searches through the list of tiles for one including the x y coordinates.
				Object z = new Object();
				z= tile.get(i); //Creates a copy of the tile with a blank object z.
				 tile.remove(i); //Removes the tile from the list.
				 tile.add((Tile)z); // Adds the found tile to the back of the list.
				 return (Tile)z; //  Returns the reference
			 } 
		 }
		 return null; // Returns null if (x, y) is not inside any of the tiles.	 
	}
	
	public void insertBack(Tile t){// Inserts a tile t at the back of the list.
		tile.add(t);
	}
	
	public int size(){// Returns the number of tiles in this list by returning the size of the list.
		return tile.size();
	}

	public Tile get(int index){	// Returns the Tile at the given index.
		return tile.get(index);
	}
}
