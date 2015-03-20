package COD_main;

import java.util.ArrayList;

/**
 *
 * @author Petru Botnar;
 */
public class Stock {

    private ArrayList<Item> item_list;

    public Stock() {
        this.item_list = new ArrayList();
    }

    public void addItem(Item i) {
        this.item_list.add(i);
    }

    public void removeItem(Item i) {
        if (!this.item_list.isEmpty()) {
            for (int j = 0; j < this.item_list.size(); j++) {
                if (this.item_list.get(j) == i) {
                    this.item_list.remove(j);
                }
            }
        }
    }
    
    public void updateItem(Item i) {
        if (!this.item_list.isEmpty()) {
            for (int j = 0; j < this.item_list.size(); j++) {
                if (this.item_list.get(j) == i) {
                    //code to update the item
                }
            }
        }
    }
}
