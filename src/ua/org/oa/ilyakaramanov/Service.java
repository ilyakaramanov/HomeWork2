package ua.org.oa.ilyakaramanov;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Класс вычисляет среднюю стоимость запчастей. Выводит на экран все запчасти, чья стоимость:
выше средней - moreThanAverage()
выше определенной суммы (сумму вводим с клавиатуры)- moreThanFixPrice()
ниже средней - lessThanAverage()
ниже определенной суммы (сумму вводим с клавиатуры) - lessThanFixPrice()
 */

public class Service {


    Parts parts = new Parts();

    private float averageCost() {
        float sumOfPrice = 0;
        for (int i = 0; i < parts.price.length; i++) {
            sumOfPrice += parts.price[i];
        }
        float average = sumOfPrice / parts.price.length;
        return average;
    }

    public void moreThanAverage() {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < parts.price.length; i++) {
            if (parts.price[i] > averageCost()) {
                array.add(parts.name[i]);
            }
        }
        System.out.println("Запчасти с ценой выше средней: " + array);
    }

    public void moreThanFixPrice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fixPrice = Integer.parseInt(reader.readLine());
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < parts.price.length; i++) {
            if (parts.price[i] > fixPrice) {
                array.add(parts.name[i]);
            }
        }
        System.out.println("Запчасти с ценой выше " + fixPrice + "$ " + array);
    }

    public void lessThanAverage() {
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < parts.price.length; i++) {
            if (parts.price[i] < averageCost()) {
                array.add(parts.name[i]);
            }
        }
        System.out.println("Запчасти с ценой ниже средней: " + array);
    }

    public void lessThanFixPrice() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int fixPrice = Integer.parseInt(reader.readLine());
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < parts.price.length; i++) {
            if (parts.price[i] < fixPrice) {
                array.add(parts.name[i]);
            }
        }
        System.out.println("Запчасти с ценой ниже " + fixPrice + "$ " + array);
    }

    public void toSort() {
        Arrays.sort(parts.price);       //Сортировка по возрастанию (10 задание)
        System.out.print("Сортируем массив по возрастанию: ");
        System.out.println(Arrays.toString(parts.price));
    }

    public void toInform() {
        System.out.println("Пустой метод");
    }

    public void toInform(int a, int b) {
        System.out.println("Наш автосервис работает с " + a + " до " + b);
    }

    public void toInform(String service, String parts) {
        System.out.println("Программа содержит классы " + service + " и " + parts);
    }


}



            







