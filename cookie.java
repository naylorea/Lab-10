class Cookie {
int cookieAmt;
int temp;
int time;
boolean baked;


Cookie() {
cookieAmt = 0;
temp = 0;
time = 0;
baked = false;

}

Cookie(int theCookieAmt, int theTemp, int theTime, boolean theBaked) {

  cookieAmt = theCookieAmt;
  temp = theTemp;
  time = theTime;
  baked = theBaked;

}

boolean isReady() {
  return baked;

}

void setNum(int theNumber) {
cookieAmt = theNumber;

}

void bake(int newTemp, int newTime) {

temp = newTemp;
time = newTime;
baked = true;

System.out.println("the cookies were baked at " + temp + " degrees F for " + time + " minutes");

}




}