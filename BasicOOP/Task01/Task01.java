package by.htp.BasicOOP.Task01;

/*
 * Задача 1. 
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, 
 * дополнить, удалить.
 */

public class Task01 {

    public static void main(String[] args) {
	Directory dir1 = new Directory("dir1");
	Directory dir2 = new Directory("dir2");

	TextFile textFile = new TextFile("test", "some content");

	dir1.addDirectory(dir2);
	dir2.addFile(textFile);

	textFile.setName("changed file name");
	System.out.println(textFile.getContent());

	dir2.deleteFile(textFile);
    }
}
