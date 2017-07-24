package com.svocloud.plcmedge.constants;

public class Constants {
	
	private Constants(){}
	
	public static final String CONFERENTCE_GET_ALL="";
	
	
	
	
	
	
    /*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=拦截器-=-=-=-=-=拦截器-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
    /**
     * 用户模块的拦截器
     */
    public static final String USER_FILTER = "/api/v1/user/*";

    public static final String GROUP_FILTER = "/api/v1/group/*";
    /**
     * 会议模块拦截器
     */
    public static final String CONFERENCE_FILTER = "/api/v1/conference/*";
    /**
     * 与会者模块
     */
    public static final String PARTICIPANT_FILTER = "/api/v1/participant/*";
    /**
     * 查询
     */
    public static final String STATUS_FILTER = "/api/v1/status/*";

	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=拦截器-=-=-=end-=-=拦截器-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/

	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_user start-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
    /**
     * 获取单个user
     */
    public static final String USER_GET_ID = "/api/v1/group/:groupId/user/:userId";
    /**
     * 获取全部user
     */
    public static final String USER_GET_ALL = "/api/v1/group/:groupId/user";
    /**
     * 创建user
     */
    public static final String CREATE_USER = "/api/v1/group/:groupId/user";
    /**
     * 更新user
     */
    public static final String UPDATE_USER = "/api/v1/group/:groupId/user/:userId";
    /**
     * 删除user
     */
    public static final String DELETE_USER = "/api/v1/group/:groupId/user/:userId";
    /**
     * 冻结user
     */
    public static final String BLOCK_USER = "/api/v1/group/:groupId/user/:userId/block";
    /**
     * 解冻user
     */
    public static final String UNBLOCK_USER = "/api/v1/group/:groupId/user/:userId/unblock";
    /**
     * 判断sip是否在线
     */
    public static final String SIP_IS_ONLINE = "/api/v1/group/:groupId/user/sipIsOnline/:sipNumber";
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_user end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_application start-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
    /**
     * 创建application
     */
    public static final String CREATE_APPLICATION = "/api/v1/application";
    /**
     * 查询所有application
     */
    public static final String SELECT_APPLICATION = "/api/v1/application";
    /**
     * 冻结application
     */
    public static final String BLOCK_APPLICATION = "/api/v1/application/:appId/block";
    /**
     * 解冻application
     */
    public static final String UNBLOCK_APPLICATION = "/api/v1/application/:appId/unblock";
    /**
     * 获取token
     */
    public static final String LOGIN_APPLICATION = "/api/v1/application/:appId/request_token";
    /**
     * 刷新token
     */
    public static final String REFRESHTOKEN = "/api/v1/application/:appId/refresh_token";
    /**
     * 退出
     */
    public static final String RELEASE_APPLICATION = "/api/v1/application/:appId/release_token";
    /**
     * 注册回调地址
     */
    public static final String REGIST_CALLBACK_ADDRESS = "/api/v1/application/:appId/callback";
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_application end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_group start-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
    /**
     * 创建group
     */
    public static final String CREATE_GROUP = "/api/v1/group";
    /**
     * 查询所有group
     */
    public static final String SELECT_GROUP = "/api/v1/group";
    /**
     * 更新group
     */
    public static final String UPDATE_GROUP = "/api/v1/group/:groupId";
    /**
     * 冻结group
     */
    public static final String BLOCK_GROUP = "/api/v1/group/:groupId/block";
    /**
     * 解冻group
     */
    public static final String UNBLOCK_GROUP = "/api/v1/group/:groupId/unblock";
    /**
     * 删除group
     */
    public static final String DELETE_GROUP = "/api/v1/group/:groupId";
    /**
     * 根据id获取group
     */
    public static final String GET_GROUP_BY_ID = "/api/v1/group/:groupId";
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user_group end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=non blocking test start -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/

    public static final String REDIS_POST = "/redis/:RKey/:key";

    public static final String REDIS_POST_DB = "/redis/:RKey/:key/:db";

    public static final String REDIS_GET = "/redis/:RKey/:key";

