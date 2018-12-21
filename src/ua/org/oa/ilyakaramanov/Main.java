package ua.org.oa.ilyakaramanov;

import java.io.IOException;

/*
Запускаем методы класса Service
 */

public class Main {
    public static void main(String[] args) throws IOException {

        Service service = new Service();
        service.moreThanAverage();
        service.lessThanAverage();
        System.out.println("Введите сумму, чтобы отобразить более дорогие запчасти");
        service.moreThanFixPrice();
        System.out.println("Введите сумму, чтобы отобразить более дешевые запчасти");
        service.lessThanFixPrice();
        service.toSort();
        service.toInform();
        service.toInform(8, 20);
        service.toInform("Автосервис", "Запчасти");

    }

}
