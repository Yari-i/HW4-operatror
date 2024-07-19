
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Tusk 1");

        int age = 7;

        if (age >= 18 ) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        //Tusk 2
        System.out.println("Task 2");

        float temperature = 5;

        if (temperature >= 5 ) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }

        //Tusk 3
        System.out.println("Tusk 3");

        int speed = 61;

        if ( speed > 60 ) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        //Task 4
        System.out.println("Task 4");

        int age1 = 2;

        if ( age1 >= 2 && age1 <=7 ) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад." );
        } else if  ( age1 >= 7 &&  age1 <= 17 ) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
        } else if  ( age1 >= 18 &&  age1 <= 24 ) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в универ.");
        } else if  ( age1 > 24 )  {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу.");
        }

        //Task 5
        System.out.println("Task 5");

        int ageChild = 15;

        if ( ageChild <5 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататься на аттракционе" );
        } else if ( ageChild > 5 && ageChild < 14 ) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. " +
                        "Если взрослого нет, то кататься нельзя.");
        } else if ( ageChild > 14 )  {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого.");
        }

        //Task 6
        System.out.println("Task 6");

        int allPlace = 102;
        int sitingPlace = 60;
        int standingPlace = (allPlace - sitingPlace);
        int youPlace = 102;

        if (youPlace <= sitingPlace) {
            System.out.println("Есть место в вагоне. Оно сидячее.");
        } else if (youPlace > sitingPlace && youPlace <= allPlace){
            System.out.println("Есть место в вагоне. Оно стоячее.");
        } else if (youPlace > 102) {
            System.out.println("Вагон уже полностью забит.");

        }

        //Task 7
        System.out.println("Task 7");

        int one = 1;
        int two = 5;
        int three = 1;

        if (one > two && one > three ) {
            System.out.println("Число " + one + " наибольшее.");
        } else if (two > one && two > three ){
            System.out.println("Число " + two + " наибольшее.");
        } else if (three > one && three > two) {
            System.out.println("Число " + three + " наибольшее.");

        }

    }
}