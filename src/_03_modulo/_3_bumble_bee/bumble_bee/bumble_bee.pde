
void setup() {
     ellipseMode(CENTER);
     size(500, 500);
     background(160, 160, 160);
     drawFlower(350, 100);
}

void draw() {
  
// First run the program and you should see a flower.  
  
  
/* Then, use a loop to make a body for the Bee! 
(see the image on the recipe, it's a diagonal line of circles)
Use modulo to make the colors alternate between yellow and black
*/
fill(#050501);
ellipse (250,150,150,150);

fill(#050501);
ellipse (255,40, 25, 75);
ellipse (355,150, 75, 25);
ellipse (160,115, 50, 50);
ellipse (50,50, 50, 50);
ellipse (50,50, 50, 50);
ellipse (50,50, 50, 50);
ellipse (50,50, 50, 50);
ellipse (50,50, 50, 50);

 int s = 200;
 for (int i = 15; i > 0; i--){
ellipse (200,200,s,s); 
s -= 15;
if (i % 2 == 0) {
  fill (#0F0F0F);
}
else {
fill (#F5EE65);
}

}







}
/*
Now put his head on using drawBeeFace(x,y)
*/



/**************   Use these methods but  DON'T CHANGE THE CODE BELOW  **************/

void drawFlower(int x, int y) {
     noStroke();
     translate(x, y);
     // draw 5 petals, rotating after each one
     fill(#c6ff89);      // green
      for (int i = 0; i < 5; i++) {
           ellipse(0, -40, 50, 50);
          rotate(radians(72));
     }
     fill(#fff9bb); // light yellow
     ellipse(0, 0, 50, 50);
} 

void drawBeeFace(int BeeFaceX, int BeeFaceY) {
     noStroke();
     fill(0, 0, 0);
     stroke(1);
     strokeWeight(5);
     line(BeeFaceX-10, BeeFaceY-27, BeeFaceX-17, BeeFaceY-50);
     line(BeeFaceX+10, BeeFaceY-27, BeeFaceX+17, BeeFaceY-50);
     ellipse(BeeFaceX-17, BeeFaceY-50, 10, 10);
     ellipse(BeeFaceX+17, BeeFaceY-50, 10, 10);
     noStroke();
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY, 60, 60); // face
     fill(255, 237, 209);
     fill(0,0,0);
      ellipse(BeeFaceX-10, BeeFaceY-15, 10, 10); // eyes
     ellipse(BeeFaceX+10, BeeFaceY-15, 10, 10);
      ellipse(BeeFaceX, BeeFaceY-5, 10, 10); // nose
      ellipse(BeeFaceX, BeeFaceY+10, 20, 10);// mouth
     fill(255, 251, 28);
     ellipse(BeeFaceX, BeeFaceY+5, 20, 6);
     
}
