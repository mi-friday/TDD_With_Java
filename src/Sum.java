//public class Weather {
//    public static void main(String[] args) {
//        Weather weatherObject1 = new Weather();
//        Weather weatherObject2 = new Weather();
//        Weather weatherObject3 = new Weather();
//        Weather weatherObject4 = new Weather();
//        System.out.println(weatherObject1.checkWeatherCondition("sunny"));
//        System.out.println(weatherObject2.checkWeatherCondition("windy"));
//        System.out.println(weatherObject3.checkWeatherCondition("rainy"));
//        System.out.println(weatherObject4.checkWeatherCondition("snowy"));
//
//    }
//    public String checkWeatherCondition(String weatherCondition) {
//        switch (weatherCondition) {
//            case "sunny": return "Wear sunglasses";
//            case "windy": return "Wear jacket";
//            case "rainy": return "Take umbrella";
//            case "Snowy": return "Stay at home";
//            default: return "Check your weather";
//        }


import java.util.Scanner;

public class Sum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int userNum = input.nextInt();
            int sum = 0;
          while(sum < userNum){
              System.out.println("Enter a number");

              sum = sum + input.nextInt();
          }
            System.out.println("The first number is " + userNum + "sum + sum");

        }


    }