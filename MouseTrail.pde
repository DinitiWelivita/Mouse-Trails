import java.util.ArrayList;

//Balloon[] balloons = new Balloon[400];
ArrayList<Balloon> balloons = new ArrayList<Balloon>();

public void setup() {
  size(1000,1000);
  
 
}

public void draw() {
  background(255,255,255);
 
  for (int i = 0 ; i< 400 ; i++) {
   balloons.add( new Balloon (600,600));
  }
  
  for (String i : balloons) { 
  //cars.set
    //balloons[i] = new Balloon (600,600); 
  balloon.draw();
  balloon.move();
  balloon.collideWorldBounds();
  }
}
