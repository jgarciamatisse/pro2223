package _02ejemplos;

import java.io.File;
import java.io.FileFilter;

public class FiltroFicheros implements FileFilter {

	@Override
	public boolean accept(File f) {
		if(f.isFile()) return true;
		else return false;
	}

}
