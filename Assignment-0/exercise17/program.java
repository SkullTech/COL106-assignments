import java.util.Vector;

public class program
{
	public String[] test(String fileNames[])
	{
		/*
		Exercise 17: Java files- You have been given the list of the names
		of the files in a directory.
		You have to select Java files from them.
		A file is a Java file if it’s name ends with ".java".
		For e.g. "File-Names.java" is a Java file, "FileNames.java.pdf" is not.
		If the input is {"can.java","nca.doc","and.java","dan.txt","can.java","andjava.pdf"} 
		the expected output is {"can.java","and.java","can.java"}
		*/

		Vector<String> javaFilesVector = new Vector<String>();
		for (int i = 0; i < fileNames.length; i++) {
			String fileName = fileNames[i];
			int len = fileName.length();

			if (fileName.substring(len-4).equals("java")) javaFilesVector.add(fileName);
		}

		String javaFiles[] = javaFilesVector.toArray(new String[javaFilesVector.size()]);
		return javaFiles;
	}
}
