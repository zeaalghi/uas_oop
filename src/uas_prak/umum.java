/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_prak;

/**
 *
 * @author ASUS
 */
public abstract class umum {
   private String nama ;
  private   String alamat ;
    private String no_ktp ;
   private String id_pembayaran;  
   private String hp;
    private String tgl_lahir;
   private String id;
   private String namad;
   private String hrg;
   private String jdwl;
   private String spsls;
   private String jam;    

    public String getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(String id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNo_ktp() {
        return no_ktp;
    }

    public void setNo_ktp(String no_ktp) {
        this.no_ktp = no_ktp;
    }


    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamad() {
        return namad;
    }

    public void setNamad(String namad) {
        this.namad = namad;
    }

    public String getHrg() {
        return hrg;
    }

    public void setHrg(String hrg) {
        this.hrg = hrg;
    }

    public String getJdwl() {
        return jdwl;
    }

    public void setJdwl(String jdwl) {
        this.jdwl = jdwl;
    }

    public String getSpsls() {
        return spsls;
    }

    public void setSpsls(String spsls) {
        this.spsls = spsls;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }
   
}
