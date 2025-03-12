import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

  // Instance Variables
  private String[][] variable1;
  private ImageFilter[][] variable2;
  private ImageFilter[][] variable3;
  
  // Constructor
  public MyStory(String[][] variable1, ImageFilter[][] variable2, ImageFilter[][] variable3) {
    this.variable1 = variable1;
    this.variable2 = variable2;
    this.variable3 = variable3;

  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawFirstScene();
    drawSecondScene();
    drawThirdScene();
  }

//draws the first scene, being the Vietnamese flag and text
  public void drawFirstScene() {
    ImageFilter flag = new ImageFilter("VietnamFlag.png");
    // flag.keepRed();
    drawImage(flag,0,87,200);
    
    int y = 275;
    for(int i = 0; i < 2;i++){
      for(int j = 0; j < 2; j++){
         drawText(variable1[i][j], 60, y);
        pause(0.5);
        y += 30;
      }
    }

    pause(1.0);
  }

  //goes to the second scene where it prints out images of the food and audio
  public void drawSecondScene() {
    clear("red");
    variable2[0][0].grayscale();
    variable2[0][1].coolTone();
    variable2[1][0].purpleTint();
    variable2[1][1].colorize();

    // nested for loop 
    // x position to alternate 0, 200, 0, 200
    // y position to go through 0, 0, 200, 200    
     int x = 0;
     int xx=0;
     int y = 0;

      for (int i = 0; i < 2;i++){
        for (int j = 0; j < 2;j++){
          drawImage(variable2[i][j], x, y, 200);
          pause(0.5);
          xx++;
          if (xx == 1) {
            x = 200;
            y = 0;
          playSound("cartoon-bite-39234.wav");
          } else if (xx == 2 ){
            x = 0;
            y = 200;
            playSound("cartoon-bite-39234.wav");
          } else if (xx == 3){
            x = 200;
            y = 200;
            playSound("cartoon-bite-39234.wav");
          } 
        }
      }
      
  }

  //draws the thirs scene, about culture
  public void drawThirdScene() {
    clear("red");
    drawImage(variable3[0][0], 0, 0, 200);
    pause(0.5);
    drawImage(variable3[0][1], 200, 0, 200);
    pause(0.5);
    drawImage(variable3[1][0], 0, 200, 200);
    pause(0.5);
    drawImage(variable3[1][1], 200, 200, 200);

    pause(1.0);
  }

  
}