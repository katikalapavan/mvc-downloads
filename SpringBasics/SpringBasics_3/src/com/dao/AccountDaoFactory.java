/**
 * 
 */
	package com.dao;
	
	 
	public class AccountDaoFactory {
		public static AccountDao getAccountDao(String type){
			if("InMem".equalsIgnoreCase(type)){
				return new AccountInMemoryImpl();
			} else if("Jdbc".equalsIgnoreCase(type)){
				return new AccountDaoJdbcImpl();
			}
			return null;
		}
	}
