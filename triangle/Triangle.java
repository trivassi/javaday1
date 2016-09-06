class Triangle {
  public int mSideOne;
  public int mSideTwo;
  public int mSideThree;


  public Triangle(int sideOne, int sideTwo, int sideThree){
    mSideOne = sideOne;
    mSideTwo = sideTwo;
    mSideThree = sideThree;
  }

  public String TriangleType(){

    if( (mSideOne > (mSideTwo + mSideThree)) ||
        (mSideTwo > (mSideOne + mSideThree)) ||
        (mSideThree > (mSideOne + mSideTwo)) )
      return("Not a Triangle");
    else if(mSideOne == mSideTwo && mSideTwo == mSideThree)
      return("Equilateral");
    else if( (mSideOne == mSideTwo &&  mSideOne != mSideThree) ||
             (mSideOne == mSideThree &&  mSideOne != mSideTwo)  ||
             (mSideTwo == mSideThree &&  mSideTwo != mSideOne) )
      return("Isosceles");
    else if (mSideOne != mSideTwo && mSideTwo != mSideThree)
      return("Scalene");
    else
       return("Not Sure");

  }

}
