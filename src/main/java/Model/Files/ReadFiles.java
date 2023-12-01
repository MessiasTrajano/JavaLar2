package Model.Files;

import Model.Files.FileList.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
    private BufferedReader br = null;
    private FileReader fr = null;
    private String[] info;
    private String archive;
    private List<MainFiles> files = new ArrayList<>();

    public ReadFiles(String selected, int line){
        selectedFile(selected);
        catchfile(line);
    }

    private void selectedFile(String selected) {
        addFiles();

        for(MainFiles sfile :files){
            if(selected.equals(sfile.name)){
               String file = sfile.getName();
               archive = sfile.getFile();
            }
        }

    }
    private void catchfile( int line){

        try {
            fr = new FileReader(archive);
            br = new BufferedReader(fr);
            String auxline;

            for(int currentLine = 0; currentLine <= line; currentLine++){
                auxline = br.readLine();
                if (currentLine == line) {
                    info = auxline.split(",");
                    System.out.println(auxline);
                    // Sai do loop após encontrar a linha desejada
                }

            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
    public String[] getInfo(){
        return info;
    }
    private void addFiles(){
        files.add(new File_10());
        files.add(new File_50());
        files.add(new File_100());
        files.add(new File_500());
        files.add(new File_1000());
        files.add(new File_1500());
        files.add(new File_2000());


    }

}
