package br.coder.course.gof.creational.factory;

public class MySqlConnection extends JDBCConnection {

	protected MySqlConnection() {}
	@Override
	public String getConnecion() {
		return "Retornando uma conexao do MySql";
	}

}
