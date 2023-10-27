public class Main {
    public static void main(String[] args) {
        var dog= 8.0;
        System.out.println(dog);

       var cat= 3.6;
        System.out.println(cat);

        var paper= 763789;
        System.out.println(paper);

        dog= dog+4;
        System.out.println(dog);
        cat= cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

       dog= dog-3.5;
       System.out.println(dog);
       cat= cat-1.6;
       System.out.println(cat);
       paper= paper-7639;
    System.out.println(paper);

    var friend= 19;
    System.out.println(friend);
    friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog= 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var boxer1Weight= 78.2;
        System.out.println(boxer1Weight);
        var boxer2Weight= 82.7;
        System.out.println(boxer2Weight);
        var boxersWeight= boxer1Weight+boxer2Weight;
        System.out.println( boxersWeight + " кг");

        var boxerWeightDifference= boxer2Weight-boxer1Weight;
        System.out.println(boxerWeightDifference);

        var overload= boxer2Weight % boxer1Weight;
        System.out.println(overload);

        var workingTime= 640;
        System.out.println(workingTime);
        var workingTimeOfOneEmployee= 8;
        System.out.println(workingTimeOfOneEmployee);
        var numberOfEmployees= workingTime/workingTimeOfOneEmployee;
        System.out.println("Всего в компании работает - " + numberOfEmployees+ " человек");

        numberOfEmployees= numberOfEmployees+94;
        System.out.println(numberOfEmployees);
        var workingTimeForOneEmployee= workingTime/numberOfEmployees;
        System.out.println(workingTimeForOneEmployee);

    }
}