package hrssc.matching.model;

import java.util.List;
import java.util.Vector;

public class Matrix {
    private List<Double> row;
    private List<Double> column;

    public List<Double> getRow() {
        return row;
    }

    public void setRow(List<Double> row) {
        this.row = row;
    }

    public List<Double> getColumn() {
        return column;
    }

    public void setColumn(List<Double> column) {
        this.column = column;
    }

    public Matrix(){
        row = new Vector<>();
        column = new Vector<>();
    }
    public Matrix(List<Double> row,List<Double> column){
        this.row = row;
        this.column = column;
    }
}
