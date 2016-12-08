package com.java.oop.monitor;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.Files;

public class MonitorFile implements Monitor{
	String[] file;
	IFileEvent event;
	
	public MonitorFile(String[] file, IFileEvent event) {
		this.file = file;
		this.event = event;
	}
	
	public void start() {
		for (int i = 0; i < file.length; i++) {
		 while (true) {
				File f = new File(file[i]);
				Path path = Paths.get(f.getPath());
				if (f.exists() && f.isFile()) {
					if (event != null)
						event.onFileAdded(file[i]);
					try {
						BasicFileAttributes attrs = Files.readAttributes(path, BasicFileAttributes.class);
						System.out.println("Creation time: " + attrs.creationTime());
					} catch (IOException e) {
						System.out.println("oops");
					}
					break;
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

				System.out.println("Waiting...");
			}
		}
	}
}
