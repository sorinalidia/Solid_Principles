public class GoodPrintingService {
    InvoicePrinter invoicePrinter;
    public GoodPrintingService(InvoicePrinter invoicePrinter){
        this.invoicePrinter=invoicePrinter;
    }


    public void print(Invoice invoice) {
        System.out.println("Printing "+ invoice.toString());
    }
}
