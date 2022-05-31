package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder();

        File dirSrc = new File("c:\\Games\\src");
        File dirRes = new File("c:\\Games\\res");
        File dirTemp = new File("c:\\Games\\temp");
        File dirSavegames = new File("c:\\Games\\savegames");

        File dirMain = new File("c:\\Games\\src\\main");
        File dirTest = new File("c:\\Games\\src\\test");

        File dirDrawables = new File("c:\\Games\\res\\drawables");
        File dirVectors = new File("c:\\Games\\res\\vectors");
        File dirIcons = new File("c:\\Games\\res\\icons");

        File fileTemp = new File(dirTemp, "temp.txt");
        File fileMain = new File(dirMain, "Main.java");
        File fileUtils = new File(dirMain, "Utils.java");

        if (dirSrc.mkdir())
            strBuilder.append("Каталог ").append(dirSrc).append(" создан").append('\n');

        if (dirRes.mkdir())
            strBuilder.append("Каталог ").append(dirRes).append(" создан").append('\n');

        if (dirTemp.mkdir())
            strBuilder.append("Каталог ").append(dirTemp).append(" создан").append('\n');

        if (dirSavegames.mkdir())
            strBuilder.append("Каталог ").append(dirSavegames).append(" создан").append('\n');

        if (dirMain.mkdir())
            strBuilder.append("Каталог ").append(dirMain).append(" создан").append('\n');

        if (dirTest.mkdir())
            strBuilder.append("Каталог ").append(dirTest).append(" создан").append('\n');

        try {
            if (fileMain.createNewFile())
                strBuilder.append("Файл ").append(fileMain).append(" создан").append('\n');
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage()).append('\n');
        }

        try {
            if (fileUtils.createNewFile())
                strBuilder.append("Файл ").append(fileUtils).append(" создан").append('\n');
        } catch (IOException ex) {
            strBuilder.append(ex.getMessage()).append('\n');
        }

        if (dirDrawables.mkdir())
            strBuilder.append("Каталог ").append(dirDrawables).append(" создан").append('\n');

        if (dirVectors.mkdir())
            strBuilder.append("Каталог ").append(dirVectors).append(" создан").append('\n');

        if (dirIcons.mkdir())
            strBuilder.append("Каталог ").append(dirIcons).append(" создан").append('\n');

        try {
            fileTemp.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter writer = new FileWriter(fileTemp, true)){
            writer.append(strBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
