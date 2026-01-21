package gr.aueb.cf.cf9.ch14;

public class Point {

    private double x;

    public Point(){

    }
    public Point(double x){
        this.x = x;

    }

    public double getX() {                     // μπορούν να κληρονομηθούν

        return x;
    }

    public void setX(double x) {               // μπορούν να κληρονομηθούν

        this.x = x;
    }

  public void movePlusOne(){                   // μπορεί να κληρονομηθεί επειδή είναι Public
        x += 1;
  }
  protected void movePlusTen(){

        x += 10;
  }
  private void reset(){

        x = 0;
  }

    @Override
    public String toString() {
        return "(" + x + " )";
    }
}
