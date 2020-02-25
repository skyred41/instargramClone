package com.instargramClone.web.Login;

public class LoginVO {

	private String userId;					// 유저 아이디
	private String userName;				// 유저 이름
	private String password;				// 패스워드
	private String password_expiry_date;	// 패스워드 만료일
	private String lastPassword;			// 이전 패스워드
	private String email;					// 이메일
	private String phone;					// 핸드폰 번호
	private int loginFailCnt;				// 로그인 실패 횟수
	private String birtday;					// 생일
	private String introduce;				// 자기소개
	private String wesite;					// 웹사이트 
	private String naverLoginId;			// 네이버 로그인 아이디
	private String googleLoginId;			// 구글 로그인 아이디
	private String regDay;					// 등록일자
	private String regTime;					// 등록시간
	private String modDay;					// 수정일자
	private String modTime;					// 수정일시
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword_expiry_date() {
		return password_expiry_date;
	}
	public void setPassword_expiry_date(String password_expiry_date) {
		this.password_expiry_date = password_expiry_date;
	}
	public String getLastPassword() {
		return lastPassword;
	}
	public void setLastPassword(String lastPassword) {
		this.lastPassword = lastPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getLoginFailCnt() {
		return loginFailCnt;
	}
	public void setLoginFailCnt(int loginFailCnt) {
		this.loginFailCnt = loginFailCnt;
	}
	public String getBirtday() {
		return birtday;
	}
	public void setBirtday(String birtday) {
		this.birtday = birtday;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getWesite() {
		return wesite;
	}
	public void setWesite(String wesite) {
		this.wesite = wesite;
	}
	public String getNaverLoginId() {
		return naverLoginId;
	}
	public void setNaverLoginId(String naverLoginId) {
		this.naverLoginId = naverLoginId;
	}
	public String getGoogleLoginId() {
		return googleLoginId;
	}
	public void setGoogleLoginId(String googleLoginId) {
		this.googleLoginId = googleLoginId;
	}
	public String getRegDay() {
		return regDay;
	}
	public void setRegDay(String regDay) {
		this.regDay = regDay;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getModDay() {
		return modDay;
	}
	public void setModDay(String modDay) {
		this.modDay = modDay;
	}
	public String getModTime() {
		return modTime;
	}
	public void setModTime(String modTime) {
		this.modTime = modTime;
	}
	
}
