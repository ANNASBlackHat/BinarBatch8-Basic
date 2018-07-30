public class Main implements DataListener {

    public static void main(String[] args) {
        new Main().processData();
    }

    void processData(){
        DataProcess dp = new DataProcess();
//        String result = dp.process("bla..bla..", new DataListener() {
//            @Override
//            public void onProcessFinish(String result) {
//                System.out.println("Result : "+result);
//            }
//        });

        dp.process("bla..bla..", this);

//        System.out.println(">>> result : "+result);
    }

    @Override
    public void onProcessFinish(String result) {
        System.out.println("Result : "+result);
    }

}
