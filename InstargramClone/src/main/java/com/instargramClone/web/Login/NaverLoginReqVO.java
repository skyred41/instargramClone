package com.instargramClone.web.Login;

public class NaverLoginReqVO {
	private String response_type;			// 인증 과정 구분값 [ code ] 기본값
	private String client_id;				// 애플리케이션 등록 시 발급 받은 Client Id
	private String redirect_uri;			// 애플리케이션을 등록 시 입력한 CallBack Url 값으로 Url 인코딩을 적용한 값
	private String state;					// 사이트 간 요청 방지를 위한 애플리케이션 생성 토큰 값으로 Url인코딩을 적용한 
	private String scope;					// 접근 허용 범위를 처리하기 위한 내부 구분값
	
	
	public NaverLoginReqVO() {
		this.response_type="code";
		this.client_id="CSlGh90l95NVgKzm7iVB";
		this.redirect_uri="";
		
	}
	
	public String getResponse_type() {
		return response_type;
	}
	public void setResponse_type(String response_type) {
		this.response_type = response_type;
	}
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getRedirect_uri() {
		return redirect_uri;
	}
	public void setRedirect_uri(String redirect_uri) {
		this.redirect_uri = redirect_uri;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
	
	
}
