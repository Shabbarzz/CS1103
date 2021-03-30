package turing;
public class Tape {
    private Cell CurrentCell; //A pointer that points to the current cell
    /**
     * a constructor that creates a tape that initially consists of a single cell. 
     * The cell should contain a blank space,
     * and the current cell pointer should point to it.
     */
    public Tape() {
    	Cell cell = new Cell();
    	cell.content = ' ';
    	cell.next = null;
    	cell.prev = null;
    	CurrentCell = cell;
    }
    
    /**
     * returns the pointer that points to the current cell.
     * @return pointer to the current cell
     */
    public Cell getCurrentCell() {
    	return CurrentCell;
    }
    
    /**
     * returns the char from the current cell.
     * @return the content of the current cell
     */
    public char getContent() {
    		return CurrentCell.content;
    }
    /**
     * changes the char in the current cell to the specified value.
     * @param ch to change the current cell to contain
     */
    
    public void setContent(char ch) {
    	CurrentCell.content = ch;
    }
    
    /**
     * moves the current cell one position to the left along the tape. 
     * If the current cell is the leftmost cell that exists, 
     * then a new cell must be created and added to the tape at the left of the current cell, 
     * and then the current cell pointer can be moved to point to the new cell. 
     * The content of the new cell should be a blank space. 
     */
    
    public void moveLeft() {
    	if(CurrentCell.prev == null) {
    		Cell cell2 = new Cell();
    		cell2.content = ' ';
    		Cell2.prev = null;
    		CurrentCell.prev = cell2;
    		Cell2.next = currentCell;
    		CurrentCell = cell2;
    		} 
    	else {
    		CurrentCell = CurrentCell.prev;
    	}
    }
    
    /**
     * moves the current cell one position to the right along the tape. 
     * If the current cell is the rightmost cell that exists, 
     * then a new cell must be created and added to the tape at the right of the current cell, 
     * and then the current cell pointer can be moved to point to the new cell. 
     * The content of the new cell should be a blank space. 
     */
    
    public void moveRight() {
    	if(CurrentCell.next == null) {
    		Cell cell2 = new Cell();
    		cell2.content = ' ';
    		Cell2.next = null;
    		CurrentCell.next = cell2;
    		Cell2.prev = currentCell;
    		CurrentCell = cell2;
    		} 
    	else {
    		CurrentCell = CurrentCell.next;
    	}
    }
    /**
     * returns a String consisting of the chars from all the cells on the tape, 
     * read from left to right, except that leading or trailing blank characters should be discarded. 
     * The current cell pointer should not be moved by this method; 
     * it should point to the same cell after the method is called as it did before.
     * @return String of all the chars in the cells of the tape read from
	 *     left to right.
     */
    
    public String getTapeContents() {
    	Cell walker; //A new pointer to traverse the list
    	walker = Currentcell;
    	while(walker.prev!=null)
    	{
    		walker.prev = walker;
    	}
    	
    	StringBuilder s = new StringBuilder();
    	
    	while(walker!=null)
    	{
    		s.append(walker.content);
    		walker = walker.next;
    	}
    	return s.toString().trim();
    }
}
