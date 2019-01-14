package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     *
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     *
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     *
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted){
        StringBuilder result = new StringBuilder("");
        String stBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String stSmall = stBig.toLowerCase();
        if (encrypted != null) {
            for (int i = 0; i < encrypted.length(); i++) {
                char ch = encrypted.charAt(i);
                char cho = ch;
                int k = 0, f = 0;
                k = stBig.indexOf(ch);
                if (k >= 0) {
                    f = k-9;
                    if (f < 0) {f = stBig.length()-9+k;}
                    cho = stBig.charAt(f);
                }
                else {
                    k = stSmall.indexOf(ch);
                    if (k >= 0) {
                        f = k-9;
                        if (f < 0) {f = stSmall.length()-9+k;}
                        cho = stSmall.charAt(f);
                    }
                }
                result.append(cho);
             }
            return result.toString();
        }
        else return encrypted;
    }
}
