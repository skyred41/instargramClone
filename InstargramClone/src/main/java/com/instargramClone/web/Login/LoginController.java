package com.instargramClone.web.Login;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@Controller
@RequestMapping("/login")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	private String apiResult = null;
	
	@RequestMapping("/loginForm")
	public String login() {
		logger.info(">>>loginForm");
		
		return "/login/loginForm";
	}
	
	@RequestMapping("/naverLogin")
	public String naverLogin(HttpServletRequest request, HttpSession session) throws IOException, ParseException, Exception {
		logger.info(">>>naverLogin");
		NaverLoginResVO naverResVO = new NaverLoginResVO();
		NaverLoginBO loginBO = new NaverLoginBO();
		ObjectMapper objectMapper = new ObjectMapper();
		
		String code =  request.getParameter("code");
		String state = request.getParameter("state");
		String error = request.getParameter("error");
		String errorMessage = request.getParameter("error_description");
		
		logger.info("code [{}] " + code);
		logger.info("state [{}] " + state);
		logger.info("error [{}] " + error);
		logger.info("errorMessage [{}] " + errorMessage);
		
		OAuth2AccessToken oauthToken;
		oauthToken = loginBO.getAccessToken(session, code, state); 
		
		// 1. 로그인 사용자 정보를 읽어온다.
		apiResult = loginBO.getUserProfile(oauthToken); // String 형식의 json데이터
		
		// 2. String형식인 apiResult를 json형태로 바꿈
		JSONParser parser  = new JSONParser();
		
		Object obj = parser.parse(apiResult);
		JSONObject jsonObj = (JSONObject) obj;
		
		// 3.데이터 파싱
		// Top레벨 단계 _response 파싱
		JSONObject response_obj = (JSONObject)jsonObj.get("response");
		
		naverResVO = objectMapper.readValue(response_obj.toJSONString(), NaverLoginResVO.class);
		logger.info(naverResVO.toNaverInfo());
		
		return "/login/loginForm";
	}
	
	public static void main(String[] args) {
		JSONObject json = new JSONObject();
		ObjectMapper objectMapper = new ObjectMapper();
		json.put("g2", "12");
		json.put("g3", "13");
		json.put("g4", "14");
		json.put("g5", "15");
		
		String jsonStr = json.toJSONString();
		JSONObject resJson = new JSONObject(json);
		
		System.out.println("jsonToStr : " + jsonStr);
		System.out.println("resJson : " + resJson.get("g2"));
		
		// JSON - VO
		JSONObject json2 = new JSONObject();
		json2.put("code", "1111");
		json2.put("state", "1111");
		json2.put("error", "1111");
		json2.put("errorMessage", "1111");
		
		try {
			NaverLoginResVO resVO = objectMapper.readValue(json2.toJSONString(), NaverLoginResVO.class);
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
