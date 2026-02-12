public class testMovablePoint {
    public static void main(String[] args){
        System.out.println("==========================================");
        System.out.println(" Point and movable point");
        System.out.println("==========================================");


        //point section
        System.out.println("---section 1: Pont object");
        
        Point p1 = new Point();
        System.out.println("Default point : "+ p1);

        Point p1 = new Point(3.0,4.0);
        System.out.println("Default at(3,4) : "+ p2);

        p2.setX(5.0);
        p2.setY(6.0);
        System.out.println("After setX(5), setY(6):" +p2);

        double[] coords = p2.getXY();
        System.out.println("getXY() = [" + coords[0] + ", " + coords[1] + "]");


        //section2 Movable point object

        System.out.println("\n--- Section 2: MovablePoint Objects ---");

        MovablePoint mp1 = new MovablePoint(0.0, 0.0, 2.0, 3.0);
        System.out.println("Initial position: " + mp1);

        System.out.println("X coordinate: " + mp1.getX());
        System.out.println("Y coordinate: " + mp1.getY());


        //section 3 : movement

        System.out.println("\n--- Section 3: Movement ---");

        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After 1st move: " + mp1);
        mp1.move();
        System.out.println("After 2nd move: " + mp1);
        mp1.move();
        System.out.println("After 3rd move: " + mp1);

        mp1.setSpeed(1.0, -1.0);
        System.out.println("\nSpeed changed to (1.0, -1.0)");
        mp1.move();
        System.out.println("After move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);


        // section 4

        System.out.println("\n--- Section 4: Polymorphism ---");

        Point p3 = new MovablePoint(1.0, 1.0, 0.5, 0.5);
        System.out.println("p3 (Point ref): " + p3);
        System.out.println("p3 class: " + p3.getClass().getSimpleName());

        //cannot call move() using p3 because reference type is Point
        //compiler checks method availability using reference type not object type


        if (p3 instanceof MovablePoint) {
            MovablePoint mp2 = (MovablePoint) p3;
            mp2.move();
            System.out.println("After downcast and move: " + mp2);
            System.out.println("p3 also changed: " + p3);
        }


        // section 5: simulation

        System.out.println("\n--- Section 5: Simple Movement Simulation ---");

        MovablePoint[] points = {
                new MovablePoint(0.0, 0.0, 1.0, 1.0),
                new MovablePoint(10.0, 0.0, -1.0, 0.5),
                new MovablePoint(5.0, 5.0, 0.0, -2.0)
        };

        System.out.println("Starting positions:");
        for (int i = 0; i < points.length; i++) {
            System.out.println("  Point " + (i + 1) + ": " + points[i]);
        }

        for (int step = 1; step <= 5; step++) {
            System.out.println("\nStep " + step + ":");
            for (int i = 0; i < points.length; i++) {
                points[i].move();
                System.out.println("  Point " + (i + 1) + ": " + points[i]);
            }
        }

        System.out.println("\n===============================================");
        System.out.println("  End of testMovablePoint");
        System.out.println("===============================================");
    
    }


}