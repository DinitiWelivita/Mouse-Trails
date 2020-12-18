import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.ArrayList; 
import java.awt.Color; 
import java.awt.Graphics; 
import java.util.ArrayList; 
import java.awt.Color; 
import java.awt.Graphics; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class MouseTrail extends PApplet {





ArrayList<Balloon> balloons = new ArrayList<Balloon>();

public void setup() {
  
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




public class Balloon {
  
  private int x,y,vx,vy,size, space, color1, color2, color3, color4;
  public boolean alive = true;
  public int number = 0;
  public int triangle = 20;
  
  
  
  public Balloon (int cwidth, int cheight) {
    this.space = 50;
    this.x = (int) random(mouseX-space, mouseX+space);
    this.y = (int) random(mouseY-space, mouseY+space);
    this.vx = (int) random(-3,3);
    this.vy = (int) random(-3,3);
    this.size = (int) random(0,50);
   this.color1 = (int) random(10,255);
   //this.color1 = (int) mouseX/600*255;
    this.color2 = (int) random(100,255);
    this.color3 = (int) random(100,255);
    this.color4 = (int) random(0,255);
    
    if ((this.x>600 || this.x<0|| this.y>600||this.y<0)) {
      this.alive=false;
    }
   
   if (this.vx == 0) {
     this.vx = (int) random(-3,3);
   }
   
   if (this.vy == 0) {
     this.vy = (int) random(-3,3);
   }
   
  }
  
  public void draw(int i) {
    noStroke();
   fill(color1,color2,color3,color4);
   if (i%3==0) {
   square(x,y,size);
}
else if (i%2==0){
  circle(x,y,size);
}

else {
triangle((int)random(x-triangle,x+triangle),(int)random(y-triangle,y+triangle), (int)random(x-triangle,x+triangle),(int)random(y-triangle,y+triangle), (int)random(x-triangle,x+triangle), (int)random(y-triangle,y+triangle));
}
 }


  public void move() {
    x+=vx;
    y+=vy;
}

public void collideWorldBounds() {
        if (x>1000|| x<0) {
            vx *= -1;
        }
       if (y>1000 || y<0) {
           vy *= -1;
       }
       
       
       
    }



private boolean circleVsCircle(Balloon b1, Balloon b2) {
  
  if (dist(b1, b2)<smallest(b1,b2)) {
            return true;
        }
        else {
            return false;
        }
  
}

private double dist(Balloon b1, Balloon b2) {
  return Math.sqrt(Math.pow(b2.x-b1.x,2)+Math.pow(b2.y-b1.y,2));
}

private int smallest(Balloon b1, Balloon b2) {
if (b1.size>b2.size) {
    return b2.size;
  }

  else {
    return b1.size;
     }
  }
  
  private Balloon leftest(Balloon b1, Balloon b2) {
   if (b1.x<b2.x) {
     return b1;
   }
   else {
   return b2;
   }
 }
  
  public void collide(Balloon other) {
        if (circleVsCircle(this, other)) {
            int tempvx = this.vx;
            int tempvy = this.vy;
            this.vx = other.vx;
            this.vy = other.vy;
            other.vx = tempvx;
            other.vy = tempvy;
            if (this.x<this.y) {
             // this.x=this.x-this.size*2;
            }
        }
    }
  
  public void whatever() {
     mouseClicked(); {
      number=number+1;
   // print(number);
}
  }
}
  public void settings() {  size(600,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "MouseTrail" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
