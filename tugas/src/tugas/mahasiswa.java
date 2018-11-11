/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author user
 */
public class mahasiswa {
    private String nim;
    private String nama;
    private float ipk;

    public mahasiswa(String nim, String nama, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + '}';
    }
    
}
