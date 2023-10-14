public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int agePerson1 = 17;
        int agePerson2 = 117;
        if (agePerson1 >= 18){
            System.out.println("Если возраст человека равен " + agePerson1 +", то он совершеннолетний.");
        } else{
            System.out.println("Если возраст человека равен " + agePerson1 +", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        if (agePerson2 >= 18){
            System.out.println("Если возраст человека равен " + agePerson2 +", то он совершеннолетний.");
        } else{
            System.out.println("Если возраст человека равен " + agePerson2 +", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
        int temperatureExampleCold = -10;
        int temperatureExampleWarm = 16;
        if (temperatureExampleCold < 5){
            System.out.println("На улице " + temperatureExampleCold + " градусов, нужно надеть шапку.");
        }
        if (temperatureExampleCold > 5) {
            System.out.println("На улице " + temperatureExampleCold + " градусов, можно идти без шапки.");
        }
        if (temperatureExampleWarm < 5){
            System.out.println("На улице " + temperatureExampleWarm + " градусов, нужно надеть шапку.");
        }
        if (temperatureExampleWarm > 5){
            System.out.println("На улице " + temperatureExampleWarm + " градусов, можно идти без шапки.");
        }
        // "больше" или "больше или равно"?

        System.out.println("Задача 3");
        int speedLimit = 60;
        int speed1 = 100;
        int speed2 = 59;
        if (speed1 > speedLimit){
        System.out.println("Если скорость " + speed1 +  " км/ч, то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость " + speed1 +  "км/ч, то можно ездить спокойно.");
        }
        if (speed2 > speedLimit){
            System.out.println("Если скорость " + speed2 +  " км/ч, то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость  " + speed2 + " км/ч, то можно ездить спокойно.");
        }
        // "больше" или "больше или равно"?

        System.out.println("Задача 4");
        int age = 10;
        if (age > 2 && age < 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        }
        if (age > 7 && age < 17){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
        }
        if (age >= 18 && age <= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университете.");
        }
        if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в на работу.");
        }
        // "больше" или "больше или равно"?

        System.out.println("Задача 5");
        int childAge = 7;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        if (childAge > 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        }
        if (childAge > 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", можно кататься на аттракционе без сопровождения взрослого.");
        }
        // "больше" или "больше или равно"?

        System.out.println("Задача 6");
        int trainCapacity = 102;
        int trainSeats = 60;
        int bookingNumber = 66;
        if (trainCapacity > bookingNumber){
            if (trainSeats >= bookingNumber){
                System.out.println("В вагоне остались сидячие места.");
            }
            else {
                System.out.println("В вагоне остались только стоячие места.");
            }
        }
        else {
            System.out.println("Вагон полностью забит.");
        }

        System.out.println("Задача 7");
        int one = 1;
        int two = 5;
        int three = 5;
        if (one > two){
            if (one > three){
                System.out.println("One самое большее из трёх чисел.");
            }
            else{
                System.out.println("Three самое большее из трёх чисел.");
            }
        }
        else {
            if (two > three){
                System.out.println("Two самое большее из трёх чисел.");
            }
            else{
                System.out.println("Three самое большее из трёх чисел.");
            }
        }

    }
}