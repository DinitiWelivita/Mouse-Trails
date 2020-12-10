import java.util.ArrayList;

public class Balloon {
  
  private int x,y,vx,vy,size;
  public boolean alive = true;
  
  public Balloon (int cwidth, int cheight) {
    this.x = (int) random(mouseX-20, mouseX+20);
    this.y = (int) random(mouseY-20, mouseY+20);
    this.vx = (int) random(-3,3);
    this.vy = (int) random(-3,3);
    this.size = (int) random(0,30);
  }
  
  public void draw() {
    noStroke();
   fill(200,100,100,75);
   circle(x,y,size);
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

}
