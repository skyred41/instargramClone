package com.instargramClone.api;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.instargramClone.web.Login.NaverLoginReqVO;
import com.instargramClone.web.Login.NaverLoginResVO;


public class HttpConnector {

	private static final Logger logger = LoggerFactory.getLogger(HttpURLConnection.class);
	
	public void postRestAPI(String reqUrl) throws Exception {
		
		
		NaverLoginReqVO naverReqVO = new NaverLoginReqVO();
		URL url = null;
		HttpURLConnection conn = null;
		JSONObject resJSON = null;
				
		try {
			url = new URL(reqUrl);
			
			conn = (HttpURLConnection) url.openConnection();
			
			// Reqeust 형식 설정
			conn.setRequestMethod("POST");
			//conn.setRequestProperty("X-Auth-Token", this.token);
			conn.setRequestProperty("Accept", "application/json");
			conn.setConnectTimeout(5000);		// 서버에 연결되는 Timeout 시간 설정
			conn.setReadTimeout(5000); 			// InputStream 읽어 오는 Timeout 시간 설정

			// outputStream으로 posa 데이터를 넘겨주겠다는 옵션
			conn.setDoOutput(true);
			// inputStream으로 서버로 부터 응답을 받겠다는 옵션
			conn.setDoInput(true);
			
			BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( conn.getOutputStream() ) );

			// commond라는 JSONArray를 담을 jsonObject 생성
			JSONObject commands = new JSONObject();
			
			commands.put("commands",naverReqVO) ;
			
			// request에 쓰기
			bw.write(commands.toString());
			bw.flush();
			bw.close();
			
			int resCode = conn.getResponseCode();
			logger.info( "http status [{}]", resCode);
			
			if( resCode == 200) {
				logger.info( "통신 성공!");
				
				// 통신 성공 후 응답 JSON 데이터 받기
				BufferedReader br = new BufferedReader(new InputStreamReader( conn.getInputStream() ) );
				StringBuilder sb = new StringBuilder();
				String line = "";
				while( (line = br.readLine()) != null ) {
					sb.append(line);
				}
				
				
				ObjectMapper mapper = new ObjectMapper();
				NaverLoginResVO naverResVO = mapper.readValue(sb.toString(), NaverLoginResVO.class);
				
				System.out.println(naverResVO);
				
			}else {
				logger.info( "http status [{}]", resCode);
				logger.info( "통신 실패");				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
