package br.coder.course.gof.app;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import br.coder.course.gof.creational.builder.MyStringBuilder;
import br.coder.course.gof.creational.builder.PixTransfer;
import br.coder.course.gof.creational.builder.PixTransferBuilder;
import br.coder.course.gof.creational.factory.JDBCConnection;
import br.coder.course.gof.creational.factory.JDBCConnectionDriver;
import br.coder.course.gof.creational.factory.JDBCConnectionFactory;
import br.coder.course.gof.creational.prototype.Toy;

public class App {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		/* PixTransfer pix = new PixTransferBuilder().
				payerName("Rafael").
				documentNumber("06809075305").
				receiverName("Ana Luiza").
				pixKey(new UUID(Integer.MIN_VALUE,Integer.MAX_VALUE).toString()).
				bank("450").bankBranch("0001").
				bankAccount("679923891").
				bankAccountDigit("3").
				principalValue(650.0).build();
		
		System.out.println(pix.getPayerName());
		System.out.println(pix.getDocumentNumber());
		System.out.println(pix.getReceiverName());
		System.out.println(pix.getPixKey());
		System.out.println(pix.getBank());
		System.out.println(pix.getBankBranch());
		System.out.println(pix.getBankAccount());
		System.out.println(pix.getBankAccountDigit());
		System.out.println(pix.getPrincipalValue());
		
		pix.setPrincipalValue(1400.0);
		System.out.println("Novo valor de transferencia: "+ pix.getPrincipalValue());
		*/
		
		//JDBCConnection connection = JDBCConnectionFactory.createConnection(JDBCConnectionDriver.PostgresSQL);
		//System.out.println(connection.getConnecion());
		//String a = "a";
		//StringBuilder builder = new StringBuilder("a");
		
		/*MyStringBuilder builder = new MyStringBuilder();	
		System.out.println(Calendar.getInstance().getTime());
		for(int i = 0; i < 1000; i++) {
			builder.append("a");
		}	
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(builder.build().toString()); */
		
		Toy<String> t1,t2,t3 = null;
		
		t1 = new Toy<String>();
		t1.setDescription("Brinquedo 1");
		
		t2 =  (Toy<String>) t1.clone();
		t2.setDescription("Brinquedo 2");
		t3 = (Toy<String>) t2.clone();
		t3.setDescription("Brinquedo 3");
		
		System.out.println(t1.getDescription());
		System.out.println(t2.getDescription());
		System.out.println(t3.getDescription());
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
	}

}
