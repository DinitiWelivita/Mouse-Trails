import java.util.ArrayList;

//Balloon[] balloons = new Balloon[400];
ArrayList<Balloon> balloons = new ArrayList<Balloon>();

public void setup() {
  size(600,600);
  
 
}

public void draw() {
  background(255,255,255,200);
 
  for (int i = 0 ; i< 10 ; i++) {
   balloons.add( new Balloon (600,600));
  }
  
  for (Balloon balloon : balloons) { // <=========
  //cars.set
    //balloons[i] = new Balloon (600,600); 
  balloon.draw();
  balloon.move();
  balloon.collideWorldBounds();
  }
}
