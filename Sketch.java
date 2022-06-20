import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  int intCellWidth = 20;
  int intCellHeight = 20;
  int intMargin = 5;
  int intRowCount = 10;
  int intColumnCount = 10;
  int intScreenWidth = (intColumnCount * intMargin) + (intColumnCount * intCellWidth) + intMargin;
  int intScreenHeight = (intRowCount * intMargin) + (intRowCount * intCellWidth) + intMargin;

  int[][] intGrid; 

  int x = 0;
  int y = 0;
  public void settings() {
    // put your size call here
    size(intScreenWidth, intScreenHeight);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(12);
    intGrid = new int[10][10];
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw(){
     for(int row = 0; row < intRowCount; row++)
      for(int column = 0; column < intColumnCount; column++){
        x = intMargin + column * (intCellWidth + intMargin);
        y = intMargin + row * (intCellHeight + intMargin);
        if(intGrid[row][column] == 1){
          fill(0,255,0);
          rect(x,y,intCellWidth,intCellHeight);
        }else if(intGrid[row][column] == 0){
          fill(255,255,255);
          rect(x,y,intCellWidth,intCellHeight);
        }
    }
	  
  }

  public void mousePressed(){
    System.out.println("click");
    System.out.println("mouse coordinates: " + mouseX +", " +mouseY);
    
  }
}
