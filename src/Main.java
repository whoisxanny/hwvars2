public class Main {
    public static void main(String[] args) {
        byte cska = 127;
        System.out.println("Значение переменной - byte, " + " с типом - целочисленный, " + " равно = " + cska);
        short loko = 10000;
        System.out.println("Значение переменной - short, " + " с типом - целочисленный, " + " равно = " + loko);
        int zenit = 1000000;
        System.out.println("Значение переменной - int, " + " с типом - целочисленный, " + " равно = " + zenit);
        long spartak = 1000000000;
        System.out.println("Значение переменной - long, " + " с типом - целочисленный, " + " равно = " + spartak);
        float pariNn = 10.2435f;
        System.out.println("Значение переменной - float, " + " с типом - плавающая точка, " + " равно = " + pariNn);
        double khimki = 9.921941924912f;
        System.out.println("Значение переменной - double, " + " с типом - плавающая точка, " + " равно = " + khimki);





        float kfc = 27.2f;
        long mac = 987678965549L;
        float bk = 2.786f;
        short cockatoo = 569;
        short zzz = -159;
        short deadInside = 27897;
        byte zxc = 67;





        byte lyuda = 23;
        byte anna = 27;
        byte katya = 30;
        int allInAll = lyuda + anna + katya;
        short papers = 480;

        System.out.println("На каждого ученика рассчитано " + papers/allInAll + " листов бумаги");






        byte amountIn2Minutes = 16;
        int productivityIn1Minute = amountIn2Minutes/2;
        byte time1 = 1;
        byte time2 = 20;
        int day = 60 * 24;
        int threeDays = day * 3;
        int month = day * 30;

        System.out.println("За 1 минуту машина произвела " + productivityIn1Minute * time1 );
        System.out.println("За 20 минут машина произвела " + productivityIn1Minute * time2 );
        System.out.println("За 1 день машина произвела " + productivityIn1Minute * day );
        System.out.println("За 3 дня машина произвела " + productivityIn1Minute * threeDays );
        System.out.println("За 1 месяц машина произвела " + productivityIn1Minute * month );





        byte bought = 120;
        byte whiteColorForEachClass = 2;
        byte brownColorForEachClass = 4;
        int dyeForEachClass = whiteColorForEachClass + brownColorForEachClass;
        int amountOfClasses = bought / dyeForEachClass;
        int amountOfWhiteColor = whiteColorForEachClass * amountOfClasses;
        int amountOfBrownColor = brownColorForEachClass * amountOfClasses;

        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + amountOfWhiteColor + " банок белой краски и " + amountOfBrownColor + " банок коричневой краски.");





        byte bananas = 5;
        byte oneBananaCalories = 80;
        int bananasCalories = bananas * oneBananaCalories;
        short milk = 200;
        short hundredMlMilkCalories = 105;
        int milkCalories = hundredMlMilkCalories * 2;
        byte iceCream = 2;
        byte oneIceCreamCaloreis = 100;
        int iceCreamCalories = iceCream * oneIceCreamCaloreis;
        byte eggs = 4;
        byte oneEggCalories = 70;
        int eggsCalories = eggs * oneEggCalories;
        int caloriesAllInAll = bananasCalories + milkCalories + iceCreamCalories + eggsCalories;
        int caloriesAllInAllInKg = caloriesAllInAll / 1000;

        System.out.println("Кол-во каллорий равна " + caloriesAllInAll + " грамм, или же " + caloriesAllInAllInKg + " киллограмм");







        short needToLoseGrams = 7000;
        short evDayLostGramsVarOne = 250;
        short evDayLostGramsVarTwo = 500;
        int neededDaysVar1 = needToLoseGrams / evDayLostGramsVarOne;
        int neededDaysVar2 = needToLoseGrams / evDayLostGramsVarTwo;

        System.out.println("Если терять по " + evDayLostGramsVarOne + " грамм в день, то необходимое количество дней равно " + neededDaysVar1);
        System.out.println("Если терять по " + evDayLostGramsVarTwo + " грамм в день, то необходимое количество дней равно " + neededDaysVar2);
        System.out.println("В среднем необходимо " + ((neededDaysVar1 + neededDaysVar2) / 2) + " дней.");






        int mashaSalary = 67760;
        int dennisSalary = 83690;
        int kristinaSalary = 76230;
        byte percentageGrowth = 10;
        int mashaSalaryNew = mashaSalary  + (mashaSalary * 10 / 100);
        int dennisSalaryNew = dennisSalary  + (dennisSalary * 10 / 100);
        int kristinaSalaryNew = kristinaSalary  + (kristinaSalary * 10 / 100);

        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + ((mashaSalaryNew - mashaSalary) * 12) + " рублей");
        System.out.println("Даня теперь получает " + dennisSalaryNew + " рублей. Годовой доход вырос на " + ((dennisSalaryNew - dennisSalary) * 12) + " рублей");
        System.out.println("Кристик теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на " + ((kristinaSalaryNew - kristinaSalary) * 12) + " рублей");
    }
}