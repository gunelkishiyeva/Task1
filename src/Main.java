public class Main {
    public static void main(String[] args) {
// calling all methods
       AgeRestriction(15);
       ColorsNumber(6);
       playersSalary(11000);
       genderReveal(true);
       digitComparison(-12);

    }

    //if
 public static void AgeRestriction(int age) {

        if (age <= 18) {
            System.out.println("Non-allowed user");
        }
 }
   //if
 public static void ColorsNumber(int colorsNumber) {

        if (colorsNumber < 5){
            System.out.println("Pail-colored dress");
    }
 }
//if
    public static void playersSalary(int salary) {

        if (salary >= 10000){
            System.out.println("Tax should be calculated by 2 percent ");
        }
    }

    //if else
    public static void genderReveal (boolean gender) {

        if (gender){
            System.out.println("Male ");
        }
        else{
            System.out.println("Female");
        }
    }

    //if else
    public static void digitComparison(int digit) {

        if (digit >= 0){
            System.out.println("It is positive digit " );
        }
        else{
            System.out.println("It is negative digit ");
        }
    }

}
