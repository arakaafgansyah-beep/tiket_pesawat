 import java.util.Scanner;

public class main {
    public static void main(String[] args) {

String grade;

        Scanner in = new Scanner(System.in);

System.out.print("Berapa nilai = ");

double total = in.nextDouble();
if (total >= 85) {

grade = "A";

}else if (total >= 70){

grade = "B";

} else if (total >= 55){

grade = "C";

}else if (total >= 40) {

grade = "D";

} else {
    grade = "E";
}

System.out.println("Hasil = " + grade);

in.close();
	}
}