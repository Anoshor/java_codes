class para_passing {
    int x,y;
    para_passing(int x1,int y1) {
        x=x1;
        y=y1;
    }
    void incr(int x1) {
        x=x+x1;
        y=y+x1;
    }
    void incr(int x1,int y1) {
        x=x+x1;
        y=y+y1;
    }
    void incr(para_passing p) {
        x=x+p.x;
        y=y+p.y;
    }
    void display() {
        System.out.println(x+" "+y);
    }
    para_passing() {}
}

class para_main {
    public static void main(String ss[]) {
        para_passing p1=new para_passing(10,20);
        para_passing p2=new para_passing(100,200);
        
        p1.display();
        p1.incr(10); p1.display();
        p1.incr(10,20); p1.display();
        p1.incr(p2); p1.display();
        p2.display();
    }
}