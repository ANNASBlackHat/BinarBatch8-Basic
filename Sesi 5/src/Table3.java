public class Table3 extends TableCreator {

    public Table3(){
        draw();
    }

    @Override
    protected TableProperty getTableProperty(int col, int row) {
        if(row == 0){
            return new TableProperty("transparan", 14, "bold", "Red");
        }else{
          return new TableProperty("transparan", 12, "regular", "Black");
        }
    }

    @Override
    protected int getRowCount() {
        return 4;
    }

    @Override
    int getColumnCount() {
        return 4;
    }

}
