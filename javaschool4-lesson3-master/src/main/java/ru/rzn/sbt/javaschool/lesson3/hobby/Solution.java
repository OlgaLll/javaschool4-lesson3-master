package ru.rzn.sbt.javaschool.lesson3.hobby;

public class Solution {
    /**
     * Хобби
     *
     * Реализуйте метод detect таким образом, чтобы определить из входного массива students количество
     * студентов, занимающихся музыкой {@link Rockstar}, студентов, увлекающихся мотоциклами {@link Biker} и студентов
     * без хобби {@link Student} (такие студенты не должны быть ни {@link Rockstar}, ни {@link Biker}), и разместите
     * результат в виде объекта класса {@link DetectionResult} с заполненными соответствующими полями.
     * Случаи с null-ссылкой на массив и null-элементами массива следует обрабатывать.
     */
    public static DetectionResult detect(Object[] students) {
        int i=0, j=0, k=0;
        if (students != null) {
            for (int z = 0; z < students.length; z++) {
                if (students[z] != null) {
                    if (students[z].getClass() == new Biker().getClass()) {
                        i = i + 1;
                    } else {
                        if (students[z].getClass() == new Rockstar().getClass()) {
                            j = j + 1;
                        } else {
                            k = k + 1;
                        }
                    }
                }
            }
        }
        return new DetectionResult(k, j,i);
    }
}
