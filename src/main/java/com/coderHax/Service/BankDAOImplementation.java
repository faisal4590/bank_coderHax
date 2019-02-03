package com.coderHax.Service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.coderHax.DAO.BankDAO;
import com.coderHax.DatabaseUtil.DBConnection;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class BankDAOImplementation implements BankDAO {
	private static final Logger logger = LoggerFactory.getLogger(BankDAOImplementation.class);
	private static Connection myConn = DBConnection.getConnection();
	private static CallableStatement myStmt = null;
	
	@Override
	public boolean coderHax1_customerName() {
		try {
			log.info("Names from Loan");
			myStmt = myConn.prepareCall("{ call coderHax1_NamesOfAllCustomer() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String name = rs.getString("customer_name");
				System.out.printf("%s\n", name);
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean coderHax2_branchName() {
		try {
			log.info("Branch Names from Loan");
			myStmt = myConn.prepareCall("{ call coderHax2_NamesOfAllBranches() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String bName = rs.getString("branch_name");
				System.out.printf("%s\n", bName);				
			}
			myStmt.close();
			rs.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean coderHax3_allFromBranch() {
		try {
			log.info("Entire Table from Branch");
			myStmt = myConn.prepareCall("{ call coderHax3_SelectAllFromBranch() }");
			ResultSet rs = myStmt.executeQuery();
			while(rs.next()) {
				String bName = rs.getString("branch_name");
				String bCity = rs.getString("branch_city");
				String ast = rs.getString("assets");
				System.out.printf("%s, %s, %s\n", bName,bCity,ast);
			}
			myStmt.close();
			rs.close();
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean coderHax4_balanceGreaterThan700() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax4_balanceGreaterThan800() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax6_assetsInThousands() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax7_balanceBetweenOneAndFourMillion() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax8_customersWhoHaveAccount() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean coderHax9_balance400OrLess() {
		// TODO Auto-generated method stub
		return false;
	}

}
