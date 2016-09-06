class Parcel {
  public int mWeight;
  public int mHeight;
  public int mWidth;
  public int mLength;
  public boolean mGiftWrapping = false;
  public String mShippingSpeed;
  public String mShippingDistance;

  public float mCost;

  public Parcel(int weight, int height, int width, int length, String shippingSpeed, String shippingDistance){
    mWeight = weight;
    mHeight = height;
    mWidth = width;
    mLength = length;
    mShippingSpeed = shippingSpeed;
    mShippingDistance = shippingDistance;
  }

  public int Volume (){
    return(mWidth * mHeight * mLength);
  }

  public int costToShip (){
    int cost = 0;

    if (mShippingSpeed.equals("Tomorrow")) {
      cost += 20;
    } else if (mShippingSpeed.equals("3 days")) {
      cost += 10;
    } else if (mShippingSpeed.equals("1 week")) {
      cost += 5;
    } else {
      System.out.println("Shipping Speed is invalid");
    }

    if (mShippingDistance.equals("National")) {
      cost += 2;
    } else if (mShippingDistance.equals("International")) {
      cost += 20;
    }

    if (mWeight > 40) {
      cost += 20;
    } else if (mWeight < 40 && mWeight > 20 ) {
      cost += 10;
    } else {
      cost += 5;
    }
    mCost = cost;
    return cost;
  }

  public double CalcGiftWrap (){
    double surfaceArea = (2*mHeight*mLength)+(2*mHeight*mWidth)+(2*mLength*mWidth);
    double gwCost = surfaceArea * .25;
    mGiftWrapping = true;
    return(gwCost);
  }
}
