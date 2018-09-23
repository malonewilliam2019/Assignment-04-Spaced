public class Main {

    public static void main(String[] args) {
double xa=5,xb=4,xc=-3;
double ya=2,yb=9,yc=2;
double za=-5,zb=2,zc=6;

double ab=Math.sqrt(Math.pow(xa-xb,2)+Math.pow(ya-yb,2)+Math.pow(za-zb,2));
double bc=Math.sqrt(Math.pow(xb-xc,2)+Math.pow(yb-yc,2)+Math.pow(zb-zc,2));
double ca=Math.sqrt(Math.pow(xc-xa,2)+Math.pow(yc-ya,2)+Math.pow(zc-za,2));

double max=Math.max(ab,Math.max(bc,ca));
double min=Math.min(ab,Math.min(bc,ca));

System.out.println("max");
System.out.printf("%.2f %1s \n",max,"feet");
System.out.println("min");
System.out.printf("%.2f %1s",min,"feet");
    }
}
