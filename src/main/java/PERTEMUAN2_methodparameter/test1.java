package PERTEMUAN2_methodparameter;

public class test1 {
    public static void main(String[] args) {
        mahasiswa adam = new mahasiswa();
        mahasiswa aqil = new mahasiswa();
        mahasiswa wardah = new mahasiswa();
        
        adam.nama = "M. Adam";
        adam.nim = "1234";
        adam.umur = 20;
        
        aqil.nama = "M. Aqil";
        aqil.nim = "5678";
        aqil.umur = 19;
        
        wardah.nama = "Wardah Harahap";
        wardah.nim = "3456";
        wardah.umur = 19;
        
        adam.cetakBiodata();
        aqil.cetakBiodata();
        wardah.cetakBiodata();
        
        aqil.sapa("Zilfa");
        
        double nilaiAkhir = aqil.nilaiAngka(90, 85, 75, 85);
        String nilaiHuruf = aqil.nilaiHuruf(nilaiAkhir);
                
        System.out.println("Nilai akhir aqil: "+nilaiAkhir);
        System.out.println("Nilai huruf aqil: "+nilaiHuruf);
    }
}