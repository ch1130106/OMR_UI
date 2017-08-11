package com.omr.controller;

import javax.swing.JOptionPane;

public class ValidateInputs {
	String username = "username";
	String password = "password";
	static int count = 0;
	static int flag = 0;

	public ValidateInputs() {

	}
	private void msgbox(String s){
		   JOptionPane.showMessageDialog(null, s);
		}

	public boolean checkInputs(String username, String password) {
		if (this.flag == 0) {
			if (username.equals(this.username) && password.equals(this.password)) {
				return true;
			} else {
				if (this.count < 3) {
					msgbox("Username or Password in not Correct!\nYou are left "+(2-count)+" more attempts.");
					count++;
					return false;
				} else {
					msgbox("Your account has been blocked!");
					flag = 1;
					return false;
				}
			}
		} else {
			msgbox("Your account has been blocked!");
			return false;
		}
	}
}
