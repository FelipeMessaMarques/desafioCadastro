package main.java.model.entities;

import javax.swing.filechooser.FileSystemView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static final String PATH = FileSystemView.getFileSystemView().getDefaultDirectory().getAbsolutePath() + "/Documents/desafioCadastro/src/formulario/formulario.txt";

    public static List<String> readQuestion() {
        try (BufferedReader br = new BufferedReader(new FileReader(PATH))) {

            List<String> question = new ArrayList<>();
            String file;

            while ((file = br.readLine()) != null) {
                question.add(file);
            }

            return question;

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
