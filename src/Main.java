public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");{
            Frog testFrog=new Frog (new point (0,0),1);
            Frog testFrog2=new Frog(0,0,100);



    }
}
}
class Point {
    int x, y;
}

    public Point (int x,int y){
    this.x=x;
    this.y=y;
     }
public statiuc double calcDistance( Point p1,Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
        }
        }
        class Frog {
            Point place;
            int tongueLength;

            public Frog(Point place, int tongueLength) {
                this.place = place;
                this.tongueLength = tongueLength;
            }
        }



    }
        }
