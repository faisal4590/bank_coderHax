package com.coderHax.DatabaseUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.coderHax.Service.BankDAOImplementation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BankOperations {
	public Connection initialize() {
		DBConnection conn = DBConnection.getInstance();
		Connection dbConnection = conn.getConnection();
		return dbConnection;
	}
	

	public void coderHax6_assetsInThousandsImplentation() throws SQLException {
		String coderHax6_branch = "exec coderHax6_BranchNameAndAsset";

		PreparedStatement preparedStatement = initialize().prepareStatement(coderHax6_branch);
		// execute insert SQL stetement
		preparedStatement.execute();// returns true if the statement is ok
	}

	public void coderHax7_AssetsBetweenOneToFourMillionImplementation(int n, int m) throws SQLException {
		String coderHax7_branch = "{call coderHax7_AssetsBetweenOneToFourMillion(?,?)} ";
		CallableStatement cs = initialize().prepareCall(coderHax7_branch);

		cs.setInt(1, n);
		cs.setInt(2, m);
		
		cs.execute();
		
		// execute insert SQL stetement
		// returns true if the statement is ok
	}
	
	public void coderHax8_HaveAccountImplementation() throws SQLException {
		String coderHax8_branch = "{call coderHax6_BranchNameAndAsset} ";
		CallableStatement cs = initialize().prepareCall(coderHax8_branch);
		cs.execute();// returns true if the statement is ok
		
		// execute insert SQL stetement
		
	}

	public static boolean Task09(int n) throws SQLException {
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
		
}
