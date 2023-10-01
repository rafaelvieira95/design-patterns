package br.coder.course.gof.creational.factory;

public class JDBCConnectionFactory {

	public static JDBCConnection createConnection(JDBCConnectionDriver type) {
		
		switch(type) {
		   case MySql:
			   return new MySqlConnection();
			   
		   case PostgresSQL:
			   return new PostgresConnection();
		}
		return null;
	}
}
