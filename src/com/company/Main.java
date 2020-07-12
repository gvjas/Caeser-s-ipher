package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите зашифрованный текст: ");
        String textCaesarCode  = new Scanner(System.in).nextLine();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (int j = 0; j < 33; j++) {
            char[] alphabetDecryptedCaesar = new char[33];
            StringBuilder textDecryptedCaesar = new StringBuilder();
            for (int i = 0; i < 33 - j; i++) {
                alphabetDecryptedCaesar[i] = alphabet.charAt(i + j);
            }
            for (int i = 0; i < j; i++) {
                alphabetDecryptedCaesar[33 - j + i] = alphabet.charAt(i);
            }
            for (int i = 0; i < textCaesarCode.length(); i++) {
                Character simbolCaesarCode = textCaesarCode.charAt(i);
                if (simbolCaesarCode >= 'А' && simbolCaesarCode <= 'Я' || simbolCaesarCode == 'Ё') {
                    textDecryptedCaesar.append(Character.toUpperCase(alphabetDecryptedCaesar[alphabet.
                    indexOf(Character.toLowerCase(simbolCaesarCode))]));
                } else if (simbolCaesarCode >= 'а' && simbolCaesarCode <= 'я' || simbolCaesarCode == 'ё') {
                    textDecryptedCaesar.append(alphabetDecryptedCaesar[alphabet.indexOf(simbolCaesarCode)]);
                } else {
                    textDecryptedCaesar.append(simbolCaesarCode);
                }
            }
            System.out.println(textDecryptedCaesar);
        }
    }

}
