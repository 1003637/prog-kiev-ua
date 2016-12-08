package com.java.oop.monitor;

/**
 1.Добавить в проект «монитор» функцию вывода даты создания файла на экран (см. java.io.File).
 2.Добавить в проект ф-ю мониторинга более одного файла.
 3.Написать код для мониторинга каталога. Выводить на экран
 предупреждение если в каталог добавляется текстовый
 файл (*.txt).
 */
public class Main {
	public static void main(String[] args) {
		String[] file = {"C:\\Users\\user\\Desktop\\1.txt",
				"C:\\Users\\user\\Desktop\\2.txt"};
		String[] dir = {"C:\\Users\\user\\Desktop\\1",
				"C:\\Users\\user\\Desktop\\2"};
		Monitor[] list = {new MonitorFile(file, new FileEvent()), new MonitorDir(dir, new DirEvent())};
		for(Monitor monitor: list){
			monitor.start();
		}

	}
}