﻿package by.htp.BasicOOP.Task01;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;
    private List<Directory> directories;

    public Directory(String name) {
	this.name = name;
	files = new ArrayList<File>();
	directories = new ArrayList<Directory>();
    }

    public void addFile(File file) {
	files.add(file);
    }

    public void deleteFile(File file) {
	files.remove(file);
    }

    public void addDirectory(Directory directory) {
	directories.add(directory);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public List<File> getFiles() {
	return files;
    }

    public void setFiles(List<File> files) {
	this.files = files;
    }

    public List<Directory> getDirectories() {
	return directories;
    }

    public void setDirectories(List<Directory> directories) {
	this.directories = directories;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((files == null) ? 0 : files.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((directories == null) ? 0 : directories.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Directory other = (Directory) obj;
	if (files == null) {
	    if (other.files != null)
		return false;
	} else if (!files.equals(other.files))
	    return false;
	if (name == null) {
	    if (other.name != null)
		return false;
	} else if (!name.equals(other.name))
	    return false;
	if (directories == null) {
	    if (other.directories != null)
		return false;
	} else if (!directories.equals(other.directories))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Directory [name=" + name + ", files=" + files + ", directories=" + directories + "]";
    }
}
