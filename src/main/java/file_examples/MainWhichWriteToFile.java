package file_examples;

import lombok.SneakyThrows;
import model.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */
public class MainWhichWriteToFile {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\data.obj");
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();

        Person daniel = new Person("Daniel", 28);

        FileOutputStream fos = new FileOutputStream(file);


        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(daniel);


    }
}
