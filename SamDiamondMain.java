import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
World.setSize(10,10);
World.setDelay(5);

    Robot r = new Robot(1,5,East,25);
		r.putBeeper();
    for (int i = 0; i < 4; i++) {
      for (int n = 0; n < 4; n++) {
         r.move();
          r.turnLeft();
          r.move();
          r.putBeeper();
          r.turnLeft();
          r.turnLeft();
          r.turnLeft();

      }
      r.turnLeft();


     
    }
    // examples of commands you can invoke on a Robot
  
  }
}