package Test;

import Core.Obj;
import Core.Point;
import Core.Room;

public class testManagerObject {
    public static void main(String[]argv){
        Room r1 = new Room(50,100,100);
    }
    public static void testCase1(Room r){
        Point[] points = new Point[8];
        points[0] = new Point(10,10,50);
        points[1] = new Point(10,30,50);
        points[2] = new Point(20,30,50);
        points[3] = new Point(20,10,50);
        points[4] = new Point(10,10,0);
        points[5] = new Point(10,30,0);
        points[6] = new Point(20,30,0);
        points[7] = new Point(20,10,0);
        Obj o =  new Obj(points);

    }
}