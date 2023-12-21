package Lesson8;

import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public void myHomework() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/Users/dianakyrychuk/IdeaProjects/dkyrychuk_qa_automation_school-/src/main/java/Lesson8/test_file_for_homework"));
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("An error occurred while reading from the file", e);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.myHomework();
    }
}

