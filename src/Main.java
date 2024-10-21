//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("");
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("");
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("");
        //Задача 4
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("");
        //Задача 5
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("");
        //Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Задача 6");
        System.out.println("Общая масса двух бойцов - " + (boxer1 + boxer2) + " кг.");
        System.out.println("Разница между массами бойцов - " + (boxer2 - boxer1) + " кг.");
        System.out.println("");
        //Задача 7
        System.out.println("Задача 7");
        System.out.println(boxer2 % boxer1);
        System.out.println("");
        //Задача 8
        var totalHours = 640;
        var oneWorkerHours = 8;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании - " + (totalHours / oneWorkerHours) + " человек.");
        System.out.println("Если в компании работает " + (totalHours / oneWorkerHours + 94) + " человек, то всего "
                + ((totalHours / oneWorkerHours + 94)) * oneWorkerHours + " часов работы может быть поделено между сотрудниками.");
    }
}