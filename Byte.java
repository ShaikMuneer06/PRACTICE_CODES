package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Byte {

	public static void main(String[] args) throws IOException {
		FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
  
        try {
            sourceStream
                = new FileInputStream("C:\\Users\\shaik_muneer\\OneDrive - HCL Technologies Ltd\\Desktop\\out.txt");
            targetStream
                = new FileOutputStream("C:\\Users\\shaik_muneer\\OneDrive - HCL Technologies Ltd\\Desktop\\out.txt");
  
            // Reading source file and writing
            // content to target file byte by byte
            int temp;
            while ((
                       temp = sourceStream.read())
                   != -1)
                targetStream.write((byte)temp);
        }
        finally {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }

	}

}
