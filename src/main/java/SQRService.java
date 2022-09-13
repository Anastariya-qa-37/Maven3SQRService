public class SQRService {
    public int sqrCount(int rangeStart, int rangeEnd) { //передаем начало диапазона и конец
        int count = 0; // колличество вошедших квадратов в диапазон

        for (int i = 10; i <= 99; i++) { //условия цикла для перебора чисел диапазона
            int pow = (int) Math.pow(i, 2); //возводим числа в степень


            if (rangeStart <= pow && pow <= rangeEnd) { //если старт диапазона <= квадрату и квадрат <= конца диап.
                count++; //count = count +1 то к начальному результату прибавим 1
            }

        }

        return count;
    }

}
