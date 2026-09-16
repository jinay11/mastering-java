package basic;

public class DicisionMaking {
    public static void main(String[] args) {

//        int age = 18;
//        if(age >= 18) {
//            System.out.println("you can vote");
//        }

//        int i = 5;
//
//        if(i >= 15){
//            System.out.println("Greater than 15.");
//        }else{
//            System.out.println("smaller than 15.");
//        }

//
//        int j = 11;
//
//        if(j >= 10) {
//            System.out.println("value is grater than 10 ");
//            if(j == 10) {
//                System.out.println("result is matching");
//            }else{
//                System.out.println("result not matching");
//            }
//        }else{
//            System.out.println("value is smaller than 10 ");
//        }

//        int i = 100;

//        if(i == 10) {
//            System.out.println("i is 10");
//        }else if(i == 20){
//            System.out.println("i is 20");
//        }else if (i == 30) {
//            System.out.println("i is 30");
//        }else {
//            System.out.println("No Value....");
//        }

        int month = 1;
        switch(month) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid month :) ");
        }

    }
}
