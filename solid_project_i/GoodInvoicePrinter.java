import Bad.ComplexInvoice;
import Bad.Invoice;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        System.out.println("Printing complex invoice " + complexInvoice);
    }
}
