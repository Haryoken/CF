package hrssc.matching.cf;

import javafx.scene.transform.MatrixType;
import hrssc.matching.model.Item;

import java.util.List;

public interface Similar {
    public MatrixType pearsonCorrelation(List<Item> itemList, String itemA, String itemB);
    public MatrixType pearsonCorrelation(List<Item> itemList, Item itemA, Item itemB);
    public double pearsonCorrelation(Item itemA, Item itemB);
}
