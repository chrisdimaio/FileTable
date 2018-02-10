import java.util.Vector;

public class FileTable
{
	Vector tableVector = null;
	private static final int ATTRIBUTE_USED 		= 0;
	private static final int ATTRIBUTE_FILENAME 	= 1;
	private static final int ATTRIBUTE_PATH 		= 2;
	private static final int ATTRIBUTE_START 		= 3;
	private static final int ATTRIBUTE_LENGTH 		= 4;
	private static final int ATTRIBUTE_CREATION_DATE = 5;
	private static final int ATTRIBUTE_LAST_MODIFIED = 6;
		
	public static void main(String args[])
	{
		FileTable table = new FileTable();
		
		for(int i = 0; i < 2000000; i++)
		{
			table.addRow(true, "test" + i + ".txt", "c:\\temp", i * 100, 100, System.currentTimeMillis(), System.currentTimeMillis());
		}
		
		table.printTable();
	}
	
	FileTable()
	{
		tableVector = new Vector();
	}
	
	public void addRow(boolean used, String filename, String path, long start, long length, long creationDate, long lastModified)
	{
		Vector rowVector = new Vector();
		
		// file used?
		rowVector.add(used);
		// file name
		rowVector.add(filename);
		// file path
		rowVector.add(path);
		// file start location
		rowVector.add(start);
		// file length
		rowVector.add(length);
		// file creation date
		rowVector.add(creationDate);
		// file last modified
		rowVector.add(lastModified);

		tableVector.add(rowVector);
	}
	
	public void printTable()
	{
		for(int i = 0; i < tableVector.size(); i++)
		{
			System.out.println("-");
			System.out.println("Used?: " + (Boolean) ((Vector) tableVector.get(i)).get(ATTRIBUTE_USED));
			System.out.println("Filename: " + (String) ((Vector) tableVector.get(i)).get(ATTRIBUTE_FILENAME));
			System.out.println("Path: " + (String) ((Vector) tableVector.get(i)).get(ATTRIBUTE_PATH));
			System.out.println("Location: " + (Long) ((Vector) tableVector.get(i)).get(ATTRIBUTE_START));
			System.out.println("Length: " + (Long) ((Vector) tableVector.get(i)).get(ATTRIBUTE_LENGTH));
			System.out.println("Creation Date: " + (Long) ((Vector) tableVector.get(i)).get(ATTRIBUTE_CREATION_DATE));
			System.out.println("Last Modified: " + (Long) ((Vector) tableVector.get(i)).get(ATTRIBUTE_LAST_MODIFIED));
		}
	}
}