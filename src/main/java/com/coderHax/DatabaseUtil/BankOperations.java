package com.coderHax.DatabaseUtil;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.coderHax.Model.Employee;
import com.coderHax.Service.BankDAOImplementation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOperations {
	// comment
	public static String Task04(int n) {
		String name = null, name1 = "s";
		String proc = "{call coderHax4_ANGreaterThen700(?)}";
		try (CallableStatement cs = DBConnection.getConnection().prepareCall(proc)) {
			cs.setInt(1, n);
			// cs.executeUpdate();
			ResultSet rs = cs.executeQuery();
			while (rs.next()) {
				name = rs.getString("account_number");

				name1 = name1.concat(name);

			}

		} catch (Exception e) {
			log.error("Not Done " + e.getMessage());
			return null;
		}

		return name1;

	}
	public static boolean Task05(int n,String m) {
		String name=null,name1=null;
		boolean v = false;
		
	String proc = "{call coderHax5_BranchName(?,?)}";
		try (CallableStatement cs = DBConnection.getConnection().prepareCall(proc)) {
			cs.setInt(1, n);
			cs.setString(2, m);
			// cs.executeUpdate();
			
			
			 v= cs.execute();

		} catch (Exception e) {
			log.error("Not Done " + e.getMessage());
		
		}
      return v;

	}
	public static boolean Task09(int n) {
		String name=null;
		boolean v = false;
		
	String proc = "{call coderHax9_AccountLessOrEqual400(?)}";
		try (CallableStatement cs = DBConnection.getConnection().prepareCall(proc)) {
			cs.setInt(1, n);
			
	
			 v= cs.execute();
			

		} catch (Exception e) {
			log.error("Not Done " + e.getMessage());
		
		}
      return v;

	}

}
