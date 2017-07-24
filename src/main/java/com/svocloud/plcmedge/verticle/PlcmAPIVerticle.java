package com.svocloud.plcmedge.verticle;

import com.svocloud.plcmedge.router.ApiRouter;
import com.svocloud.plcmedge.service.ConferenceService;
import com.svocloud.plcmedge.service.impl.ConferenceServiceImpl;
import io.vertx.core.Future;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.serviceproxy.ProxyHelper;

public class PlcmAPIVerticle extends RestAPIVerticle{
	
	private static final String SERVICE_NAME="plcm-edge";
	
	private ConferenceService conferenceService;
	@Override
	  public void start(Future<Void> future) throws Exception {
	    super.start();
	    System.out.println("***********");
	    /*conferenceService = new ConferenceServiceImpl(vertx, config());
	    ProxyHelper.registerService(ConferenceService.class, vertx, conferenceService, "conference.service.addr");*/
	    final Router router = Router.router(vertx);
	    enableCorsSupport(router);
	    router.route().handler(BodyHandler.create());
	    ApiRouter.router(router);
	    String host = "localhost";
	    int port = 8080;
	   createHttpServer(router, host, port);
	   //.compose(serverCreated -> publishHttpEndpoint(SERVICE_NAME, host, port));
	   //.setHandler(future.completer());
	  }
}
