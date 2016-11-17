/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileRW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author googlesky
 */
public class FileRW {

    private String filename;

    public FileRW() {
    }

    public FileRW(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String[] toArrays() throws IOException {
        try {
            FileReader fr = new FileReader(this.filename);
            BufferedReader FRD = new BufferedReader(fr);
            String RAWLine;
            int i = 0;
            int numL = this.numLines();
            String[] DataArrays = new String[numL];
            for (int j = 0; j < numL; j++) {
                RAWLine = FRD.readLine();
//                System.out.printf("%s.\n",RAWLine);
                DataArrays[j] = RAWLine;
            }
            return DataArrays;
        } catch (FileNotFoundException ex) {
            this.fileEmpty();
            Logger.getLogger(FileRW.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileRW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public int numLines() {
        try {
            FileReader fr = new FileReader(this.filename);
            BufferedReader FRD = new BufferedReader(fr);
            String RAWLine;
            int n = 0;

            while ((RAWLine = FRD.readLine()) != null) {
                n += 1;
            }
//            System.out.printf("Có %d lines.\n",n);
            return n;
        } catch (IOException ex) {
            Logger.getLogger(FileRW.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public void writeLine(String text) throws IOException{
        try {
            FileWriter FW = new FileWriter(this.filename);
            try (PrintWriter PW = new PrintWriter(FW)) {
                PW.write(text);
            }
        } 
        catch (FileNotFoundException ex) {
            this.fileEmpty();
        }
        catch (IOException ex) {
            Logger.getLogger(FileRW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fileEmpty() throws IOException{
        File file = new File(this.filename);
        file.createNewFile();
    }
}
