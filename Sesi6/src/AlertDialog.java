public class AlertDialog {
    Builder builder;

    private AlertDialog(Builder builder){
        this.builder = builder;
    }

    public void show(){
        System.out.println("Title : "+builder.title);
    }

    static class Builder {
        String title;
        String message;

        public Builder(String x){

        }

        public Builder setTitle(String title){
            this.title = title;
            return this;
        }

        public Builder setMessage(String msg){
            message = msg;
            return this;
        }

        public AlertDialog create(){
            return new AlertDialog(this);
        }
    }
}
