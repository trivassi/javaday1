class Parcel {
  public int mWeight;
  public int mHeight;
  public int mWidth;
  public int mLength;



  public Parcel(int weight, int height, int width, int length){
    mWeight = weight;
    mHeight = height;
    mWidth = width;
    mLength = length;
  }

  public int Volume (){
    return(mWidth * mHeight * mLength);
  }

  public int costToShip (String speed, String distance){
    int cost = 0;

    if (speed.equals("Tomorrow")) {
      cost += 20;
    } else if (speed.equals("3 days")) {
      cost += 10;
    } else if (speed.equals("1 week")) {
      cost += 5;
    } else {
      System.out.println("Not an option. Please enter: Tomorrow, 3 days or 1 week");
    }

    if (distance.equals("National")) {
      cost += 2;
    } else if (distance.equals("International")) {
      cost += 20;
    }

    if (mWeight > 40) {
      cost += 20;
    } else if (mWeight < 40 && mWeight > 20 ) {
      cost += 10;
    } else {
      cost += 5;
    }

    return cost;
  }

  public float CalcGiftWrap (){
    int surfaceArea = (2*mHeight*mLength)+(2*mHeight*mWidth)+(2*mLength*mWidth);
    return(.25*surfaceArea);
  }
}
