import org.code.theater.*;
import org.code.media.*;
public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1;
  private ImageFilter[][] variable2;
  private ImageFilter[][] variable3;
  private ImageFilter[][] variable4;
  private ImageFilter[][] variable5;
  private ImageFilter[][] variable6;

  
  // Constructor
  public MyStory(String[][] variable1, ImageFilter[][] variable2, ImageFilter[][] variable3, ImageFilter[][] variable4, ImageFilter[][] variable5, ImageFilter[][] variable6) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;
    this.variable4 = variable4;
    this.variable5 = variable5;
    this.variable6 = variable6;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawExampleScene();
    
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
    drawFourthScene();
    drawFifthScene();
    drawSixthScene();
  }

  public void drawExampleScene() {
    // 1. clear the scene / draw background

    // 2. Set any style (text size, font, font style, fill color)

    // 3. Draw text and images, play sounds

    // 4. Pause before transitioning
    
  }

  public void drawFirstScene() {
    clear("white");

    drawText(variable1[0][0], 50, 100);
    pause(1.0);
    drawText(variable1[0][1], 250, 100);
    pause(1.0);
    drawText(variable1[1][0], 50, 300);
    pause(1.0);
    drawText(variable1[1][1], 250, 300);

    pause(1.5);
  }

  public void drawSecondScene() {
    clear("white");

    drawImage(variable2[0][0], 0, 0, 200);
    pause(1.0);
    drawImage(variable2[0][1], 200, 0, 200);
    pause(1.0);
    drawImage(variable2[1][0], 0, 200, 200);
    pause(1.0);
    drawImage(variable2[1][1], 200, 200, 200);

    pause(1.5);
  }
 public void drawThirdScene() {
    clear("white");

    drawImage(variable3[0][0], 0, 0, 200);
    pause(1.0);
    drawImage(variable3[0][1], 200, 0, 200);
    pause(1.0);
    drawImage(variable3[1][0], 0, 200, 200);
    pause(1.0);
    drawImage(variable3[1][1], 200, 200, 200);

    pause(1.5);
 }
   public void drawFourthScene() {
    clear("white");

    drawImage(variable4[0][0], 0, 0, 200);
    pause(1.0);
    drawImage(variable4[0][1], 200, 0, 200);
    pause(1.0);
    drawImage(variable4[1][0], 0, 200, 200);
    pause(1.0);
    drawImage(variable4[1][1], 200, 200, 200);
    pause(1.5);
 }
   public void drawFifthScene() {
    clear("white");

    drawImage(variable5[0][0], 0, 0, 200);
    pause(1.0);
    drawImage(variable5[0][1], 200, 0, 200);
    pause(1.0);
    drawImage(variable5[1][0], 0, 200, 200);
    pause(1.0);
    drawImage(variable5[1][1], 200, 200, 200);

    pause(1.5);
 }
   public void drawSixthScene() {
    clear("white");

    drawImage(variable6[0][0], 0, 0, 200);
    pause(1.0);
    drawImage(variable6[0][1], 200, 0, 200);
    pause(1.0);
    drawImage(variable6[1][0], 0, 200, 200);
    pause(1.0);
    drawImage(variable6[1][1], 200, 200, 200);
    pause(1.5);
 }
}