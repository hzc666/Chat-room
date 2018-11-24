package IO_test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class TesT {

	public static void main(String[] args) {
  File f1 = new File("C:\\123.txt");
  File dir1 = new File("C:/abc");
  
//  System.out.println(f1.exists());
//  System.out.println(dir1.exists());
   if(!f1.exists()) {
	   try {
	   f1.createNewFile();//获取一个文件
	   }catch(IOException e) {
   e.printStackTrace();
	}
	}
if(!dir1.exists()) {
	dir1.mkdirs();
}
for(File f: dir1.listFiles(new FilenameFilter() {
	
	public boolean accept(File dir,String name) {
		File tf =new File(dir,name);
		if(tf.isDirectory()) {
			return true;
		}
		if(name.endsWith(".txt")) {
			return true;
		}
		return false;
	}
})) {
	if(f.isFile()) {
  System.out.println(f.getName()+"\t"+f.length());
} else if(f.isDirectory()) {
	System.out.println(f.getName());
}

	}

	}}
	
	
