package SQLQueryBuilder;

public class SQLQueryBuilderMain {

	public static void main(String[] args) {
		SQLQueryBuilder sql = new SQLQueryBuilder();
		String queryF = sql.select("idade", "nome", "peso").from("alunos").where("idade >= 18").ordereBy("idade").build();
		System.out.print(queryF);
	}

}
