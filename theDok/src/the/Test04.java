package the;
/*
 * ����
 * 		SELECT
 * 			ename, job, dname, loc
 * 		FROM
 * 			emp e, dept d
 * 		WHERE
 * 			e.deptno = d.deptno
 * �� �����غ���.
 */
import	java.sql.*;
import	sql.*;
public class Test04 {
	public Test04() {
		MyJDBC db = null;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// �帮�̹� �ε�
			db = new MyJDBC();
			// ����
			con = db.getCON();
			// ������Ʈ��Ʈ ����
			stmt = db.getSTMT(con);
			
			// ���� ��� ����
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	ename, job, dname, loc ");
			buff.append("FROM");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");

			// �����ϰ�
			rs  = stmt.executeQuery(buff.toString());
			
			// ��� ����.
			while (rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(name + " " + job + " " + dname + " " + loc);
			} // end while
		} catch (Exception e) {
			System.out.println("���� : " + e);
		} // end try catch
		finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		} // end try finally
		
	} // end Constructor

	public static void main(String[] args) {
		new Test04();
	} // end main Method
} // end class
