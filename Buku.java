public class Buku {
    String judulBuku;
    String penulis;
    String tahunTerbit;
    
    public Buku(String judulBuku, String penulis, String tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Buku {judulBuku=" + judulBuku + ", penulis=" + penulis + ", tahunTerbit=" + tahunTerbit + "}";
    }
}