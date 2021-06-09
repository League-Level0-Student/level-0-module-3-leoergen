
void setup() {
 
  // set the size of your sketch
  size(400,400);
}

void draw() {
  int s = 400;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
for (int i = 100; i > 0; i--){
ellipse (200,200,s,s); 
s -= 1;
if (i % 2 == 0) {
  fill (#FF6F6F);
}        
else {
fill (#DEE357);
}
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}}
