import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

ArrayList<Balloon> balloons = new ArrayList<Balloon>();

public void setup() {
  size(600,600);
}

public void draw() {
  background(255,255,255);
  int i = 0;
  
if ((mouseX-pmouseX!=0 || mouseY-pmouseY!=0)&&mousePressed==true) {
  
  for (i = 0 ; i< 1 ; i++) {
    if (i%2==0) {
    }
   balloons.add( new Balloon (600,600));
  
  }
}  



  for (Balloon balloon : balloons) { 
 
    if (balloon.alive = false) continue;
  balloon.draw(i);
  balloon.move();
  balloon.whatever();

  for (Balloon b2 : balloons) {
  balloon.collide(b2);
  }
 
  }


}
