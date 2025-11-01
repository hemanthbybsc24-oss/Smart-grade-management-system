class box {
    int h,w,l;
    int area() {
        System.out.println("Area of box: " + (h*w*l));
        int a= 5;
        return a;
    }

public static void main(String args[]) 
{
    box b1 = new box();
    b1.h = 10; b1.w = 20; b1.l = 15;
    box b2 = new box();
    b2.h = 5; b2.w = 10; b2.l = 12;
    System.out.println("Box Dimensions: " + b1.h  +  b1.w  +  b1.l);
    System.out.println("Box Dimensions: " + b2.h  +  b2.w  +  b2.l);
}
}