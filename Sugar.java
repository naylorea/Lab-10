class Sugar extends Cookie {
String shape;
boolean decoration;


Sugar() {
  shape = "";
  decoration = false;

}

Sugar(String theShape, boolean theDecoration) {

shape = theShape;
decoration = theDecoration;

}

String getShape() {

return shape;

}

void setShape(String cookieShape) {

shape = cookieShape;

}

void cutShape(String theShape, int theCookieAmt)  {

  shape = theShape;
  setNum(theCookieAmt);

  System.out.println(theCookieAmt + " cookies were cut into " + shape);

}

void decorations() {

boolean look = isReady();

if(look == true) {
System.out.println("The cookies were decorated");
}

else {

System.out.println("Make sure to bake the cookies first");

}

}



}