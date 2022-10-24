public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");  // задача № 1
        int a = 231;
        byte b = 127;
        short s = 32276;
        long l = 999999999;
        float f = 2.5F;
        double d = 5.2;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("Задача № 2");  // задача № 2
        int a2 = 159;
        byte b2 = 67;
        short s2 = 27897;
        short s22 = 569;
        long l2 = 987678965549l;
        float f2 = 27.12F;
        int i2 = 786;
        double d2 = 2.786;
        boolean bool2 = false;
        System.out.println("Задача № 3");  // задача № 3
        int teacher1 = 23; //Людмилы Павловна
        int teacher2 = 27;
        int teacher3 = 30;
        int totalSheetsPaper = 480;
        int totalStudents = 23 + 27 + 30;
        int toEveryStudent;
        toEveryStudent = (totalSheetsPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано  " + toEveryStudent + "  листов бумаги");

        System.out.println("Задача № 4");  // задача № 4

       int machinePrformance = 16 / 2;//в минуту
        int machineOutputPerHour = 60 * machinePrformance;//в час
        int machineProductivityPerDay = 24 * machineOutputPerHour;//в сутки
        System.out.println("За 20 минут машины произвели бутылок " + (20 * machinePrformance) + " штук ");
        System.out.println("За сутки машины произвели бутылок " + machineOutputPerHour + " штук ");
        System.out.println("За 3 дня машины произвели бутылок " + (3*machineProductivityPerDay) + " штук ");
        System.out.println("За 1 месяц машины произвели бутылок " + (30*machineProductivityPerDay) + " штук ");

        System.out.println("Задача № 5");  // задача № 5

        int whitePaint = 2; // белой краски на один класс
        int brownPaint = 4;// коричневой краски на один класс
        int perClass= whitePaint+brownPaint;// всего краски на класс
        int wholeCansPaint = 120;
         int totalClass = (wholeCansPaint /perClass); // всего классов в школе
         int allWhite = whitePaint * totalClass;// всего белой краски
         int allbrown = brownPaint * totalClass;// всего коричневой
        System.out.println("В школе, где "+ totalClass+" классов, нужно " + allWhite+
                " банок белой краски и " + allbrown+ " банок коричневой краски");

        System.out.println("Задача № 6");  // задача № 6

        int massOfBanana = 80 ;
        int massOfMilk =105;
        int massIceCream = 100;
        int eggWeight = 70;
        int massOfCocktail = (5*massOfBanana+ 2+massOfMilk +2*massIceCream + 4*eggWeight)/100;
        System.out.println("масса коктеля  " + massOfCocktail + " кг");

        System.out.println("Задача № 7");  // задача № 7

        int needToReset = 7*1000;
       int resetsPerDay =250;
        int resetsPerDay1 =500;
        int dietDays = needToReset/resetsPerDay;
        int dietDays1 =needToReset/resetsPerDay1;

        System.out.println(dietDays);
        System.out.println(dietDays1);
       System.out.println((dietDays+dietDays1)/2);

        System.out.println("Задача № 8");  // задача № 8

        double maha;
        maha = 67760;
        double denis;
        denis=83960;
        double krestina = 76230;
        System.out.println("Маша теперь получает " + maha*1.1+ " рублей.Годовой доход вырос на "+ ((maha *1.1*12)- (maha *12))+ " рублей");
        System.out.println("Денис теперь получает " +denis*1.1+ " рублей. Годовой доход вырос на "+ ((denis*13.2)-(denis*12))+ " рублей");
        System.out.println("Кристина теперь получает "+krestina *1.1+"рублей. Годовой доход вырос на " +((krestina*13.2)-(krestina*12))+ "рублей");










    }}
