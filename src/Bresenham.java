import java.math.BigDecimal;

public class Bresenham {
    int x1;
    int x2;
    int y1;
    int y2;
    double m;
    int deltaX;
    int deltaY;

    public Bresenham(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.deltaX = Math.abs(x2-x1);
        this.deltaY = Math.abs(y2-y1);
        calculateSlope();
        startDrawing();
    }

    public void calculateSlope(){
        this.m = (double) (y2-y1)/(x2-x1);
        System.out.println("Slope is "+m);
    }
    public void startDrawing(){
        int p=0;
        int pnew;
        int flag=0;
        System.out.println("P\t\tX\t\tY");

        if(Math.abs(m)<1){
            p = p + 2*deltaY - deltaX;
            if(m>0 && m<1) {
                while(flag==0) {
                    if (p > 0) {
                        x1++;
                        y1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaY - 2 * deltaX;
                    } else if (p < 0) {
                        x1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaY;
                    }
                }
            }
            else if(m<0 && m>-1){
                while(flag==0) {
                    if (p > 0) {
                        x1++;
                        y1--;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaY - 2 * deltaX;
                    } else if (p < 0) {
                        x1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaY;
                    }
                }
            }
            else System.out.println("Error");
        }
        else if(Math.abs(m)>1){
            p = p + 2*deltaX - deltaY;
            System.out.println(p+"\t\t"+x1+"\t\t"+y1);
            if(m>1) {
                while(flag ==0 ) {
                    if (p > 0) {
                        x1++;
                        y1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaX - 2 * deltaY;
                    } else if (p < 0) {
                        y1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaX;
                    }

                }
            }
            else if(m<-1){
                while(flag==0) {
                    if (p > 0) {
                        x1--;
                        y1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaX - 2 * deltaY;
                    } else if (p < 0) {
                        y1++;
                        System.out.println(p + "\t\t" + x1 + "\t\t" + y1);
                        if(x1==x2){
                            if(y1==y2){
                                flag=1;
                            }
                        }
                        p = p + 2 * deltaX;
                    }
                }
            }
        }

    }

}
