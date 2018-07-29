import java.util.ArrayList;
import java.util.List;

public class Main {

    int umur = 20;

    void ubahUmur(){
        umur = 10;
    }

    void tampilkanUmur(){
        System.out.println("UMUR : "+umur);
    }

    public static void main(String[] args) {
        //array
        String[] data = new String[3];
        data[0] = "data 1";
//        data[3] = "data ke 4"; //akan error

        String[] data2 = {"a","b","c"};
        System.out.println("data index ke 0 : "+data2[0]);

        //Collection
        //List, Map
        List dataList = new ArrayList();
        dataList.add("data list 1");
        dataList.add("data list 1");
        dataList.add(0, "data 1");
        dataList.remove(1);
        dataList.add(1);

        List<String> stringList = new ArrayList();
        stringList.add("data string list");

        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "1111";
        mahasiswa1.nama = "budi";
        mahasiswa1.alamat = "jogja";
        mahasiswaList.add(mahasiswa1);

        mahasiswa1 = new Mahasiswa();
        mahasiswa1.nim = "2222";
        mahasiswa1.nama = "astuti";
        mahasiswaList.add(mahasiswa1);

        String dataTest = "Yogya";
        new Main().ubahString(dataTest);
        System.out.println(dataTest);

        new Main().ubahList(mahasiswaList);

        System.out.println("Mahasiswa Size : "+mahasiswaList.size());

        for (int i = 0; i < mahasiswaList.size(); i++) {
            System.out.println("Nama : "+mahasiswaList.get(i).nama);
        }

        List listMhs = new ArrayList();
        listMhs.add(mahasiswa1);
        listMhs.add(1);

        Mahasiswa mhs1 = (Mahasiswa) listMhs.get(0);
        System.out.println(">> Nama: "+mhs1.nama);

        Object mhs2 = listMhs.get(1);
        if(mhs2 instanceof Mahasiswa){
            Mahasiswa mahasiswa2 = (Mahasiswa) mhs2;//casting
        }

        Main main1 =  new Main();
        main1.ubahUmur();

        Main main2 =  new Main();
        main2.tampilkanUmur();

        Main.callMe();

        for(Mahasiswa mhs: mahasiswaList){
            System.out.println("NIM : "+mhs.nim);
        }

        if(mahasiswaList.get(0).nim.equals("1111")){
            System.out.println("True");
        }

        switch (mahasiswaList.get(0).nim){
            case "1111" : {
                System.out.println("true");
                break;
            }
            case "222" : break;
            default:
                System.out.println("default");
        }

        Object obj = "data";
        Object obj2 = 1;

        if(obj instanceof String){
            System.out.println("obj is String");
        }

    }

    static void callMe(){

    }

    void ubahList(List<Mahasiswa> mahasiswaList){
        mahasiswaList.get(0).nama = "Ubah";
    }

    void ubahString(String data){
        data = "ubah..";
        System.out.println();
    }
}