    public static final String REDIS_GET_DB = "/redis/:RKey/:key/:db";

	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=user end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=conference start-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/
    /**
     * 创建会议室
     */
    public static final String CREATE_ROOM_POST = "/api/v1/group/:groupId/room";
    /**
     * 修改会议室
     */
    public static final String UPDATE_ROOM_PUT = "/api/conference/room";
    /**
     * 查询会议室
     */
    public static final String ROOM_GET = "/api/v1/group/:groupId/room";
    /**
     *
     */
    public static final String ROOM_BY_ROOMNUMBER = "/api/v1/group/:groupId/room/:roomNumber";
    /**
     * 修改会议室 hostPin
     */
    public static final String SET_ROOM_PIN_PUT = "/api/v1/group/:groupId/room/:roomNumber/pin";
    /**
     * 修改会议室 hostPin，visitorPin
     */
    public static final String SET_ROOM_PIN2_PUT = "/api/conference/room/:roomId/hostPin/:hostPin/visitorPin/:visitorPin";
    /**
     * 修改会议室 mode
     */
    public static final String SET_ROOM_CONFERENCE_MODE_PATCH = "/api/conference/room/:roomNumber/mode/:mode";
    /**
     * 修改会议室配置
     */
    public static final String SET_ROOM_STAGE_LAYOUT_PATCH = "/api/conference/room/:roomNumber/layout/:layout";
    /**
     * 设置最大链接数
     */
    public static final String SET_ROOM_CONCURRENT_PATCH = "/api/conference/room/:roomId/concurrent/:concurrent";
    /**
     * 设置会议室别名(添加更新)
     */
    public static final String SET_ROOM_ALIAS_PATCH = "/api/conference/room/:roomNumber/alias";
    /**
     * 解除冻结
     */
    public static final String ROOM_UNBLOCK = "/api/v1/room/:roomNumber/unblock";
    /**
     * 冻结会议室
     */
    public static final String ROOM_BLOCK = "/api/v1/room/:roomNumber/block";
    /**
     * 设置会议室别名(覆盖更新)
     */
    public static final String SET_ROOM_ALIAS_PUT = "/api/v1/group/:groupId/room/:roomNumber/alias";
    /**
     *
     */
    public static final String SET_SINGLE_ROOM_ALIAS_PUT = "/api/conference/room/:roomNumber/alias/:alias";
    /**
     * 开会
     */
    public static final String START_CONFERENCE_POST = "/api/v1/conference/:roomNumber/start";
    /**
     * 结束会议
     */
    public static final String STOP_CONFERENCE_POST = "/api/v1/conference/:cid/stop";
    /**
     * 获得正在进行中的会议
     */
    public static final String ACTIVE_CONFERENCE_BY_CUUID_GET = "/api/v1/status/conference/active/:cid";
    /**
     * 获得正在进行中的会议
     */
    public static final String ACTIVE_CONFERENCE_GET = "/api/conference/active";
    /**
     * 与会者静音/解除静音
     */
    public static final String MUTE_CONFERENCE_POST = "/api/v1/conference/:cid/mute";
    public static final String UNMUTE_CONFERENCE_POST = "/api/v1/conference/:cid/unmute";
    public static final String MUTE_CONFERENCE_POST_ROLE = "/api/v1/conference/:cid/:mute/role/:roleType";
    public static final String MUTE_CONFERENCE_POST_USERID = "/api/v1/conference/:cid/participant/:userId/mute";
    public static final String UNMUTE_CONFERENCE_POST_USERID = "/api/v1/conference/:cid/participant/:userId/unmute";
    /**
     *
     */
    public static final String DAIL = "/api/v1/conference/:cid/dial";
    public static final String DAIL_RTMP = "/api/v1/conference/:cid/dialrtmp";
    public static final String DISCONNECT_RTMP = "/api/v1/conference/:cid/disconnectrtmp";
    /**
     * 锁定／解锁 会议
     */
    public static final String LOCK_CONFERENCE_POST = "/api/v1/conference/:cid/lock";
    public static final String UNLOCK_CONFERENCE_POST = "/api/v1/conference/:cid/unlock";

