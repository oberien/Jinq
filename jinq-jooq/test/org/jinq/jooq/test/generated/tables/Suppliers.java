/**
 * This class is generated by jOOQ
 */
package org.jinq.jooq.test.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Suppliers extends org.jooq.impl.TableImpl<org.jinq.jooq.test.generated.tables.records.SuppliersRecord> {

	private static final long serialVersionUID = -232891754;

	/**
	 * The singleton instance of <code>APP.SUPPLIERS</code>
	 */
	public static final org.jinq.jooq.test.generated.tables.Suppliers SUPPLIERS = new org.jinq.jooq.test.generated.tables.Suppliers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jinq.jooq.test.generated.tables.records.SuppliersRecord> getRecordType() {
		return org.jinq.jooq.test.generated.tables.records.SuppliersRecord.class;
	}

	/**
	 * The column <code>APP.SUPPLIERS.SUPPLIERID</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.SuppliersRecord, java.lang.Integer> SUPPLIERID = createField("SUPPLIERID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>APP.SUPPLIERS.NAME</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.SuppliersRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>APP.SUPPLIERS.COUNTRY</code>.
	 */
	public final org.jooq.TableField<org.jinq.jooq.test.generated.tables.records.SuppliersRecord, java.lang.String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * Create a <code>APP.SUPPLIERS</code> table reference
	 */
	public Suppliers() {
		this("SUPPLIERS", null);
	}

	/**
	 * Create an aliased <code>APP.SUPPLIERS</code> table reference
	 */
	public Suppliers(java.lang.String alias) {
		this(alias, org.jinq.jooq.test.generated.tables.Suppliers.SUPPLIERS);
	}

	private Suppliers(java.lang.String alias, org.jooq.Table<org.jinq.jooq.test.generated.tables.records.SuppliersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Suppliers(java.lang.String alias, org.jooq.Table<org.jinq.jooq.test.generated.tables.records.SuppliersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jinq.jooq.test.generated.App.APP, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.SuppliersRecord> getPrimaryKey() {
		return org.jinq.jooq.test.generated.Keys.SQL140601153102960;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.SuppliersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jinq.jooq.test.generated.tables.records.SuppliersRecord>>asList(org.jinq.jooq.test.generated.Keys.SQL140601153102960);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jinq.jooq.test.generated.tables.Suppliers as(java.lang.String alias) {
		return new org.jinq.jooq.test.generated.tables.Suppliers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jinq.jooq.test.generated.tables.Suppliers rename(java.lang.String name) {
		return new org.jinq.jooq.test.generated.tables.Suppliers(name, null);
	}
}