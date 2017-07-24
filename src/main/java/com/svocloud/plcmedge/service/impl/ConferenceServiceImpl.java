package com.svocloud.plcmedge.service.impl;

import com.svocloud.plcmedge.jdbcRepository.JdbcRepositoryWrapper;
import com.svocloud.plcmedge.model.Conference;
import com.svocloud.plcmedge.service.ConferenceService;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

public class ConferenceServiceImpl extends JdbcRepositoryWrapper implements ConferenceService {

	private final String FETCH_STATEMENT="SELECT * FROM CONFERENCE WHERE CID=? ";
	public ConferenceServiceImpl(Vertx vertx, JsonObject config) {
		super(vertx, config);
	}

	@Override
	public void selectConferenceById(String cid) {
		return  retrieveOne(cid, FETCH_STATEMENT);
	}

}
