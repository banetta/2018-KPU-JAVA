public class TimesTable {
    private int row, col;
    private int table[][];

    public TimesTable(int inN, int inm) {
        table = new int[inN][inm];
        row = inN;
        col = inm;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                table[i][j] = (i+1) * (j+1);
            }
        }
    }

    public void show() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }
    }
}
