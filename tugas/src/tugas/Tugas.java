/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */public class Tugas{

    private static List<mahasiswa> mahasiswas = new ArrayList<>();

    private static void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan nim   : ");
        String nim = s.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = s.nextLine();
        System.out.print("Masukan ipk   : ");
        float ipk = s.nextFloat();
        mahasiswa m = new mahasiswa(nim, nama, ipk);
        mahasiswas.add(m);
    }
    
private static void tampilData() {
        if (mahasiswas.isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("-------------------------");
            int counter = 1;
            for (mahasiswa mahasiswa : mahasiswas) {
                System.out.println("Data ke-" + counter);
                System.out.println("NIM : " + mahasiswa.getNim());
                System.out.println("Nama: " + mahasiswa.getNama());
                System.out.println("IPK : " + mahasiswa.getIpk());
                counter++;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<mahasiswa> save = new ArrayList<mahasiswa>();
        int pilih = 0;
        do {
            System.out.println("");
            System.out.println("Tugas tentang class-object");
            System.out.println("--------------------------");
            System.out.println("1. Input data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting Data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            Scanner s = new Scanner(System.in);
            pilih = s.nextInt();
            switch (pilih) {
                case 1:
                    inputData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                     System.out.println("=================================");
                        System.out.println("1. Sorting by Nama");
                        System.out.println("2.sorting by NIM");
                        System.out.println("3.Sorting by IPK");
                        System.out.println("4.kembali");
                        System.out.print("Pilihan Anda : ");
                        int pil = s.nextInt();
                        System.out.println("\n===================================\n");
                        
                        switch(pil){
                            case 1:
                                Collections.sort(mahasiswas, new Comparator<mahasiswa>()
                                {
                                @Override
                                   public int compare(mahasiswa m1, mahasiswa m2){
                                       return m1.getNama().compareTo(m2.getNama());
                                   }
                                }
                             );
                             tampilData();
                                break;
                            case 2:
                                Collections.sort(mahasiswas, new Comparator<mahasiswa>()
                                {
                                @Override
                                   public int compare(mahasiswa m1, mahasiswa m2){
                                       return m1.getNim().compareTo(m2.getNim());
                                   }
                                }
                             );
                             tampilData();
                                break;
                            case 3:
                                for (int i=0; i<mahasiswas.size(); i++){
                                    for (int j=0; j<mahasiswas.size(); j++){
                                        if(mahasiswas.get(j).getIpk()>mahasiswas.get(j+1).getIpk()){
                                            save.add(mahasiswas.get(j));
                                            mahasiswas.set(j,mahasiswas.get(j+1));
                                            mahasiswas.set(j+1,save.get(0));
                                            
                                        }
                                    }
                                }
                        }
            }
        } while (pilih != 4);
    }
    }


