package Bai20_P3_JTreeAndTreeModel;

import java.io.*;


public class FileAndDirectoryOperations {
	public FileAndDirectoryOperations() {
		
	}
	
	public File[] getDirectoryContent(String folder) {
		File directory = new File(folder);
		if(directory.isFile())
			return null;
		File[] results = directory.listFiles();
		return results;
	}
	
	public String displayContent(File[] content) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < content.length; i++) {
			sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public String readTexFileString(String fileName) {
		StringBuilder content = new StringBuilder();
		try {
			// Mo file
			FileReader fr = new FileReader(fileName);
			//Dung bo dem
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				content.append(line);
				content.append("\n");
			}
			// Dong file
			br.close();
			fr.close();
		}
		catch(FileNotFoundException ex) {
			return "Khong tim thay file" + fileName;
		}
		catch(IOException ex) {
			return "Khong the doc file" + fileName;
		}
		
		return content.toString();
	}
	
	public boolean writeTextFile(String fileName, String content) {
		boolean flag = true;
		
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			//
			bw.flush();
			bw.close();
			fw.close();
		}
		catch(IOException ex) {
			return false;
		}
		
		return flag;
	}
	
	
	
	
}




