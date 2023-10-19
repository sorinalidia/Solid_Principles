public class HtmlInvoicePrinter implements InvoicePrinter {
    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing "+ invoice.toString());
    }
}

