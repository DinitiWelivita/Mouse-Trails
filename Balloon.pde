public class Balloon {

  private int x,y,vx,vy,size;
  public boolean alive = true;
 // private String color = "red";
  
  
  public Balloon (int cwidth, int cheight) {
    this.x = (int) random(cwidth);
    this.y = (int) random(cheight);
    this.vx = 3;
    this.vy = 3;
    this.size = (int) random(8,24);
  }

  public void draw() {

   fill(255,0,0);
   circle(x, y, size);
  }

  public void move() {
    vx = (int) random(-2,2);
    vy = (int) random(-2,2);
    x += vx;
    y += vy;
  }
  
  public void balloonVsMouse() {
    if (dist(x,y,mouseX,mouseY)<= size/2) {
    alive = false;
    }
  }
  
  public boolean alive() {
    return alive;
  }
  
  public int getX() {
  return x;
  }
  
  public int getY() {
  return y;
  }
  
  public int getSize() {
  return y;
  }
  
  public void pop() {
  alive = false;
  }
  
}
