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
        if (temperatureExampleCold > 5){
            System.out.println("На улице " + temperatureExampleCold + " градусов, можно идти без шапки.");
        }
        if (temperatureExampleWarm < 5){
            System.out.println("На улице " + temperatureExampleWarm + " градусов, нужно надеть шапку.");
        }
        if (temperatureExampleWarm > 5){
            System.out.println("На улице " + temperatureExampleWarm + " градусов, можно идти без шапки.");
        }

    }
}