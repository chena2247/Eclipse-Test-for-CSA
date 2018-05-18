import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    //int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null, botColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
    	  	topPixel = pixels[row][col];
    	  	botPixel = pixels[row+1][col];
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        botColor = botPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
        		leftPixel.setColor(Color.BLACK);
        if (topPixel.colorDistance(botColor) > edgeDist)
        		topPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray:pixels) { 
		  for (Pixel pixelObj:rowArray) {
			  pixelObj.setGreen(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void keepOnlyRed() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray:pixels) { 
		  for (Pixel pixelObj:rowArray) {
			  pixelObj.setGreen(0);
			  pixelObj.setBlue(0);
		  }
	  }
  }  
  
  public void keepOnlyGreen() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray:pixels) { 
		  for (Pixel pixelObj:rowArray) {
			  pixelObj.setBlue(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray:pixels) {
		  for (Pixel pixelObj:rowArray) {
			  pixelObj.setGreen(255-pixelObj.getGreen());
			  pixelObj.setGreen(255-pixelObj.getBlue());
			  pixelObj.setGreen(255-pixelObj.getRed());
		  }
	  }
  }
  
	public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int avg = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
				pixelObj.setGreen(avg);
				pixelObj.setRed(avg);
				pixelObj.setBlue(avg);
			}
		}
	}
	
	public void fixUnderwater() {
		Pixel[][] pixels = this.getPixels2D();
		int redAverage=0, greenAverage=0, blueAverage=0, totalPixels=0;
		int maxRed=0,minRed=255,maxGreen=0,minGreen=255,maxBlue=0,minBlue=255;
		
		for (int row = 26; row < 36; row++) {
			for (int col = 178; col < 198; col++) {
				totalPixels++;

				Pixel myPixel = pixels[row][col];

				redAverage += myPixel.getRed();
				greenAverage += myPixel.getGreen();
				blueAverage += myPixel.getBlue();

				if (myPixel.getRed() > maxRed) {
					maxRed = myPixel.getRed();
				}
				if (myPixel.getRed() < minRed) {
					minRed = myPixel.getRed();
				}
				if (myPixel.getGreen() > maxGreen) {
					maxGreen = myPixel.getGreen();
				}
				if (myPixel.getGreen() < minGreen) {
					minGreen = myPixel.getGreen();
				}
				if (myPixel.getBlue() > maxBlue) {
					maxBlue = myPixel.getBlue();
				}
				if (myPixel.getGreen() < minBlue) {
					minBlue = myPixel.getBlue();
				}

			}
		}

		redAverage = redAverage / totalPixels;
		greenAverage = greenAverage / totalPixels;
		blueAverage = blueAverage / totalPixels;

		Color averageColor = new Color(redAverage, greenAverage, blueAverage);

		// calculates the range
		int redRange = (maxRed - minRed);
		int greenRange = (maxGreen - minGreen);
		int blueRange = (maxBlue - minBlue);

		int redDistance = redRange;
		int greenDistance = greenRange;
		int blueDistance = blueRange;

		double maxDistance = Math
				.sqrt(redDistance * redDistance + greenDistance * greenDistance + blueDistance * blueDistance);

		double t = 1.7; // higher t means more pixels will be "fish"

		// changes the image based on calculated distance from sample value
		for (int row = 0; row < pixels.length; row++) // Pixel[] rowArray :
														// pixels)
		{
			for (int col = 0; col < pixels[0].length; col++) // Pixel pixelObj :
																// rowArray)
			{
				Pixel myPixel = pixels[row][col]; //

				boolean closeEnough = myPixel.colorDistance(averageColor) < maxDistance * t;
				if (closeEnough) {
					myPixel.setBlue(myPixel.getBlue() + 50);
				} else {
					myPixel.setBlue(myPixel.getBlue() - 50);
				}
			}
		}
	}
	
	  public void mirrorVerticalRightToLeft()
	  {
	    Pixel[][] pixels = this.getPixels2D();
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int width = pixels[0].length;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; col < width / 2; col++)
	      {
	        leftPixel = pixels[row][col];
	        rightPixel = pixels[row][width - 1 - col];
	        leftPixel.setColor(rightPixel.getColor());
	      }
	    } 
	  }
	  
	  public void mirrorHorizontal() {
		  Pixel[][] pixels = this.getPixels2D();
			Pixel topPixel = null;
			Pixel bottomPixel = null;
			int length = pixels.length;
			for (int row = 0; row < length / 2; row++) {
				for (int col = 0; col < pixels[0].length; col++) {
					topPixel = pixels[row][col];
					bottomPixel = pixels[length - row - 1][col];
					bottomPixel.setColor(topPixel.getColor());
				}
			}
	  }
	  
	  public void mirrorHorizontalBotToTop() {
		  Pixel[][] pixels = this.getPixels2D();
			Pixel topPixel = null;
			Pixel bottomPixel = null;
			int length = pixels.length;
			for (int row = 0; row < length / 2; row++) {
				for (int col = 0; col < pixels[0].length; col++) {
					topPixel = pixels[row][col];
					bottomPixel = pixels[length - row - 1][col];
					topPixel.setColor(bottomPixel.getColor());
				}
			}
	  }
  
	  public void mirrorDiagonal() {
		  Pixel[][] pixels = this.getPixels2D();
		  Pixel origPixel = null;
		  Pixel flipPixel = null;
		  int max;
		  if (pixels.length < pixels[0].length) {
			  max = pixels.length;
		  } 
		  else {
			  max = pixels[0].length;
		  }
		  for (int row = 0; row < max; row++) {
			  for (int col = row; col < max; col++) {
				  origPixel = pixels[row][col];
				  flipPixel = pixels[col][row];
				  origPixel.setColor(flipPixel.getColor());
			  }
		  }
	  }
	  
	  public void mirrorArms() {
		  int mirrorPoint = 193;
		  Pixel topPixel = null;
		  Pixel bottomPixel = null;
		  Pixel[][] pixels = this.getPixels2D();

		  // Left arm
		  for (int row = 158; row < mirrorPoint; row++) {
			  for (int col = 103; col < 170; col++) {
				  topPixel = pixels[row][col];
				  bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				  bottomPixel.setColor(topPixel.getColor());
			  }
		  }

		  int mirrorPoint2 = 198;
		  Pixel topPixel2 = null;
		  Pixel bottomPixel2 = null;

		  // Right arm
		  for (int row = 171; row < mirrorPoint2; row++) {
			  for (int col = 239; col < 294; col++) {
				  topPixel2 = pixels[row][col];
				  bottomPixel2 = pixels[mirrorPoint2 - row + mirrorPoint2][col];
				  bottomPixel2.setColor(topPixel2.getColor());
			  }
		  }
	  }
	  
	  public void mirrorGull() {
		  int mirrorPoint = 345;
		  Pixel rightPixel = null, leftPixel = null;
		  Pixel[][] pixels = this.getPixels2D();
		  
		  for (int row = 235; row < 325; row++) {
			  for (int col = 238; col < mirrorPoint; col++) {
				  rightPixel = pixels[row][col];
				  leftPixel = pixels[row][mirrorPoint - col + mirrorPoint/3];
				  leftPixel.setColor(rightPixel.getColor());
			  }
		  }
	  }
	  
	  public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol) {
			Pixel fromPixel = null;
			Pixel toPixel = null;
			Pixel[][] toPixels = this.getPixels2D();
			Pixel[][] fromPixels = fromPic.getPixels2D();
			for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow; fromRow++, toRow++) {
				for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
						&& toCol < endCol; fromCol++, toCol++) {
					fromPixel = fromPixels[fromRow][fromCol];
					toPixel = toPixels[toRow][toCol];
					toPixel.setColor(fromPixel.getColor());
				}
			}
		}
	  
	  public void myCollage()
	  {
	    Picture flower1 = new Picture("flower1.jpg");
	    Picture flower2 = new Picture("flower2.jpg");
	    this.copy(flower1,0,0);
	    this.copy(flower2,100,0);
	    this.copy(flower1,200,0);
	    Picture flowerNoBlue = new Picture(flower1);
	    Picture flowerNegate = new Picture(flower2);
	    Picture flowerGray = new Picture(flower1);
	    flowerNoBlue.zeroBlue();
	    flowerNegate.negate();
	    flowerGray.grayscale();
	    this.copy(flowerNoBlue,0,100);
	    this.copy(flowerNegate,100,100);
	    this.copy(flowerGray,200,100);
	    this.mirrorVertical();
	    this.write("collage.jpg");
	  }

	  public void edgeDetection2(int edgeDist)
	  {
		  Picture copy = new Picture(this);
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    Pixel topPixel = null;
	    Pixel botPixel = null;
	    Color botColor = null;
	    Pixel[][] copyPixels = copy.getPixels2D();
	    Pixel[][] pixels = this.getPixels2D();
	    Color rightColor = null;
	    for (int row = 0; row < pixels.length; row++)
	    {
	      for (int col = 0; 
	           col < pixels[0].length-1; col++)
	      {
	        leftPixel = copyPixels[row][col];
	        rightPixel = copyPixels[row][col+1];
	        rightColor = rightPixel.getColor();
	        if (leftPixel.colorDistance(rightColor) > 
	            edgeDist)
	          pixels[row][col].setColor(Color.BLACK);
	        else
	          pixels[row][col].setColor(Color.WHITE);
	      }
	    }
	    for(int col = 0; col < pixels[0].length; col++)
	    {
	    	for(int row = 0; row < pixels.length - 1; row++)
	    	{
	    		topPixel = copyPixels[row][col];
	    		botPixel = copyPixels[row + 1][col];
	    		botColor = botPixel.getColor();
	    		if(topPixel.colorDistance(botColor) > edgeDist)
	    		{
	    			pixels[row][col].setColor(Color.BLACK);
	    		}
	    		else
	    		{
	    			pixels[row][col].setColor(Color.WHITE);
	    		}
	    	}
	    }

		}
	  
	  public void sharpen(int x, int y, int w, int h) {
		  Pixel pixel1 = null;
		  Pixel pixel2 = null;
		  Pixel result = null;
		  
	  	  Pixel[][] pixels = this.getPixels2D();

	  	  for (int row = y; row < y + h; row++) {
	  		  for (int col = x; col < x + w; col++) {
		  		  pixel1 = pixels[row][col];
		  		  pixel2 = pixels[row-1][col-1];
		  		  result = pixels[row][col];
		  		  
		  		  int bDifference = Math.abs(pixel1.getBlue()-pixel2.getBlue())/2;
		  		  int rDifference = Math.abs(pixel1.getRed()-pixel2.getRed())/2;
		  		  int gDifference = Math.abs(pixel1.getGreen()-pixel2.getGreen())/2;
		  		  		  		  
		  		  if ((bDifference + pixel1.getBlue()) > 255) 
		  			  result.setBlue(255);
		  		  else 
		  			  result.setBlue(bDifference + pixel1.getBlue());
		  		  
		  		  if ((rDifference + pixel1.getRed()) > 255)
		  			  result.setRed(255);
		  		  else
		  			  result.setRed(rDifference + pixel1.getRed());
		  		  
		  		  if ((gDifference + pixel1.getGreen()) > 255)
		  			  result.setGreen(255);
		  		  else
		  			  result.setGreen(gDifference + pixel1.getGreen());
	  		  }
	  	  }
	  	  }
	  	  
	  	public void encode(Picture pic) 
	  	{

	  	Pixel[][] messagePixels = pic.getPixels2D();
	  	Pixel[][] currPixels = this.getPixels2D();
	  	Pixel currPixel = null;
	  	Pixel messagePixel = null;
	  	int count = 0;
	  	
	  	for (int row = 0; row < this.getHeight(); row++) {
	  		for (int col = 0; col < this.getWidth(); col++) {
	  			// if the current blue pixel mod 5 = 0 make it not divisible by 5
	  			currPixel = currPixels[row][col];
	  			if (currPixel.getBlue() % 5 == 0) {
	  				if (currPixel.getBlue() < 255)
	  				currPixel.setBlue(currPixel.getBlue() + 1);
	  			}
	  			messagePixel = messagePixels[row][col];
	  			if (messagePixel.colorDistance(Color.BLACK) < 100) {
	  				int remainder = currPixel.getBlue() % 5;
	  				currPixel.setBlue(currPixel.getBlue() - remainder);
	  				count++;
	  				}
	  			}
	  		}
	  	System.out.println(count);
	  	}
	  	
	  	public Picture decode() {
	  		Pixel[][] pixels = this.getPixels2D();
	  		int height = this.getHeight();
		  	int width = this.getWidth();
		  	Pixel currPixel = null;
	
		  	Pixel messagePixel = null;
		  	Picture messagePicture = new Picture(height,width);
		  	Pixel[][] messagePixels = messagePicture.getPixels2D();
		  	int count = 0;
		  	for (int row = 0; row < this.getHeight(); row++) {
		  		for (int col = 0; col < this.getWidth(); col++) {
		  			currPixel = pixels[row][col];
			  	messagePixel = messagePixels[row][col];
			  	if (currPixel.getBlue() % 5 == 0) {
			  		messagePixel.setColor(Color.BLACK);
			  		count++;
			  		}
			  	}
		  	}
		  	System.out.println(count);
		  	return messagePicture;
	  	}
	  
	  

  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    /*Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
    
    Picture p = new Picture("myPicture.jpg");
    Picture smallP = p.scale(0.25,0.25);
    smallP.write("smallMyPicture.jpg");*/
	  System.out.println("Name: Anne Chen, Date: 4/24/18, Class: APCSA-Mauro P1, Computer #: 16");
  }
  
} // this } is the end of class Picture, put all new methods before this
