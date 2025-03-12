import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    // 2D Array
    String[][] array1 = {
      {"This is Vietnam", "-Located in Southeast Asia"},
      {"-There are different dialects/accents", "-Has tropical climate"}
    };

    ImageFilter[][] array2 = {
      { new ImageFilter("banhMi.jpg"), new ImageFilter("pho.jpg") },
      { new ImageFilter("summerRoll.jpg"), new ImageFilter("comGa.jpg") },
    };

     ImageFilter[][] array3 = {
      { new ImageFilter("lixi.jpg"), new ImageFilter("Lion.jpg") },
      { new ImageFilter("aoDai.jpeg"), new ImageFilter("tetFood.jpg") },
    };

    // MyStory object
    MyStory scene = new MyStory(array1, array2, array3);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}