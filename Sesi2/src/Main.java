public class Main {

    //psvm
    public static void main(String[] args) {
        //primitive data type, reference data type
        //int, long, string, float, double, byte, short
        int umur = 19; // Maks : 2M
        long uang= 10000;
        String nama = "budi";
        String warnaBulu = "";
        double cr = 2.3; // 15 digit d blkng koma
        float currency = 2.5f; //6 digit d blkng koma

        Integer umur2 = 12;
        Double cr2 = 2.3;

        Tiger tgr = new Tiger("hitam", 4);
        tgr.lari();

        String wrnaBulu = tgr.getWarnaBulu();
        System.out.println(wrnaBulu);

        Eigel eigel = new Eigel();
        eigel.terbang();
        eigel.makan();

        //today we cover :
        //Class, object, constructor, overload, override, keyword this, keyword super,
        //Inheritance
    }
}