    /**
     * 改变与会者身份
     */
    public static final String TRANSFER_PARTICIPANT_PUT = "/api/v1/participant/:cid/:userId/convert/:role";

    public static final String SET_HOST = "/api/v1/conference/:cid/host";


    /**
     * webrtc
     */

    public static final String webRtc_call = "/api/v1/webrtc/:roomNumber/webrtc/call";
    public static final String webRtc_ack = "/api/v1/webrtc/:roomNumber/:puuid/calluuid/:calluuid/webrtc/ack";

    /**
     * 挂断与会者
     */
    public static final String DISCONNECT_PARTICIPANT_PUT_USER = "/api/v1/conference/:cid/participant/:userId/disconnect";
    public static final String DISCONNECT_PARTICIPANT_PUT = "/api/v1/conference/:cid/disconnect";
    /**
     * 更改会议模式
     */
    public static final String SET_CONFERENCE_MODE_PUT = "/api/conference/:roomNumberORcuuid/mode/:mode";
    /**
     * 更改会议屏幕布局
     */
    public static final String SET_CONFERENCE_STAGE_LAYOUT_MODE_PUT = "/api/v1/conference/:cid/layout";
    /**
     * 与会者状态
     */
    public static final String PARTICIPANT_STATUS_GET = "/api/v1/status/conference/:cid/participant";
    public static final String PARTICIPANT_STATUS_BYUSERID_GET = "/api/v1/status/conference/:cid/participant/:userId";
    /**
     * 设置主持人
     */
    public static final String SET_PRESENTER_POST = "/api/conference/:roomNumberORcuuid/set_presenter";

    public static final String GET_CONFERENCE_GROUPID = "/api/v1/status/conference/group/:groupId";

    public static final String GET_CONFERENCE_APPID = "/api/v1/status/conference/application";

    public static final String GET_ALL_CONFERENCE = "/api/v1/status/conference/application/all";

    /**
     * 会议历史
     */
    public static final String GET_CONFERENCE_HISTORY = "/api/v1/history/conference";

    public static final String GET_PARTICIPANT_HISTORY = "/api/v1/history/participant";

    /**
     * 直播录制
     */
    //开始
    public static final String POST_START_RECORD = "/api/v1/conference/:cid/record/start";
    //结束
    public static final String POST_STOP_RECORD = "/api/v1/conference/:cid/record/stop";
    //删除
    public static final String DELETE_RECORD = "/api/vi/conference/record";


    //文件下载
    public static final String FILE_DOWNLOADS_NAME = "/file/:cid/:fileName";
    public static final String FILE_DOWNLOADS = "/file/:cid";


	/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=conference end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/

    /* =-=-=-=-other=-=-=--= */
    // 默认redis hashName
    public static final String REDIS_KEY = "VCS_REDIS";
    // 默认的http端口号码
    public static final String HTTP_PORT_DEF = "8082";
    // 默认的redis地址
    public static final String REDIS_HOST_DEF = "127.0.0.1";
    // 默认的redis端口号
    public static final String REDIS_PORT_DEF = "6379";
    // 默认的token——reids db索引
    public static final String REDIS_TOKEN_DEF = "4";
    // 默认的reids db索引
    public static final String REDIS_DB_DEF = "0";
    // 默认的reids db索引
    public static final String TOKEN_EXPIRE_BY_SECOND = "43200";

    // jar 内部默认的配置文件路径
    public static final String CONFIG_INSIDE = "/properties/conf.properties";
    // jar 外部的配置文件默认路径
    public static final String CONFIG_OUTSIDE = "conf.properties";
    // 默认的jar内部的log4j 路径
    public static final String LOG4J_INSIDE = "/properties/log4j.properties";

    //录播文件保存地址
    public static final String RECORD_BASE_PATH="record_base_path";
    public static final String RECORD_CODE_LIST="record_code_list";
    public static final String RECORD_OUT_PATH="record_out_path";

