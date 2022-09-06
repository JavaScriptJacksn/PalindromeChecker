import java.util.Scanner;

public class MyMaths {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public float multiply(float x, float z){
        return x * z;
    }

    public int getNum(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
