import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Buku> listBuku = new SinglyLinkedList<>();
        Scanner s = new Scanner(System.in);
        int pilihan;
        String yesOrNo;

        do {
            System.out.println("Pilihlah Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");

            System.out.print("Pilih operasi: ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judulBuku = s.next();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = s.next();
                    System.out.print("Masukkan Tahun Terbit: ");
                    String tahunTerbit = s.next();

                    System.out.println("Tambahkan data di awal list? (y/n)");
                    yesOrNo = s.next();

                    if (yesOrNo.equals("y")) {
                        listBuku.inputDiAwal(new Buku(judulBuku, penulis, tahunTerbit));
                    } else {
                        listBuku.inputDiAkhir(new Buku(judulBuku, penulis, tahunTerbit));
                    }
                    break;
                case 2:
                    System.out.println("Hapus data di awal list? (y/n)");
                    yesOrNo = s.next();

                    if (yesOrNo.equals("y")) {
                        listBuku.hapusDiAwal();
                        System.out.println("Data pegawai di awal list berhasil dihapus");
                    } else {
                        listBuku.hapusDiAkhir();
                        System.out.println("Data pegawai di akhir list berhasil dihapus");
                    }
                    break;
                case 3:
                    System.out.println("List pegawai adalah:");
                    listBuku.print();
                    break;
            }
        } while (pilihan != 4);
    }
}
//.