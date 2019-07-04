public class Point {
    float x =0.0f;
    float y =0.0f;

    public Point(){
    }

    public Point(float x,float y){
        this.x =x;
        this.y =y;
    }

    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public void setX(float x){
        this.x =x;
    }

    public void setY(float y){
        this.y =y;
    }

    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    public String getXY(){
        return "Array of {"+this.x +","+this.y+")";
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(15,20);
        System.out.println(point);
        point = new Point(30,45);
        System.out.println(point);
    }

}