/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.ibase.fbjavaex.exampledb.tables.Customer;
import ru.ibase.fbjavaex.exampledb.tables.Invoice;
import ru.ibase.fbjavaex.exampledb.tables.InvoiceLine;
import ru.ibase.fbjavaex.exampledb.tables.Product;
import ru.ibase.fbjavaex.exampledb.tables.Webrole;
import ru.ibase.fbjavaex.exampledb.tables.Webuser;
import ru.ibase.fbjavaex.exampledb.tables.Webuserinrole;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -149960077;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>CUSTOMER</code>.
     */
    public final Customer CUSTOMER = ru.ibase.fbjavaex.exampledb.tables.Customer.CUSTOMER;

    /**
     * The table <code>INVOICE</code>.
     */
    public final Invoice INVOICE = ru.ibase.fbjavaex.exampledb.tables.Invoice.INVOICE;

    /**
     * The table <code>INVOICE_LINE</code>.
     */
    public final InvoiceLine INVOICE_LINE = ru.ibase.fbjavaex.exampledb.tables.InvoiceLine.INVOICE_LINE;

    /**
     * The table <code>PRODUCT</code>.
     */
    public final Product PRODUCT = ru.ibase.fbjavaex.exampledb.tables.Product.PRODUCT;

    /**
     * The table <code>WEBROLE</code>.
     */
    public final Webrole WEBROLE = ru.ibase.fbjavaex.exampledb.tables.Webrole.WEBROLE;

    /**
     * The table <code>WEBUSER</code>.
     */
    public final Webuser WEBUSER = ru.ibase.fbjavaex.exampledb.tables.Webuser.WEBUSER;

    /**
     * The table <code>WEBUSERINROLE</code>.
     */
    public final Webuserinrole WEBUSERINROLE = ru.ibase.fbjavaex.exampledb.tables.Webuserinrole.WEBUSERINROLE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.GEN_CUSTOMER_ID,
            Sequences.GEN_INVOICE_ID,
            Sequences.GEN_INVOICE_LINE_ID,
            Sequences.GEN_PRODUCT_ID,
            Sequences.SEQ_WEBROLE,
            Sequences.SEQ_WEBUSER,
            Sequences.SEQ_WEBUSERINROLE,
            Sequences.SQL$DEFAULT);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Customer.CUSTOMER,
            Invoice.INVOICE,
            InvoiceLine.INVOICE_LINE,
            Product.PRODUCT,
            Webrole.WEBROLE,
            Webuser.WEBUSER,
            Webuserinrole.WEBUSERINROLE);
    }
}
