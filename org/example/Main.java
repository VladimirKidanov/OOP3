package org.example;

import Units.*;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        Monk monk = new Monk(Unit.setName());
        System.out.println(monk.getInfo());

        ArrayList<Unit> arrayList1 = new ArrayList<>();
        arrayList1.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Unit.createArreyUnit1(arrayList1, Unit.setClass());
        }

        System.out.println("Команда 1:");

        for (int i = 0; i < arrayList1.size(); i++) {

            System.out.print(arrayList1.get(i).getInfo());
        }

        ArrayList<Unit> arrayList2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) { // Создаем 10 случайных персонажей
            Unit.createArreyUnit2(arrayList2, Unit.setClass());
        }
        System.out.println();
        System.out.println("Команда 2:");


        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.print(arrayList2.get(i).getInfo());
        }

        ArrayList arreyAll = new ArrayList<>(arrayList1);




        for (int i = 0; i < arrayList2.size(); i++) {
            arreyAll.add(arrayList2.get(i));
        }

        arreyAll.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.getSpeed() == o1.getSpeed()) {
                    return o1.getHp() - o2.getHp();
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });

        System.out.println();
        System.out.println(arreyAll);










    }
}
//крестьянин
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать
//        Возделывание полей;
//        Питание;
//          Выносливость;
//          под
//
//разбойник
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать
//        жестокость;
//        разбой;
//          Выносливость;
//
//
//
//снайпер
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
//          Выносливость;
//         Боеприпасы
//          Бегать;
меткость;
маскировка;
замирание;
 */

//колдун
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать;
            мана
            артифакты
//          Выносливость;
 */
//копейщик
//          Имя;
//          здоровье;
//          спать;
//          Ходить;
/*          Бегать;
//          Выносливость;
//          владение копьем
//          умение держать строй
//арбалетчик
////          Имя;
////          здоровье;
////          спать;
////          Ходить;
///*          Бегать;
////          Выносливость;
//            меткость
//            боеприпасы
 */
