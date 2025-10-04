class Rectangle {
    double l,b;

    Rectangle(){
        this.l  =  0;
        this.b =  0;
    }

    Rectangle(double l,double b){
        this.l = l;
        this.b = b;
    }

    public double area(){
        return  l*b;
    }

    public double perimeter(){
        return 2 * (l + b);
    }

    public static void main(String args[]){
        Rectangle r1 = new Rectangle(2,5);
        System.out.println("area =" + r1.area());
        System.out.println("perimeter =" + r1.perimeter());
    }
}