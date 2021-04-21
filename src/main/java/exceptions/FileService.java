package exceptions;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class FileService implements Supplier<File> {


    @Override
    @SneakyThrows
    public File get() {
        File file = new File("c:\\tmp\\");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        return file;
    }
}