    // config 里 redis_host 的key
    public static final String REDIS_HOST = "REDIS_HOST";
    // config 里 HTTP_PORT 的key
    public static final String HTTP_PORT = "HTTP_PORT";
    // config 里 REDIS_PORT 的key
    public static final String REDIS_PORT = "REDIS_PORT";
    // config 里 log4j_path 的key
    public static final String LOG4J_PATH = "LOG4J_PATH";
    /**
     * rtmp根路径
     */
    public static final String RTMP_BASE = "rtmp_base";

    public static final String CONFERENCE_BIZ_DRIVER = "ConferenceBizDriver";
    public static final String CONFERENCE_SYSTEM_DRIVER = "ConferenceSystemDriver";

    public static final String REDIS_TOKEN = "redis_token_db";

	/*------redis key------*/

    public static final String REDIS_KEY_BASE = "plcm_edge_";

    public static final String REDIS_ACTIVE_CONFERENCE_CID_LIST = "active_conference_CID_list";// 所有会议的hashKey
    public static final String REDIS_ACTIVE_CONFERENCE = "active_conference";// 所有会议的hashKey
    public static final String REDIS_CONFERENCE_GROUP_CID = "conference_group_CID_list"; // 每个组对应的uuid的集合
    public static final String REDIS_ROOM_CONFERENCE = "room_CID"; // 每个会议室当前对应的uuid
    public static final String REDIS_GROUP_LIMIT = "group_limit"; // redis控制group并发数
    public static final String REDIS_WAIT_PARTICIPANTS = "wait_participants"; // 等待进入会议室的与会者列表。hset

//    public static final String REDIS_ALL_PARTICIPANT = "ALL_PARTICIPANT";
    // ，uuid为key
    public static final String LAST_EVENT_ID = "LAST_EVENT_ID";

    /**
     * 定时刷新进行中的会议任务的scheduleId
     */
    public static final String REDIS_KEY_TASK_SCHEDULE_4_ACTIVECONFERENCE = "task_activeconference";
    /**
     * 定时更新Pexip中会议Token 任务名称 roomNumber与scheduleId的Map
     */
    public static final String REDIS_KEY_TASK_SCHEDULE_4_CONFERENCETOKEN = "task_conferencetoken";
    /**
     * 定时更新Pexip媒体流任务 roomNumber与scheduleId的Map
     */
    public static final String REDIS_KEY_TASK_SCHEDULE_4_MEDIASTREAM = "task_cmediastream";

    public static final String pexip_file_dir = "/properties/pexip.properties";

    public static final String pexip_event_msg = "pexip_event_msg";

    /**
     * 定时任务名称，for RefreshMediaStreamTask
     */
    public static final String TASK_NAME_PREFIX_4_RefreshMediaStreamTask = "task_refresh_conference_token_";
    /** 定时时间 */
    /**
     * 定时时间 正在进行中的会议定时刷新
     */
    public static final String REFRESHACTIVECONFERENCETASK_KEY = "refresh_active_conference_task";
    public static final String REFRESHACTIVECONFERENCETASK_DEF = "30";
    /**
     * 定时时间 pexip cn token刷新
     */
    public static final String REFRESHCONFERENCETOKENTASK_KEY = "refresh_conference_token_task";
    public static final String REFRESHCONFERENCETOKENTASK_DEF = "115";
    /**
     * 定时时间 媒体流
     */
    public static final String REFRESHMEDIASTREAMTASK_KEN = "refresh_media_stream_task";
    public static final String REFRESHMEDIASTREAMTASK_DEF = "120";
    /**
     * 会议历史信息
     */
    public static final String CONFERENCEHISTORYTASK_KEY = "conference_history_task";
    public static final String CONFERENCEHISTORYTASK_DEF = "1800";

    /**
     * 企业租户域名
     */
    public static final String SIP_PROXY_DOMAIN = "SIP_PROXY_DOMAIN";
    public static final String SIP_PROXY_DOMAIN_DEF = "conf.shec.edu.cn";
    /**
     * titan的ip与端口
     */
    public static final String SIP_PROXY_IP = "SIP_PROXY_IP";
    public static final String SIP_PROXY_IP_DEF = "172.31.8.167";
    public static final String SIP_PROXY_PROT = "SIP_PROXY_PROT";
    public static final String SIP_PROXY_PROT_DEF = "8080";

}
