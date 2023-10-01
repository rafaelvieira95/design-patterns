package br.coder.course.gof.creational.factory;

public class PostgresConnection extends JDBCConnection{

	protected PostgresConnection() {}
	@Override
	public String getConnecion() {
		
		return "Retornando uma conexao do PostgresSQL";
	}

}
