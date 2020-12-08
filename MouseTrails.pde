Balloon[] balloons = new Balloon[400];
Spike[] spikes = new Spike[6];

public void setup() {
  size(600,600);
  
  for (int i = 0 ; i< 400 ; i++) {
    balloons[i] = new Balloon (600,600);
  }
  
  for (int i = 0 ; i< 6 ; i++) {
    spikes[i] = new Spike (600,600);
  }
  
}

public void draw() {
  background(255,255,255);
  for (Balloon balloon : balloons) {
  if (!balloon.alive()) continue;
  balloon.draw();
  balloon.move();
  balloon.balloonVsMouse();
  }
  for (Spike spike : spikes) {
 
    for (Balloon b : balloons) {
    spike.attack(b);
    }
    
  spike.collideWorldBounds(600,600);
  spike.draw();
  spike.move();
 
  }
}
