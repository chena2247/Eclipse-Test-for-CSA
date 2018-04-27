/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

	/** Method to test keepOnlyBlue */
	public static void testKeepOnlyBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyBlue();
		beach.explore();
	}
	
	/** Method to test keepOnlyGreen */
	public static void testKeepOnlyGreen() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyGreen();
		beach.explore();
	}
	
	/** Method to test keepOnlyBlue */
	public static void testKeepOnlyRed() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.keepOnlyRed();
		beach.explore();
	}
	
	/** Method to test Negate */
	public static void testNegate() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.negate();
		beach.explore();
	}
	
	public static void testGrayscale() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.grayscale();
		beach.explore();
	}
	
	public static void testFixUnderwater() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
	
	public static void testMirrorVerticalRightToLeft() {
		Picture cater = new Picture("caterpillar.jpg");
		cater.explore();
		cater.mirrorVerticalRightToLeft();
		cater.explore();
	}

	public static void testMirrorHorizontal() {
		Picture motor = new Picture("redMotorcycle.jpg");
		motor.explore();
		motor.mirrorHorizontal();
		motor.explore();
	}
	
	public static void testMirrorHorizontalBotToTop() {
		Picture motor = new Picture("redMotorcycle.jpg");
		motor.explore();
		motor.mirrorHorizontalBotToTop();
		motor.explore();
	}
	
	public static void testMirrorDiagonal() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.mirrorDiagonal();
		beach.explore();
	}
  
	public static void testMirrorArms() {
		Picture snowman = new Picture("snowman.jpg");
		snowman.explore();
		snowman.mirrorArms();
		snowman.explore();
	}
	
	public static void testMirrorGull() {
		Picture gull = new Picture("seagull.jpg");
		gull.explore();
		gull.mirrorGull();
		gull.explore();
	}
	  /** Method to test the collage method */
	  public static void testMyCollage()
	  {
	    Picture canvas = new Picture("640x480.jpg");
	    canvas.myCollage();
	    canvas.explore();
	  }
	
	  public static void testEdgeDetection2()
	  {
	    Picture swan = new Picture("swan.jpg");
	    swan.edgeDetection(10);
	    swan.explore();
	  }
	  
	  public static void testSharpen(int x, int y, int w, int h)
	  {
	       Picture redMoto = new Picture("redMotorcycle.jpg");
	       redMoto.explore();
	       redMoto.sharpen(x,y,w,h); 
	       redMoto.explore();
	  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorTemple();
    //testMirrorArms();
    testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
	//testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testSharpen(50,50,500,400); 

  }
}