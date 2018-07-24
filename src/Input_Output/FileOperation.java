package Input_Output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    public static void fileCopy(File in, File out) throws IOException{
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)){
            for (; (readByte = fis.read(buffer))>0;){
                fos.write(buffer,0,readByte);
            }
        } catch (IOException e){
            throw e;
        }
    }

    public static long calculateFolderSize(File folder){
        if (folder.isFile()){
            return folder.length();
        } else {
            long size = 0;
            File[] fileArray = folder.listFiles();
            for (File file : fileArray){
                size += calculateFolderSize(file);
            }
            return size;
        }
    }
}
