package programme15;

public class Wall {
    double width, height;

    public Wall() {
    }
    public Wall(double width,double height){
        this.width=width;
        this.height=height;
        if (width<0){
            this.width=0;
        }
        if (height<0){
            this.height=0;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }}
    public void setHeight ( double height){
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = width;
        }
    }
    public double getArea () {
        return (this.height * this.width);
    }
    public static void main (String[]args){
        Wall k= new Wall(5,4);
        System.out.println("area " + k.getArea());
        k.setHeight(-1.5);
        System.out.println("width= " + k.getWidth());
        System.out.println("height= " + k.getHeight());
        System.out.println("area= " + k.getArea());
    }

}
