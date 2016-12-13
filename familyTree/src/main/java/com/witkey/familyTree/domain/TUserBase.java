package com.witkey.familyTree.domain;

import javax.persistence.Table;

@Table(name = "t_user_base")
public class TUserBase {
	
	private int id;
	private String userCode;
	private String userName;
	private String userPassword;
	private String userDesc;
	private int userType;
	private String userNickName;
	private int state;
	private String remark;

}
