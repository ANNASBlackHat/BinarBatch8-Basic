public abstract class TableCreator {

    protected void draw(){
        int colomnCount = getColumnCount();
        System.out.println("Jml Kolom : "+colomnCount);

        int rowCount = getRowCount();
        System.out.println("Jml Baris : "+rowCount);

        //buat file
        createFile();

        //buat sheet
        createSheet();

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colomnCount; j++) {
                drawPerColumn(j, i);
            }
        }
    }

    private void drawPerColumn(int col, int row) {
        TableProperty tp = getTableProperty(col, row);
        String msg = String.format("Draw at col : %d - row : %d. " +
                "1. Text Color :%s ", col, row, tp.getTextColor());
        System.out.println(msg);
    }

    protected abstract TableProperty getTableProperty(int col, int row);
    protected abstract int getRowCount();
    abstract int getColumnCount();

    private void createSheet() {
        System.out.println("Create sheet....");
    }

    private void createFile() {
        System.out.println("Create file...");
    }
}
