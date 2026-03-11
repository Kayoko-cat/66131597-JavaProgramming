

public class invoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public invoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
}
