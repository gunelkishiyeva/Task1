public class Main {
    public static void main(String[] args) {
// calling all methods
        AgeRestriction(15);
        ColorsNumber(6);
        playersSalary(11000);
        genderReveal(true);
        digitComparison(-12);
        checkStudentPoint(15, 3);
        checkLogin("1234567891011", "sw");
    }

    //if
    public static void AgeRestriction(int age) {

        if (age <= 18) {
            System.out.println("Non-allowed user");
        }
    }

    //if
    public static void ColorsNumber(int colorsNumber) {

        if (colorsNumber < 15) {
            System.out.println("Pail-colored dress");
        }
    }

    //if
    public static void playersSalary(int salary) {

        if (salary >= 10000) {
            System.out.println("Tax should be calculated by 2 percent ");
        }
    }

    //if else
    public static void genderReveal(boolean gender) {

        if (gender) {
            System.out.println("Boy ");
        } else {
            System.out.println("Girl");
        }
    }

    //if else
    public static void digitComparison(int digit) {

        if (digit >= 0) {
            System.out.println("It is positive digit ");
        } else {
            System.out.println("It is negative digit ");
        }
    }

    //if else

    public static void checkStudentPoint(int math, int english) {
        if (math >= 30 && english >= 20) {
            System.out.println("Student is successful");
        } else {
            System.out.println("Student is  not successful");
        }
    }


    public static void checkLogin(String username, String password) {
        if (username.length() > 12) {
            if (password.length() < 12) {

                System.out.println("Login can only be used with at least 12 characters");
            }
        }

    }

    public static void (String password) {}
}
