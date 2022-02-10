public class ptb2 {
    double a, b, c;
    public ptb2(){
    }
    public ptb2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  double getR1(){
        return (-b + Math.sqrt(Math.pow(b,2)- 4*a*c)) / (2 * a);
    }
    public  double getR2(){
        return (-b - Math.sqrt(Math.pow(b,2)- 4*a*c)) / (2 * a);
    }
    public double getDelta(){
        return Math.pow(b,2)-4*a*c;
    }
}
