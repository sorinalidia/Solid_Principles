import Bad.ComplexInvoice;
import Bad.Invoice;

public interface GoodInvoicePrinter_I {

    public void print(Invoice invoice);
    public void printComplexInvoice(ComplexInvoice complexInvoice);
}
