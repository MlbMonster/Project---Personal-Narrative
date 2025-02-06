import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  // 2D Array
    String[][] array1 = {
      {"Cars", "Guitar"},
      {"Travis Scott", "Gym"}
    };

    ImageFilter[][] array2 = {
      { new ImageFilter("Used-2020-BMW-M5-Competition-w-CCBs-Executive-Pack-Drive-Assist-Plus-Pack---Warranty-1712253125.jpg"), new ImageFilter("753_gg_acousticshapes_thumbnail.jpg") },
      { new ImageFilter("360_F_317724775_qHtWjnT8YbRdFNIuq5PWsSYypRhOmalS.jpg"), new ImageFilter("2khc6rsstsx41.jpg") },
    };


    ImageFilter[][] array3 = {
      { new ImageFilter("uezj5lfb0xac1.jpeg"), new ImageFilter("753_gg_whatshape_martin2.jpg") },
      { new ImageFilter("360_F_317724775_qHtWjnT8YbRdFNIuq5PWsSYypRhOmalS-(1).jpg"), new ImageFilter("0wdh60c7g0q71.jpg") },
    };

        ImageFilter[][] array4 = {
      { new ImageFilter("Used-2019-BMW-M5-Competition-123k-MSRP!-Executive-Package!-Bowers-and-Wilkins-Sound!-1624545839.jpg"), new ImageFilter("753_gg_acousticshapes_thumbnail.jpg") },
      { new ImageFilter("240_F_83159570_JOI1NtD7MzEOqzTYIz3eTOhEm20HgGzp.jpg"), new ImageFilter("2khc6rsstsx41.jpg") },
    };

    ImageFilter[][] array5 = {
      { new ImageFilter("bmw-m2-comp-low.jpg"), new ImageFilter("753_gg_whatshapeMartin1.jpg") },
      { new ImageFilter("240_F_93558844_zsJSg3nGtgXX0HSToxWJeBjEt1OIyTHo.jpg"), new ImageFilter("travis-scott-2014-getty-johnny-nunez-133754807.jpg") },
    };

     ImageFilter[][] array6 = {
      { new ImageFilter("bmw-m2-comp-top.jpg"), new ImageFilter("753_gg_whatshape_hummJ200.jpg") },
      { new ImageFilter("240_F_329608479_vP9nFK795X8lWmoTa8DPhMgoewQ7U1lG.jpg"), new ImageFilter("Untitled_design_88.png") },
    };

    // MyStory object
     MyStory scene = new MyStory(array1, array2, array3, array4, array5, array6);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);

       
  }
}