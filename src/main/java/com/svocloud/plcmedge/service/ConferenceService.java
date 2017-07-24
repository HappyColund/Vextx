package com.svocloud.plcmedge.service;

import com.svocloud.plcmedge.service.impl.ConferenceServiceImpl;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

@ProxyGen
@VertxGen
public interface ConferenceService {
	
	final String CONFERENTCE_ADDR="conference.addr";
	
	static ConferenceService create(Vertx verxt) {
		return new ConferenceServiceImpl(verxt, new JsonObject());
	}
	
	static ConferenceService createProxy(Vertx vertx, String address) {
		   return new ConferenceServiceVertxEBProxy(vertx, address);
		 }
	void selectConferenceById(String cid,Handler<AsyncResult<JsonObject>> resultHandler);
}
