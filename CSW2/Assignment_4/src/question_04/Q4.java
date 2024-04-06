package question_04;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.*;

public class Q4 {
    public static void main(String[] args) 
    {
        if (args.length == 0) 
        {
            System.out.println("Usage: java FileReadingProgram <file_path>");
            return;
        }

        String filePath = args[0];
        File file = new File(filePath);

        try {
            // Check if the file exists
            if (!file.exists()) {
                throw new FileNotFoundException("File not found: " + filePath);
            }

            // Check if the file can be read
            if (!file.canRead()) {
                throw new FileReadPermissionException("Cannot read file: " + filePath);
            }

            // Read the file contents (you can add your specific logic here)
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}
class FileReadPermissionException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	FileReadPermissionException(String s)
	{
		super(s);
	}

}
