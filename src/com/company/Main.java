package com.company;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.io.*;
import java.awt.Container;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main {

/*
    Font romanfont;
    JPanel pergaminpanel;
    JTextArea textArea;
    Container con;
    JFrame gra;


    String text;
    int i = 0;



    Font defaultfont = new Font("Times New Roman", Font.PLAIN, 30);
    public void wypisznapergaminie(String s){
        text = s;
        timer.start();
    }
    public void wypisznapergaminie2(String s){
        textArea.append(s);
    }
*/

    public static void Zapis(int tura, int[] juz, int fin, int oby, int leg, int rel, int[] que) throws IOException {
        FileWriter za = new FileWriter("src/com/company/Pliki/Zapis_gry_1");
        PrintWriter out = new PrintWriter(za);
        out.println(tura);
        for(int i = 0; i < 20; i++){
            out.println(juz[i]);
        }
        out.println(fin);
        out.println(oby);
        out.println(leg);
        out.println(rel);
        for(int i = 0; i < 50; i++){
            out.println(que[i]);
        }
        out.close();
    }

    public static void Odczyt(Decyzja W) throws FileNotFoundException {
        File plik = new File("src/com/company/Pliki/Zapis_gry_1");
        Scanner in = new Scanner(plik);
        W.setTura(in.nextInt());
        in.nextLine();
        for(int i = 0; i < 20; i++){
            W.setJuzjest(in.nextInt(), i);
        }
        int s1, s2, s3, s4;
        s1 = in.nextInt();
        s2 = in.nextInt();
        s3 = in.nextInt();
        s4 = in.nextInt();
        W.setStats(s1, s2, s3,s4);
    }
    public static void wyjscie(JFrame J){
        J.setVisible(false);
        System.exit(0);
    }

    public static void main(String[] args) throws IOException, FontFormatException, InterruptedException, LineUnavailableException, UnsupportedAudioFileException {

        new Game();



    }
        //new Main();
}
