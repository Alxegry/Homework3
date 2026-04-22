public class Main {
    public static void main(String[] args) {
        {
//            Задание 1
            int big = 2147483647;
            byte little = 127;
            short medium = 32767;
            long veryBig = 9223372036854775807L;
            float accurate = 0.124344567f;
            double veryAccurate = 0.1234567890123456;
            System.out.println("\nЗначение переменной big с типом int равно " + big +
                    "\nЗначение переменной little с типом byte равно " + little +
                    "\nЗначение переменной medium с типом short равно " + medium +
                    "\nЗначение переменной veryBig с типом long равно " + veryBig +
                    "\nЗначение переменной accurate с типом float равно " + accurate +
                    "\nЗначение переменной veryAccurate с типом double равно " + veryAccurate);

//            Задание 2
            float a = 27.12f;
            long b = 987678965549L;
            float c = 2.786f;
            short d = 569;
            short e = -159;
            short f = 27897;
            byte j = 67;

//            Задание 3
            byte firstClass = 23;
            byte secondClass = 27;
            byte thirdClass = 30;
            short totalPaper = 480;
            int oneStudentPaper = totalPaper / (firstClass + secondClass + thirdClass);
            System.out.println("\nНа каждого ученика рассчитано " + oneStudentPaper + " листов бумаги");

//            Задание 4
            byte efficiency = 16;
            int minuteEfficiency = efficiency / 2;
            int result1 = minuteEfficiency * 20;
            int result2 = minuteEfficiency * 60 * 24;
            int result3 = result2 * 3;
            int result4 = result2 * 30;
            System.out.println("\nЗа 20 минут машина произвела " + result1 + " штук бутылок" +
                    "\nЗа сутки машина произвела " + result2 + " штук бутылок" +
                    "\nЗа 3 дня машина произвела " + result3 + " штук бутылок" +
                    "\nЗа 1 месяц машина произвела " + result4 + " штук бутылок");

//            Задание 5
            byte totalPaint = 120;
            byte oneClassWhite = 2;
            byte oneClassBrown = 4;
            int oneClassPaint = oneClassWhite + oneClassBrown;
            int totalClass = totalPaint / oneClassPaint;
            int whitePaint = totalClass * oneClassWhite;
            int brownPaint = totalClass * oneClassBrown;
            System.out.println("\nВ школе, где " + totalClass + " классов, нужно " +
                    whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

//            Задание 6
            byte banana = 5;
            short milk = 200;
            byte iceCream = 2;
            byte egg = 4;
            byte bananaWeight = 80;
            int milkWeight = milk / 100 * 105;
            byte iceCreamWeight = 100;
            byte eggWeight = 70;
            float weightGram = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egg * eggWeight;
            int grPerKg = 1000;
            float weightKilo = weightGram / grPerKg;
            System.out.println("\n" + weightGram + " грамм\n" + weightKilo+ " килограмм");

//            Задание 7
            short excessWeight = 7 * 1000;
            int fastWeightLose = excessWeight / 500;
            int slowWeightLose = excessWeight / 250;
            int averageWeightLoss = (fastWeightLose + slowWeightLose) / 2;
            System.out.println("\n" + fastWeightLose + "\n" + slowWeightLose + "\n" + averageWeightLoss);

//            Задание 8
            int mashaSalary = 67760;
            int denisSalary = 83690;
            int krisSalary = 76230;
            float salaryIncrease = 1.1f;
            float newMashaSalary = mashaSalary * salaryIncrease;
            float newDenisSalary = denisSalary * salaryIncrease;
            float newKrisSalary = krisSalary * salaryIncrease;
            float MashaYearDiff = (newMashaSalary - mashaSalary) * 12;
            float DenisYearDiff = (newDenisSalary - denisSalary) * 12;
            float KrisYearDiff = (newKrisSalary - krisSalary) * 12;
            System.out.println("\nМаша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + MashaYearDiff + " рублей" +
                    "\nДенис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + DenisYearDiff + " рублей" +
                    "\nКристина теперь получает " + newKrisSalary + " рублей. Годовой доход вырос на " + KrisYearDiff + " рублей");
        }
    }
}