package Lab06;

import java.io.*;
import java.util.Vector;

public class FileFilter implements FilenameFilter {
    private Vector<String> extension;
    private Vector<String> name;

    public FileFilter(){
        this(10);
    }

    public FileFilter(int size) {
        extension = new Vector<String>(size);
        name = new Vector<String>(size);
    }

    public void addExtension(String extension) {
        this.extension.addElement(extension);
    }

    public void addName(String name) {
        this.name.addElement(name);
    }

    public boolean accept(File dir, String extensie) {
        int n1 = extension.size();
        int n2 = name.size();
        String test = "";

        return extension.contains(test.endsWith("." + extensie)) &&
                name.contains(dir);
    }
}
