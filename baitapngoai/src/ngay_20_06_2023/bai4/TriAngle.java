package ngay_20_06_2023.bai4;

public class TriAngle {
    public boolean checkTriAngle(int side1, int side2, int side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return false;
        }
        return true;
    }

    public void typeTriangle(int side1, int side2, int side3) {
        if (!checkTriAngle(side1, side2, side3)) {
            System.out.println("đây không phải 3 cạnh của tam giác");

        } else {
            if (side1*side1 +side2*side2 == side3*side3 || side1*side1 + side3*side3 == side2*side2 ||
                    side2*side2 + side3*side3 == side1*side1) {
                System.out.println("tam giác vuông");

            }else if (side1 == side2 && side2 == side3){
                System.out.println("tam giác đều");

            }else if (side1 == side2 || side2 == side3 || side1 == side3){
                System.out.println("tam giác cân");

            }else {
                System.out.println("tam giác thường");
            }
        }
    }

}
