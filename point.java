class point{
    private double x= 0.0;
    private double y= 0.0

    public point(){
        this.x=0.0;
        this.y=0.0;
    }

    public point(double x,double y){
        this.x=x;
        this.y=y;
    }
    
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x=x;
    
    }
    public double getY(){
        return Y;
    }
    public void setY(double y)
        this.y=y;
}
    public void setXY(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double[] getXY() {
        return new double[]{x,y}
    }
@Override
public String toString(){
    return "(" + x +"," + y + ")";
}
