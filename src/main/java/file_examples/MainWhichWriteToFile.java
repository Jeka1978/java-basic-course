package file_examples;

import lombok.SneakyThrows;
import model.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

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

        List<Object> list = List.of(new Employee(10), new Employee(20), new Person("Reut", 18));


        FileOutputStream fos = new FileOutputStream(file);


        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(list);


    }
}
