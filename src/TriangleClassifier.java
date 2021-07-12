public class TriangleClassifier {
    public static int Triangle(int side1,int side2,int side3){
        if(((side1+side2)<side3)||((side1+side3)<side2)||((side2+side3)<side1)){
            return 0;
        }else{
            return 1;
        }
    }
    public  static int isoscelesTriangle(int side1,int side2,int side3){
        if((side1==side2)||(side2==side3)||(side3==side1)){
            return 1;
        }else{
            return 0;
        }
    }
    public static int equilateralTriangle(int side1,int side2,int side3){
        if(side1==side2&&side2==side3){
            return 1;
        }else{
            return 0;
        }
    }
}
