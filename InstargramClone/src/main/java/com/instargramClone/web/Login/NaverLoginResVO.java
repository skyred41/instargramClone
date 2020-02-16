package com.instargramClone.web.Login;

public class NaverLoginResVO {
	private String code;
	private String state;
	private String error;
	private String errorMessage;
	
	private String id;
	private String nickname;
	private String name;
	private String email;
	private String gender;
	private String age;
	private String birthday;
	private String profile_image;
	
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getProfile_image() {
		return profile_image;
	}
	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	@Override
	public String toString() {
	
		return "NaverLoginResVO [ code = "+code+", state = "+state+", error = "+error + ", errorMessage = "+ errorMessage +" ]";
	}
	
	public String toNaverInfo() {
		return "NaverInfo [ id = "+id+", nickName = "+nickname+ ", name = "+name+", email = "+email+ ", gender = "+gender+", age = "+age+", birtday = " + birthday + ", profile_image = "+profile_image;
	}

	
}
