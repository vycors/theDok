package the;
/*
 * 문제
 * 		SELECT
 * 			ename, job, dname, loc
 * 		FROM
 * 			emp e, dept d
 * 		WHERE
 * 			e.deptno = d.deptno
 * 을 실행해보자.
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
			// 드리이버 로딩
			db = new MyJDBC();
			// 접속
			con = db.getCON();
			// 스테이트먼트 생성
			stmt = db.getSTMT(con);
			
			// 질의 명령 만들어서
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	ename, job, dname, loc ");
			buff.append("FROM");
			buff.append("	emp e, dept d ");
			buff.append("WHERE ");
			buff.append("	e.deptno = d.deptno ");

			// 실행하고
			rs  = stmt.executeQuery(buff.toString());
			
			// 결과 보자.
			while (rs.next()) {
				String name = rs.getString("ename");
				String job = rs.getString("job");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				System.out.println(name + " " + job + " " + dname + " " + loc);
			} // end while
		} catch (Exception e) {
			System.out.println("에러 : " + e);
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
