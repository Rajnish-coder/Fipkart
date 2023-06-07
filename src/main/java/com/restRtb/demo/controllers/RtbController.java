package com.restRtb.demo.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class RtbController {

	private final ObjectMapper objectMapper;

	public RtbController(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@PostMapping("/getData")
	public ObjectNode createJSONObject(@RequestBody JsonNode request) {
		System.out.println("request body from videos ads : " + request);
		ObjectNode jsonObject = objectMapper.createObjectNode();
		ArrayNode seatbidArray = objectMapper.createArrayNode();
		ArrayNode bidArray = objectMapper.createArrayNode();
		ObjectNode seatbidObject = objectMapper.createObjectNode();
		ObjectNode bidObject = objectMapper.createObjectNode();

		// Set the values for the properties
		jsonObject.put("id", "123");

//      JSONArray seatbidArray = new JSONArray();
//      JSONObject seatbidObject = new JSONObject();
//      JSONArray bidArray = new JSONArray();
//      JSONObject bidObject = new JSONObject();
		bidObject.put("id", "12345");
		bidObject.put("impid", "2");
		bidObject.put("price", 3.00);
		bidObject.put("nurl", "http://example.com/winnoticeurl");
//      bidObject.put("adm", "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<VAST version=\"2.0\">\n<Ad id=\"" +
//              "12345\">\n<InLine>\n<AdSystem version=\"1.0\">SpotXchange</AdSystem>\n<AdTitle>\n <![CDATA[Sample VAST]]>\n" +
//              "</AdTitle>\n<Impression>http://sample.com</Impression>\n<Description>\n<![C DATA[A sample VAST feed]]>\n" +
//              "</Description>\n <Creatives>\n<Creative sequence=\"1\" id=\"1\">\n<Linear>\n<Duration>00:00:30</Duration>" +
//              "\n  <TrackingEvents> </TrackingEvents>\n<VideoClicks>\n<ClickThrough>\n" +
//              "<![CDATA[http://sample.com/openrtb test]]>\n</ClickThrough>\n</VideoClicks>\n<MediaFiles>\n" +
//              "<MediaFile delivery=\"progressive\" bitrate=\"256\" width=\"640\" height=\"480\" type=\"video/mp4\">\n" +
//              "<![CDATA[http://sample.com/video.mp4]]>\n </MediaFile>\n</MediaFiles>\n</Linear>\n </Creative>\n</Creatives>\n" +
//              "</InLine>\n</Ad>\n</VAST>");

		bidObject.put("adm",
				"<VAST xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast.xsd\" version=\"3.0\">\n"
						+ "<Ad id=\"5337691096\">\n" + "<InLine>\n" + "<AdSystem>GDFP</AdSystem>\n"
						+ "<AdTitle>Dream Girl</AdTitle>\n" + "<Description>\n" + "<![CDATA[ Dream Girl ad ]]>\n"
						+ "</Description>\n" + "<Error>\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=videoplayfailed[ERRORCODE] ]]>\n"
						+ "</Error>\n" + "<Impression>\n"
						+ "<![CDATA[ https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjssf_exgmmP2xXbP_zl320kbQKFNX13aCq3_BudpU_vqNUROe7-f9mNPRk3GKLr7ljlGjgrjKJ2mr3zelxPv4d6YWLL5k9F3dKOFYyeurwHgrjHO6wkD17YmKh0mWxCzf4urA3nTLNvAwpKs9VIMIRzSR8gxx5xK-YRQXVZ1pOesRjyOCcSaEydoRcYuXGyFcATRb536oWbVP8omHuL-lZAFs_ZhRiVrAgx_rEGATzOqbXK211I5CHkeu4ELJAi13UgLRcCVt0LjjCwv5P-PJCnhsBa6mLxWa9F9HpnLdOYZ15VWv9GsSIbiqi6XOLL4GPzXWKF7ozayzog2aCZZBqal2oM&sai=AMfl-YSCF6ePuYXuHXuRM4pPC-BJ27ZQX3lHu4SBjQZeRStOzrcibsh1CzsLX4QBnBGBYjLIy4I7EwrTIk6H177kXoxqRvq35Yua1VA4zlaM9H-vj2w&sig=Cg0ArKJSzOsJJDMVKG4LEAE&uach_m=[UACH]&adurl= ]]>\n"
						+ "</Impression>\n" + "<Creatives>\n" + "<Creative id=\"138307476827\" sequence=\"1\">\n"
						+ "<Linear>\n" + "<Duration>00:00:31</Duration>\n" + "<TrackingEvents>\n"
						+ "<Tracking event=\"start\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=part2viewed&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"firstQuartile\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=videoplaytime25&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"midpoint\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=videoplaytime50&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"thirdQuartile\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=videoplaytime75&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"complete\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=videoplaytime100&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"mute\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=admute&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"unmute\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adunmute&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"rewind\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adrewind&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"pause\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adpause&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"resume\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adresume&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"creativeView\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=vast_creativeview&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"fullscreen\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adfullscreen&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"acceptInvitationLinear\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=acceptinvitation&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"closeLinear\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=adclose&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"exitFullscreen\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=vast_exit_fullscreen&ad_mt=[AD_MT] ]]>\n"
						+ "</Tracking>\n" + "</TrackingEvents>\n" + "<AdParameters>\n" + "<![CDATA[ moatenable=1 ]]>\n"
						+ "</AdParameters>\n" + "<VideoClicks>\n" + "<ClickThrough id=\"GDFP\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pcs/click?xai=AKAOjstq9QxPr7RnkbrbCDhyVZz4f1cAWcw5A239aFhlqe26XKkc2XxZNDAMYOZvGC_WarA4EYSq40JDFJfcJoAKQSNQC8RhucaZkCUUssA4wMAJZEFcx8aNIQ3HfnMLZjSEzw04Dq1aoLUBidIAB7y33nNz-WAknYhxEYCJlYPGDa1-E3DNx1RRpPk6eSnfs6H4wml5SV5ou6HmR4ofuAQ1KcqF8zv3C4O7HqPeSuaGS0Na-kx84vAUeJRNz_3JPUijBygYuT6zs6yHX2oEw6ZNsO2Usy2W2G9uV2jxzNctczUIvvAOx_84G5h_kp3aSZdwUertCKiThtRaMZyaD-rHwhY&sai=AMfl-YTR1bIwM_HD4cYUbpm6-XP0DMGpaSGPm8_T_fgcvnpaLBwShSE5evDTI0726Ov9OQcwbvbm1jAB5KdbQr8mv_CqcrQIKJQGD6iA3sXgoGoP7Ko&sig=Cg0ArKJSzDhKQsw9vVLz&fbs_aeid=[gw_fbsaeid]&adurl=https://www.zee5.com/ ]]>\n"
						+ "</ClickThrough>\n" + "</VideoClicks>\n" + "<MediaFiles>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"480\" height=\"360\" type=\"video/mp4\" bitrate=\"350\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/18/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/9B49C38C9CF9F3740D138206B8FA94430E1B77AA.3FD7A2D5600152D6350B7A974C6FFA02D9D9F525/key/ck2/file/file.mp4 ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"streaming\" width=\"640\" height=\"480\" type=\"application/x-mpegURL\" minBitrate=\"45\" maxBitrate=\"1224\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/api/manifest/hls_variant/requiressl/yes/source/gfp_video_ads/id/f13f5f171b03e631/itag/0/playlist_type/LIVE/acao/yes/mime/application%2Fx-mpegURL/ctier/L/ip/0.0.0.0/ipbits/0/expire/1717663802/sparams/ip,ipbits,expire,requiressl,source,id,itag,playlist_type,acao,mime,ctier/signature/8EBE4910B6CD979946171E83975AC3EC90428F15.763CF7A7B7E2EFB8D67019C93E74527E62C3FEF5/key/ck2/file/index.m3u8 ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"streaming\" width=\"640\" height=\"480\" type=\"application/dash+xml\" minBitrate=\"45\" maxBitrate=\"1224\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/api/manifest/dash/requiressl/yes/source/gfp_video_ads/id/f13f5f171b03e631/itag/0/playlist_type/LIVE/acao/yes/mime/application%2Fdash+xml/ctier/L/ip/0.0.0.0/ipbits/0/expire/1717663802/sparams/ip,ipbits,expire,requiressl,source,id,itag,playlist_type,acao,mime,ctier/signature/3FEC4FD2352D4C4ADCD2B286666182346D2FD0C4.2BC96FF625D5C13CD092998CBF1BCADC4B9ABB9E/key/ck2 ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"176\" height=\"144\" type=\"video/3gpp\" bitrate=\"80\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/17/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/77F8986389A86BDEB6F523431E31104913E49E1C.4276EEC26C246D495904F783B1D3C1A245459720/key/ck2/file/file.3gp ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"320\" height=\"240\" type=\"video/3gpp\" bitrate=\"224\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/36/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2F3gpp/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/57821FA06A09CC9FF719202BCCAA0E72ADE10EFF.45283F12E4FCA195D7B39747A85FFEC40489A425/key/ck2/file/file.3gp ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"480\" height=\"360\" type=\"video/webm\" bitrate=\"482\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/43/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/9D8CF9E54FC808BFAFED1276F2D3FFB8AABD2222.45023FF177FD14F0BC87D29699B7736DFC084271/key/ck2/file/file.webm ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"640\" height=\"480\" type=\"video/webm\" bitrate=\"664\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/44/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fwebm/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/8B64E7B0C3694D719F9A304E223C81AD5B7B273B.567AFD3F34C2679DCC6A7350096DA2E0A784C74C/key/ck2/file/file.webm ]]>\n"
						+ "</MediaFile>\n"
						+ "<MediaFile id=\"GDFP\" delivery=\"progressive\" width=\"640\" height=\"480\" type=\"video/mp4\" bitrate=\"1083\" scalable=\"true\" maintainAspectRatio=\"true\">\n"
						+ "<![CDATA[ https://redirector.gvt1.com/videoplayback/id/f13f5f171b03e631/itag/109/source/gfp_video_ads/requiressl/yes/acao/yes/mime/video%2Fmp4/ctier/L/ip/0.0.0.0/ipbits/0/expire/1686149402/sparams/ip,ipbits,expire,id,itag,source,requiressl,acao,mime,ctier/signature/09E4F5C520FCDA1241F666946148B8BAE6FF238F.118FD2E6152849A0C8536B572CDBEBA3C1C91065/key/ck2/file/file.mp4 ]]>\n"
						+ "</MediaFile>\n" + "</MediaFiles>\n" + "</Linear>\n" + "</Creative>\n" + "</Creatives>\n"
						+ "<Extensions>\n" + "<Extension type=\"waterfall\" fallback_index=\"0\"/>\n"
						+ "<Extension type=\"geo\">\n" + "<Country>IN</Country>\n" + "<Bandwidth>4</Bandwidth>\n"
						+ "<BandwidthKbps>20000</BandwidthKbps>\n" + "</Extension>\n" + "<Extension type=\"metrics\">\n"
						+ "<FeEventId>ukSAZO7yJMuU9fwP6paW8A8</FeEventId>\n"
						+ "<AdEventId>CMux4sXjsP8CFcWXcAodj3YH8A</AdEventId>\n" + "</Extension>\n"
						+ "<Extension type=\"ShowAdTracking\">\n" + "<CustomTracking>\n"
						+ "<Tracking event=\"show_ad\">\n"
						+ "<![CDATA[ https://securepubads.g.doubleclick.net/pcs/view?xai=AKAOjssXce9zRsDDwsNmN95WCGls_Ll9evReZPO4E_hsAU8NlT7xLyYUXHKAU80YXD2afAtLmRZ-fInNWe-pQFKxuohe8jOMLfuW35w-MkiQuH-oso985soqOtzWQkkIhD_hPE0tgb2nyeHLMT0kBCCIBeLkCC0ZNEuh0gkqI1kxXo1VnbYV5CBZm-pmaVb_beL6PYh8hLNq4ZOrvFrHCDX4n70UNJkZZE-CRbiIpwl-qnqrj0mq4Zin_-2VvjruECBIDgEV9koSL9zrlKblMA1vAK_WQ1vIYqyeeicxMIPXplnst4BM1Prn5idJtyazeQ8QIwHIsix34YkB9axiosZLyKMvN2g9RQ&sai=AMfl-YRafqlaCpojX-dyAXg_oC7PCT6uFhZut9borxwyj6L_8UZAJWUMb3SSlqZSKDIhq7rsMAxOwvE9n7dXfLz8SC8SWwDgmLp9j7DYYqtGNwiv1e4&sig=Cg0ArKJSzELFoy5r32mnEAE&uach_m=[UACH]&adurl= ]]>\n"
						+ "</Tracking>\n" + "</CustomTracking>\n" + "</Extension>\n"
						+ "<Extension type=\"video_ad_loaded\">\n" + "<CustomTracking>\n"
						+ "<Tracking event=\"loaded\">\n"
						+ "<![CDATA[ https://pubads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=video_ad_loaded ]]>\n"
						+ "</Tracking>\n" + "</CustomTracking>\n" + "</Extension>\n"
						+ "<Extension type=\"heavy_ad_intervention\">\n" + "<CustomTracking>\n"
						+ "<Tracking event=\"heavy_ad_intervention_cpu\">\n"
						+ "<![CDATA[ https://googleads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=heavy_ad_intervention_cpu ]]>\n"
						+ "</Tracking>\n" + "<Tracking event=\"heavy_ad_intervention_network\">\n"
						+ "<![CDATA[ https://googleads.g.doubleclick.net/pagead/interaction/?ai=Bb8EgukSAZMvsJcWvwgOP7Z2AD4qN5rNGAAAAEAEg-fObVzgBWNu6kp6DBGDlgoCAtA6yAQx3d3cuemVlNS5jb226AQszMDB4MjUwX3htbMgBBdoBQmh0dHBzOi8vd3d3LnplZTUuY29tL3R2c2hvd3MvZGV0YWlscy9rdW1rdW0tYmhhZ3lhLzAtNi0xMjcvbGF0ZXN0McACAuACAOoCJS8yMTY2NTE0OTE3MC9aZWU1X1N0YWdpbmdfV2ViX1ByZXJvbGz4AoTSHpADmgiYA5oIqAMB0ASQTuAEAdIFBhDY55rxE5AGAaAGI4gHAZAHAqgHmgaoB_PRG6gHltgbqAeqm7ECqAeDrbECqAf_nrECqAffn7EC2AcB4AcB0ggXCAAQAhgdMgEAOgef0ICAgIAESL39wTrYCAKACgWYCwHQFQH4FgGAFwE&sigh=gOokVJQdy74&label=heavy_ad_intervention_network ]]>\n"
						+ "</Tracking>\n" + "</CustomTracking>\n" + "</Extension>\n" + "</Extensions>\n" + "</InLine>\n"
						+ "</Ad>\n" + "</VAST>");

		bidArray.add(bidObject);
		seatbidObject.put("bid", bidArray);
		seatbidArray.add(seatbidObject);
		jsonObject.put("RequestBody", request);
		jsonObject.put("seatbid", seatbidArray);
		return jsonObject;
	}
}
