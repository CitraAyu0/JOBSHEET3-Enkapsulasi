package jobsheet3;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKtp, String nama, int limitPinjaman) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if (nominal <= 0) {
            System.out.println("Jumlah angsuran harus lebih besar dari 0");
        } else if (nominal < (jumlahPinjaman * 0.1)) { 
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else if (nominal > jumlahPinjaman) {
            System.out.println("Jumlah angsuran melebihi limit pinjaman");
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}
