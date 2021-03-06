/*
 * This file is generated by jOOQ.
 */
package com.yg.gqlwfdl.dataaccess.db.tables;


import com.yg.gqlwfdl.dataaccess.db.Indexes;
import com.yg.gqlwfdl.dataaccess.db.Keys;
import com.yg.gqlwfdl.dataaccess.db.Public;
import com.yg.gqlwfdl.dataaccess.db.tables.records.VatRateRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VatRate extends TableImpl<VatRateRecord> {

    private static final long serialVersionUID = 76895452;

    /**
     * The reference instance of <code>public.vat_rate</code>
     */
    public static final VatRate VAT_RATE = new VatRate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VatRateRecord> getRecordType() {
        return VatRateRecord.class;
    }

    /**
     * The column <code>public.vat_rate.id</code>.
     */
    public final TableField<VatRateRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('vat_rate_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.vat_rate.description</code>.
     */
    public final TableField<VatRateRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.vat_rate.value</code>.
     */
    public final TableField<VatRateRecord, Double> VALUE = createField("value", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * Create a <code>public.vat_rate</code> table reference
     */
    public VatRate() {
        this(DSL.name("vat_rate"), null);
    }

    /**
     * Create an aliased <code>public.vat_rate</code> table reference
     */
    public VatRate(String alias) {
        this(DSL.name(alias), VAT_RATE);
    }

    /**
     * Create an aliased <code>public.vat_rate</code> table reference
     */
    public VatRate(Name alias) {
        this(alias, VAT_RATE);
    }

    private VatRate(Name alias, Table<VatRateRecord> aliased) {
        this(alias, aliased, null);
    }

    private VatRate(Name alias, Table<VatRateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> VatRate(Table<O> child, ForeignKey<O, VatRateRecord> key) {
        super(child, key, VAT_RATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.VAT_RATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VatRateRecord, Long> getIdentity() {
        return Keys.IDENTITY_VAT_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VatRateRecord> getPrimaryKey() {
        return Keys.VAT_RATE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VatRateRecord>> getKeys() {
        return Arrays.<UniqueKey<VatRateRecord>>asList(Keys.VAT_RATE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VatRate as(String alias) {
        return new VatRate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VatRate as(Name alias) {
        return new VatRate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VatRate rename(String name) {
        return new VatRate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VatRate rename(Name name) {
        return new VatRate(name, null);
    }
}
