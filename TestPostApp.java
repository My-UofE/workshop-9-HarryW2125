import java.io.*;
public class TestPostApp{
    public static void main(String[] args) {
        Post post1 = new Post("Alex Adam", "Help with JavaE", "Hi, could anyone help me I need to learn how to code in java!");
        System.out.println(post1.toString());
        try {
        post1.saveAsTextFile("file");
        } catch( IOException ex ) {
        System.out.println("File not saved.");
        ex.printStackTrace();
}
    }
}