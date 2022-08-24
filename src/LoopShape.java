public class LoopShape {

    static void createRectangle(int width, int height){
        //Draw a Rectangle
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
        for (int i = 0; i < (height-2); i++) {
            System.out.print("\n#");
            for (int k = 0; k < (width-2); k++) {
                System.out.print(" ");
            }
            System.out.print("#");
        }
        System.out.println();
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }


    }

    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        System.out.println();
        System.out.println();
        int counter = 1;
        for (int i = 0; i < (leg-1) ; i++) {
            System.out.print("#");
            if (counter != 1){
                for (int k = 0; k < (counter-2); k++) {
                    System.out.print(" ");
                }
                System.out.print("#\n");
            }
            else {
                System.out.println("");
            }
            counter++;
        }
        for (int i = 0; i < leg; i++){
            System.out.print("#");
        }


    }
}
