package BasicJava.Chapter1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO:Практика:
// В методе main консольного приложения извлечь числа из текста (текст передать параметром при запуске приложения).
// Результат программы выводит сумму найденных чисел в консоль.
public class Task {
    public static void main(String args[]){
        System.out.println("Оригинальная строка: "+args[0]);
        Double sum = 0d;
//        String t[] = {"234sdsads 3 sdsads -54 dsfdsf 44.3 sdsd 55/3 343,7","rrrrrrrrrr"}; //Тестовая строка
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?(\\,\\d+)?");
        Matcher matcher = pattern.matcher(args[0]);
        while (matcher.find()){
            sum = sum + Double.valueOf(matcher.group().replaceAll(",","."));
        }
        System.out.println(sum);
    }
}
