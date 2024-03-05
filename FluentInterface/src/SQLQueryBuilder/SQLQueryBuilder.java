package SQLQueryBuilder;

public class SQLQueryBuilder {
    private StringBuilder query;

    public SQLQueryBuilder() {
        this.query = new StringBuilder();
    }
    public SQLQueryBuilder select(String... columns) {
    	query.append("SELECT ");
        for (int i = 0; i < columns.length; i++) {
            query.append(columns[i]);
            if (i < columns.length - 1) {
                query.append(", ");
            }
        }
		return this;
    }
    public SQLQueryBuilder from(String table) {
    	query.append(" FROM ").append(table);
		return this;
    }
    public SQLQueryBuilder where(String condicao) {
    	query.append(" WHERE ").append(condicao);
		return this;
    }
    public SQLQueryBuilder ordereBy(String coluna) {
    	query.append(" ORDER BY ").append(coluna);
		return this;
    }
    public String build() {
    	query.append(";");
        return query.toString();
    }
}
