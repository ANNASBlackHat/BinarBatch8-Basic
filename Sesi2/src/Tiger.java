public class Tiger extends Animal{

    String warnaBulu;

    //constructor
    Tiger(String warnaBulu){
        System.out.println("ini konstrurtor dr kelas Tiger");
        this.warnaBulu = warnaBulu;
        super.warnaBulu = warnaBulu;
    }

    //overload
    Tiger(String warnaBulu, int jmlKaki){
        this(warnaBulu);
        System.out.println("overload...");
    }

    //lari, makan, tidur
    void lari(){
        //sout
        System.out.println("lari...");
    }

    String getWarnaBulu(){
        return warnaBulu;
    }
}
