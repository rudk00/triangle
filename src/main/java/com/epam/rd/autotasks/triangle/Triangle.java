package com.epam.rd.autotasks.triangle;

class Triangle {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public double x3;
    public double y3;
    public double a;
    public double b;
    public double c;

    public Triangle(Point A, Point B, Point C) {
        x1 = A.getX();
        y1 = A.getY();
        x2 = B.getX();
        y2 = B.getY();
        x3 = C.getX();
        y3 = C.getY();
        a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
        if (a>0 && b>0 && c>0 && a+b>c && a+c>b && b+c>a){
        }else {
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double p = (a+b+c)/2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }

    public Point centroid(){
        Point centroid = new Point((x1+x2+x3)/3, (y1+y2+y3)/3);
        return centroid;
    }
}
