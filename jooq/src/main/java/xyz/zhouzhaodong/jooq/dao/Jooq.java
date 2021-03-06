/*
 * This file is generated by jOOQ.
 */
package xyz.zhouzhaodong.jooq.dao;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Jooq extends SchemaImpl {

    private static final long serialVersionUID = -923737812;

    /**
     * The reference instance of <code>jooq</code>
     */
    public static final Jooq JOOQ = new Jooq();

    /**
     * The table <code>jooq.jooq</code>.
     */
    public final xyz.zhouzhaodong.jooq.dao.tables.Jooq JOOQ_ = xyz.zhouzhaodong.jooq.dao.tables.Jooq.JOOQ_;

    /**
     * No further instances allowed
     */
    private Jooq() {
        super("jooq", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            xyz.zhouzhaodong.jooq.dao.tables.Jooq.JOOQ_);
    }
}
