package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    private static String marka;
    private String fio;
    private String marca;

    public static void main(String[] args) {

        int number;
        String fio;
        String marka;
        boolean nal;
        boolean opl;


    }

    enum Mmarka {
        BMW, Lada, lexus, Citroen, Honda, Hyundai, Lexus, Mazda, Mercedes, Peugeot, Renault, Skoda, Subaru, Suzuki, Tesla, Toyota, Укравто;

        public static boolean TrueMarka(String newMarka) {

            Mmarka[] array =   Mmarka.values();
            for (int i = 0; i <array.length ; i++) {
                // System.out.println(array[i]);
                if(array[i].toString().equals(marka)){
                    return true;
                }
            }
            return false;
        }
    }


    public Main(int number, String fio, String marka, boolean nal, boolean opl) {

        this.setNumber(number);
        this.setFio(fio);
        this.setMarka(marka);
        this.setNal(nal);
        this.setOpl(opl);

    }

    void setNal(boolean nal) {
        if (nal = true) {
            System.out.println("Автомобиль на месте");
        } else {
            System.out.println("Автомобиль не на месте");
        }
    }

    void setOpl(boolean opl) {

        if (opl = true) {
            System.out.println("Место оплачено");
        } else {
            System.out.println("Место не оплачено");
        }

    }




    void setMarka(String newMarka) {
        if (Mmarka.TrueMarka(newMarka)) {
            this.marca = newMarka;
        } else
            System.out.println("Марка введена некорректно!");
    }


    void setFio(String newfio) {
          Pattern Fio = Pattern.compile("^([A-Z][a-z]+) ([A-Z][a-z]+) ([A-Z][a-z]+)$");
          // регулярное выражения для ФИО
          Matcher m = Fio.matcher(newfio);
          //обьект искатель.интерпретирует шаблон и выполняет операции сопоставления с входной строкой
          //мы отправили в обьект искатель то, что хотим записать в качестве нового ФИО
          if(m.matches())//вернёт тру, если наш новый ФИО соответствует регулярному выражению
          {
              this.fio = newfio;//если тру, тогда записываем новый на место старого
          }
          else
              System.out.println("ФИО введены некорректно!");
    }

    void setNumber(int number) {

        if (number==number){
            System.out.println("Ошибка это место занято");

        }else{
            System.out.println("Это место свободное");
        }

    }




}