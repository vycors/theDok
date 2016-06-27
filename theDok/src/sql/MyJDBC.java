package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 	�տ��� 3�� �۾��� �غ��Ҵµ� ���� �۾��� ������ �ݺ��ȴ�.
 * 	���۾��� ������� ������ Ŭ������ ���� ����� ������ �Ѵ�.
 */
public class MyJDBC {
	//	�������� �� Ŭ������ new ��Ű�� ���� ����̹��ε� �۾��� �ϵ���
	//	�ϰ�ʹ�.
	public MyJDBC() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			System.out.println("����̹� �ε� ���� : " + e);
		} // end try catch
	} // end Constructor

	// ������ ��� ���ִ� �Լ��� �ϳ� ���� ����ϰ��� �Ѵ�.
	public Connection getCON() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@zzux.tk:1521:orcl", "scott", "tiger");
		} catch (Exception e) {
			System.out.println("���� ���� : " + e);
		} // end try catch
		return con;
	} // end Method

	// ��� Statement�� ������ִ� �Լ��� ��������.
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			System.out.println("������Ʈ��Ʈ ���� ���� : " + e);
		} // end try catch
		return stmt;
	} // end Method
	
	// PreparedStatemnet�� ��� ������� �Լ�
	public PreparedStatement getPSTMT(String sql, Connection con) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch (Exception e) {
			System.out.println("PreparedStatment ���� ���� : " + e);
		} // end try catch
		return pstmt;
	} // end Method
	
	// ����� �ܺ� �ڿ��� �ݾ� �־�� �ϴµ�... �̰͵� �Ź� �ʿ��� �۾��̴�.
	// ��� �ݾ��ִ� �Լ��� ������.
	//   ����
	//   ���� �ݴ� �۾���	con, stmt, rs	�� �ݾƾ� �Ѵ�.
	//   �� 3������ �ϳ��� �Լ��� �̿��ؼ� �ݵ��� ����.
	public void close(Object obj) {
		// 3���� Ŭ������ ���ÿ� ���� �� �ִ� ���� Object�ϴ�.
		try {
			// Object�� �� ��ȯ�ؼ� ����ϼ���.....
			if (obj instanceof Connection) {
				Connection temp = (Connection) obj;
				temp.close();
			} else if (obj instanceof Statement) {
				Statement temp = (Statement) obj;
				temp.close();
			} else if (obj instanceof ResultSet) {
				ResultSet temp = (ResultSet) obj;
				temp.close();
			} else if (obj instanceof PreparedStatement) {
				PreparedStatement temp = (PreparedStatement) obj;
				temp.close();
			} // end if
		} catch (Exception e) {
			System.out.println("�ݱ� ���� : " + e);
		} // end try catch
	} // end Method
} // end class
