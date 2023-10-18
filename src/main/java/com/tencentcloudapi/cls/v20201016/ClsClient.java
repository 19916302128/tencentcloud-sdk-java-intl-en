/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cls.v20201016;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cls.v20201016.models.*;

public class ClsClient extends AbstractClient{
    private static String endpoint = "cls.tencentcloudapi.com";
    private static String service = "cls";
    private static String version = "2020-10-16";
    
    public ClsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ClsClient(Credential credential, String region, ClientProfile profile) {
        super(ClsClient.endpoint, ClsClient.version, credential, region, profile);
    }

    /**
     *This API is used to add machine group information.
     * @param req AddMachineGroupInfoRequest
     * @return AddMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public AddMachineGroupInfoResponse AddMachineGroupInfo(AddMachineGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddMachineGroupInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddMachineGroupInfo", AddMachineGroupInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply the collection configuration to the specified machine group.
     * @param req ApplyConfigToMachineGroupRequest
     * @return ApplyConfigToMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ApplyConfigToMachineGroupResponse ApplyConfigToMachineGroup(ApplyConfigToMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyConfigToMachineGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ApplyConfigToMachineGroup", ApplyConfigToMachineGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether the Kafka service cluster is accessible.
     * @param req CheckRechargeKafkaServerRequest
     * @return CheckRechargeKafkaServerResponse
     * @throws TencentCloudSDKException
     */
    public CheckRechargeKafkaServerResponse CheckRechargeKafkaServer(CheckRechargeKafkaServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckRechargeKafkaServerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckRechargeKafkaServer", CheckRechargeKafkaServerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disable Kafka consumption.
     * @param req CloseKafkaConsumerRequest
     * @return CloseKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CloseKafkaConsumerResponse CloseKafkaConsumer(CloseKafkaConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloseKafkaConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CloseKafkaConsumer", CloseKafkaConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an alarm policy.
     * @param req CreateAlarmRequest
     * @return CreateAlarmResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmResponse CreateAlarm(CreateAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAlarm", CreateAlarmResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a notification group.
     * @param req CreateAlarmNoticeRequest
     * @return CreateAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlarmNoticeResponse CreateAlarmNotice(CreateAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAlarmNotice", CreateAlarmNoticeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a collection rule configuration.
     * @param req CreateConfigRequest
     * @return CreateConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigResponse CreateConfig(CreateConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateConfig", CreateConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a shipping task.
     * @param req CreateConsumerRequest
     * @return CreateConsumerResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsumerResponse CreateConsumer(CreateConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateConsumer", CreateConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a COS import task.
     * @param req CreateCosRechargeRequest
     * @return CreateCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCosRechargeResponse CreateCosRecharge(CreateCosRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCosRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCosRecharge", CreateCosRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a data processing task.
     * @param req CreateDataTransformRequest
     * @return CreateDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataTransformResponse CreateDataTransform(CreateDataTransformRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataTransformResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDataTransform", CreateDataTransformResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a download task. To get the returned download address, call `DescribeExports` to view the task list. The `CosPath` parameter is also included for download address. For more information, visit https://intl.cloud.tencent.com/document/product/614/56449.?from_cn_redirect=1
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateExport", CreateExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an index.
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateIndex", CreateIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a Kafka data subscription task.
     * @param req CreateKafkaRechargeRequest
     * @return CreateKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public CreateKafkaRechargeResponse CreateKafkaRecharge(CreateKafkaRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKafkaRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateKafkaRecharge", CreateKafkaRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a logset. The ID of the created logset is returned.
     * @param req CreateLogsetRequest
     * @return CreateLogsetResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogsetResponse CreateLogset(CreateLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateLogset", CreateLogsetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a machine group.
     * @param req CreateMachineGroupRequest
     * @return CreateMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateMachineGroupResponse CreateMachineGroup(CreateMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMachineGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateMachineGroup", CreateMachineGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a task to ship to COS. Note: To use this API, you need to check whether you have configured the role and permission for shipping to COS. If not, see **Viewing and Configuring Shipping Authorization** at https://intl.cloud.tencent.com/document/product/614/71623.?from_cn_redirect=1
     * @param req CreateShipperRequest
     * @return CreateShipperResponse
     * @throws TencentCloudSDKException
     */
    public CreateShipperResponse CreateShipper(CreateShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateShipperResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateShipper", CreateShipperResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a log topic.
     * @param req CreateTopicRequest
     * @return CreateTopicResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicResponse CreateTopic(CreateTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateTopic", CreateTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an alarm policy.
     * @param req DeleteAlarmRequest
     * @return DeleteAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmResponse DeleteAlarm(DeleteAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAlarm", DeleteAlarmResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a notification group.
     * @param req DeleteAlarmNoticeRequest
     * @return DeleteAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAlarmNoticeResponse DeleteAlarmNotice(DeleteAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAlarmNotice", DeleteAlarmNoticeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a collection rule configuration.
     * @param req DeleteConfigRequest
     * @return DeleteConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigResponse DeleteConfig(DeleteConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteConfig", DeleteConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the collection configuration applied to a machine group.
     * @param req DeleteConfigFromMachineGroupRequest
     * @return DeleteConfigFromMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigFromMachineGroupResponse DeleteConfigFromMachineGroup(DeleteConfigFromMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigFromMachineGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteConfigFromMachineGroup", DeleteConfigFromMachineGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a shipping task.
     * @param req DeleteConsumerRequest
     * @return DeleteConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsumerResponse DeleteConsumer(DeleteConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteConsumer", DeleteConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a data processing task.
     * @param req DeleteDataTransformRequest
     * @return DeleteDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataTransformResponse DeleteDataTransform(DeleteDataTransformRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDataTransformResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDataTransform", DeleteDataTransformResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a log download task.
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteExport", DeleteExportResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the index configuration of a log topic. After deleting, you cannot retrieve or query the collected logs.
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteIndex", DeleteIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a Kafka data subscription task.
     * @param req DeleteKafkaRechargeRequest
     * @return DeleteKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteKafkaRechargeResponse DeleteKafkaRecharge(DeleteKafkaRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteKafkaRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteKafkaRecharge", DeleteKafkaRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a logset.
     * @param req DeleteLogsetRequest
     * @return DeleteLogsetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogsetResponse DeleteLogset(DeleteLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteLogset", DeleteLogsetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a machine group.
     * @param req DeleteMachineGroupRequest
     * @return DeleteMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupResponse DeleteMachineGroup(DeleteMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMachineGroup", DeleteMachineGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete machine group information.
     * @param req DeleteMachineGroupInfoRequest
     * @return DeleteMachineGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMachineGroupInfoResponse DeleteMachineGroupInfo(DeleteMachineGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMachineGroupInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteMachineGroupInfo", DeleteMachineGroupInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a COS shipping task.
     * @param req DeleteShipperRequest
     * @return DeleteShipperResponse
     * @throws TencentCloudSDKException
     */
    public DeleteShipperResponse DeleteShipper(DeleteShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteShipperResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteShipper", DeleteShipperResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a log topic.
     * @param req DeleteTopicRequest
     * @return DeleteTopicResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicResponse DeleteTopic(DeleteTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTopic", DeleteTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the notification group list.
     * @param req DescribeAlarmNoticesRequest
     * @return DescribeAlarmNoticesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmNoticesResponse DescribeAlarmNotices(DescribeAlarmNoticesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmNoticesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAlarmNotices", DescribeAlarmNoticesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the alarm policy list.
     * @param req DescribeAlarmsRequest
     * @return DescribeAlarmsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmsResponse DescribeAlarms(DescribeAlarmsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlarmsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAlarms", DescribeAlarmsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get alarm records, such as today's uncleared alarms.
     * @param req DescribeAlertRecordHistoryRequest
     * @return DescribeAlertRecordHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertRecordHistoryResponse DescribeAlertRecordHistory(DescribeAlertRecordHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAlertRecordHistoryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAlertRecordHistory", DescribeAlertRecordHistoryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the machine group bound to a collection rule configuration.
     * @param req DescribeConfigMachineGroupsRequest
     * @return DescribeConfigMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMachineGroupsResponse DescribeConfigMachineGroups(DescribeConfigMachineGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigMachineGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeConfigMachineGroups", DescribeConfigMachineGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a collection rule configuration.
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeConfigs", DescribeConfigsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a shipping task.
     * @param req DescribeConsumerRequest
     * @return DescribeConsumerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConsumerResponse DescribeConsumer(DescribeConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeConsumer", DescribeConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get COS import configuration.
     * @param req DescribeCosRechargesRequest
     * @return DescribeCosRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCosRechargesResponse DescribeCosRecharges(DescribeCosRechargesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCosRechargesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCosRecharges", DescribeCosRechargesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the basic information of data processing tasks.
     * @param req DescribeDataTransformInfoRequest
     * @return DescribeDataTransformInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataTransformInfoResponse DescribeDataTransformInfo(DescribeDataTransformInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataTransformInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDataTransformInfo", DescribeDataTransformInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of log download tasks.
     * @param req DescribeExportsRequest
     * @return DescribeExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportsResponse DescribeExports(DescribeExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExportsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeExports", DescribeExportsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the index configuration information.
     * @param req DescribeIndexRequest
     * @return DescribeIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexResponse DescribeIndex(DescribeIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIndex", DescribeIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of Kafka data subscription tasks.
     * @param req DescribeKafkaRechargesRequest
     * @return DescribeKafkaRechargesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKafkaRechargesResponse DescribeKafkaRecharges(DescribeKafkaRechargesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKafkaRechargesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeKafkaRecharges", DescribeKafkaRechargesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to search for content in the log context.
     * @param req DescribeLogContextRequest
     * @return DescribeLogContextResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogContextResponse DescribeLogContext(DescribeLogContextRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogContextResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLogContext", DescribeLogContextResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a log count histogram. 
     * @param req DescribeLogHistogramRequest
     * @return DescribeLogHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogHistogramResponse DescribeLogHistogram(DescribeLogHistogramRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogHistogramResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLogHistogram", DescribeLogHistogramResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of logsets.
     * @param req DescribeLogsetsRequest
     * @return DescribeLogsetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsetsResponse DescribeLogsets(DescribeLogsetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogsetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLogsets", DescribeLogsetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the collection rule configuration bound to a machine group.
     * @param req DescribeMachineGroupConfigsRequest
     * @return DescribeMachineGroupConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupConfigsResponse DescribeMachineGroupConfigs(DescribeMachineGroupConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGroupConfigsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMachineGroupConfigs", DescribeMachineGroupConfigsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of machine groups.
     * @param req DescribeMachineGroupsRequest
     * @return DescribeMachineGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineGroupsResponse DescribeMachineGroups(DescribeMachineGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMachineGroups", DescribeMachineGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the machine status in the specified machine group.
     * @param req DescribeMachinesRequest
     * @return DescribeMachinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachinesResponse DescribeMachines(DescribeMachinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeMachines", DescribeMachinesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of topic partitions.
     * @param req DescribePartitionsRequest
     * @return DescribePartitionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePartitionsResponse DescribePartitions(DescribePartitionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePartitionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribePartitions", DescribePartitionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of shipping tasks.
     * @param req DescribeShipperTasksRequest
     * @return DescribeShipperTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShipperTasksResponse DescribeShipperTasks(DescribeShipperTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShipperTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeShipperTasks", DescribeShipperTasksResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the configuration of the task of shipping to COS.
     * @param req DescribeShippersRequest
     * @return DescribeShippersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeShippersResponse DescribeShippers(DescribeShippersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeShippersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeShippers", DescribeShippersResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the list of log topics and supports pagination.
     * @param req DescribeTopicsRequest
     * @return DescribeTopicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicsResponse DescribeTopics(DescribeTopicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTopics", DescribeTopicsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the records of alarm tasks.
     * @param req GetAlarmLogRequest
     * @return GetAlarmLogResponse
     * @throws TencentCloudSDKException
     */
    public GetAlarmLogResponse GetAlarmLog(GetAlarmLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAlarmLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetAlarmLog", GetAlarmLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to merge a topic partition in read/write state. During merge, a topic partition ID can be specified, and CLS will automatically merge the partition adjacent to the right of the range.
     * @param req MergePartitionRequest
     * @return MergePartitionResponse
     * @throws TencentCloudSDKException
     */
    public MergePartitionResponse MergePartition(MergePartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MergePartitionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "MergePartition", MergePartitionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an alarm policy. At least one valid configuration item needs to be modified.
     * @param req ModifyAlarmRequest
     * @return ModifyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmResponse ModifyAlarm(ModifyAlarmRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAlarm", ModifyAlarmResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a notification group.
     * @param req ModifyAlarmNoticeRequest
     * @return ModifyAlarmNoticeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmNoticeResponse ModifyAlarmNotice(ModifyAlarmNoticeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmNoticeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAlarmNotice", ModifyAlarmNoticeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a collection rule configuration.
     * @param req ModifyConfigRequest
     * @return ModifyConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigResponse ModifyConfig(ModifyConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConfigResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyConfig", ModifyConfigResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a shipping task.
     * @param req ModifyConsumerRequest
     * @return ModifyConsumerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConsumerResponse ModifyConsumer(ModifyConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyConsumer", ModifyConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a COS import task.
     * @param req ModifyCosRechargeRequest
     * @return ModifyCosRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCosRechargeResponse ModifyCosRecharge(ModifyCosRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCosRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCosRecharge", ModifyCosRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a data processing task.
     * @param req ModifyDataTransformRequest
     * @return ModifyDataTransformResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataTransformResponse ModifyDataTransform(ModifyDataTransformRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDataTransformResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDataTransform", ModifyDataTransformResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the index configuration. It is subject to the default request frequency limit, and the number of concurrent requests to the same log topic cannot exceed 1, i.e., the index configuration of only one log topic can be modified at a time.

     * @param req ModifyIndexRequest
     * @return ModifyIndexResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIndexResponse ModifyIndex(ModifyIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyIndex", ModifyIndexResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a Kafka data subscription task.
     * @param req ModifyKafkaRechargeRequest
     * @return ModifyKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyKafkaRechargeResponse ModifyKafkaRecharge(ModifyKafkaRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyKafkaRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyKafkaRecharge", ModifyKafkaRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a logset.
     * @param req ModifyLogsetRequest
     * @return ModifyLogsetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogsetResponse ModifyLogset(ModifyLogsetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogsetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyLogset", ModifyLogsetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a machine group.
     * @param req ModifyMachineGroupRequest
     * @return ModifyMachineGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMachineGroupResponse ModifyMachineGroup(ModifyMachineGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMachineGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyMachineGroup", ModifyMachineGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify an existing shipping rule. To use this API, you need to grant CLS the write permission of the specified bucket.
     * @param req ModifyShipperRequest
     * @return ModifyShipperResponse
     * @throws TencentCloudSDKException
     */
    public ModifyShipperResponse ModifyShipper(ModifyShipperRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyShipperResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyShipper", ModifyShipperResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a log topic.
     * @param req ModifyTopicRequest
     * @return ModifyTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicResponse ModifyTopic(ModifyTopicRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyTopic", ModifyTopicResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable the Kafka consumption feature.
     * @param req OpenKafkaConsumerRequest
     * @return OpenKafkaConsumerResponse
     * @throws TencentCloudSDKException
     */
    public OpenKafkaConsumerResponse OpenKafkaConsumer(OpenKafkaConsumerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OpenKafkaConsumerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "OpenKafkaConsumer", OpenKafkaConsumerResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to preview the logs of Kafka data subscription tasks.
     * @param req PreviewKafkaRechargeRequest
     * @return PreviewKafkaRechargeResponse
     * @throws TencentCloudSDKException
     */
    public PreviewKafkaRechargeResponse PreviewKafkaRecharge(PreviewKafkaRechargeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PreviewKafkaRechargeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "PreviewKafkaRecharge", PreviewKafkaRechargeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to retry a failed shipping task.
     * @param req RetryShipperTaskRequest
     * @return RetryShipperTaskResponse
     * @throws TencentCloudSDKException
     */
    public RetryShipperTaskResponse RetryShipperTask(RetryShipperTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetryShipperTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RetryShipperTask", RetryShipperTaskResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to search logs. It is subject to the default API rate limit, and the number of concurrent queries to the same log topic cannot exceed 15.
     * @param req SearchLogRequest
     * @return SearchLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchLogResponse SearchLog(SearchLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SearchLog", SearchLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to split a topic partition.
     * @param req SplitPartitionRequest
     * @return SplitPartitionResponse
     * @throws TencentCloudSDKException
     */
    public SplitPartitionResponse SplitPartition(SplitPartitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SplitPartitionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SplitPartition", SplitPartitionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *## Note
To ensure log data reliability and help you use CLS more efficiently, we recommend you use the optimized API to upload logs. For more information about the API, see [Uploading Log via API](https://intl.cloud.tencent.com/document/product/614/16873?from_cn_redirect=1).

For the optimized API, we have developed an SDK (available in multiple languages) that provides features including async sending, resource control, automatic retry, graceful shutdown, and detection-based reporting. For details, see [Uploading Log via SDK](https://intl.cloud.tencent.com/document/product/614/67157?from_cn_redirect=1).

`UploadLog` allows you to synchronously upload log data. If you still want to continue to use this API instead of the optimized one, read this document.

## Feature Description

This API is used to write logs to a specified log topic.

CLS provides the following two modes:

#### Load balancing mode

In this mode, logs will be automatically written to a target partition among all readable/writable partitions under the current log topic based on the load balancing principle. This mode is suitable for scenarios where sequential consumption is not needed.

#### Hash routing mode

In this mode, data will be written to a target partition that meets the range requirements based on the carried hash value (`X-CLS-HashKey`). For example, a log source can be bound to a topic partition through `HashKey`, strictly guaranteeing the sequence of the data written to and consumed in this partition.

                 

#### Input parameters (pb binary streams in `body`)

| Parameter       | Type    | Location | Required | Description                                                         |
| ------------ | ------- | ---- | ---- | ------------------------------------------------------------ |
| logGroupList | message | pb   | Yes   | The `logGroup` list, which describes the encapsulated log groups. We recommend you enter up to five `logGroup` values. |

`LogGroup` description:

| Parameter      | Required | Description                                                         |
| ----------- | -------- | ------------------------------------------------------------ |
| logs        | Yes       | Log array consisting of multiple `Log` values. The `Log` indicates a log, and a `LogGroup` can contain up to 10,000 `Log` values. |
| contextFlow | No       | Unique `LogGroup` ID, which should be passed in if the context feature needs to be used. Format: "{Context ID}-{LogGroupID}". <br>Context ID: Uniquely identifies the context (a series of log files that are continuously scrolling or a series of logs that need to be sequenced), which is a 64-bit integer hex string. <br>LogGroupID: A 64-bit integer hex string that continuously increases, such as `102700A66102516A-59F59`.                        |
| filename    | No       | Log filename                                                   |
| source      | No       | Log source, which is generally the machine IP                           |
| logTags     | No       | List of log tags                                               |

`Log` description:

| Parameter   | Required | Description                                                         |
| -------- | -------- | ------------------------------------------------------------ |
| time     | Yes       | Unix timestamp of log time in seconds or milliseconds (recommended)      |
| contents | No       | Log content in key-value format. A log can contain multiple key-value pairs. |

`Content` description:

| Parameter | Required | Description                                                         |
| ------ | -------- | ------------------------------------------------------------ |
| key    | Yes       | Key of a field group in one log, which cannot start with `_`.                 |
| value  | Yes       | Value of a field group. The `value` of one log cannot exceed 1 MB and the total `value` in `LogGroup` cannot exceed 5 MB. |

`LogTag` description:

| Parameter | Required | Description                             |
| ------ | -------- | -------------------------------- |
| key    | Yes       | Key of a custom tag                 |
| value  | Yes       | Value corresponding to the custom tag key |

## pb Compilation Example

This example shows you how to use the protoc compiler to compile a pb description file into a log upload API in C++.

> ?Currently, protoc supports compilation in multiple programming languages such as Java, C++, and Python. For more information, see [protoc](https://github.com/protocolbuffers/protobuf).

#### 1. Install Protocol Buffers

Download [Protocol Buffers](https://main.qcloudimg.com/raw/d7810aaf8b3073fbbc9d4049c21532aa/protobuf-2.6.1.tar.gz), decompress the package, and install the tool. The version used in the example is protobuf 2.6.1 running on CentOS 7.3. Run the following command to decompress the `protobuf-2.6.1.tar.gz` package to the `/usr/local` directory and go to the directory:

```
tar -zxvf protobuf-2.6.1.tar.gz -C /usr/local/ && cd /usr/local/protobuf-2.6.1
```

Run the following commands to start compilation and installation and configure the environment variables:

```
[root@VM_0_8_centos protobuf-2.6.1]# ./configure 
[root@VM_0_8_centos protobuf-2.6.1]# make && make install
[root@VM_0_8_centos protobuf-2.6.1]# export PATH=$PATH:/usr/local/protobuf-2.6.1/bin
```

After the compilation succeeds, run the following command to check the version:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --version
liprotoc 2.6.1
```

#### 2. Create a pb description file

A pb description file is an agreed-on data interchange format for communication. To upload logs, compile the specified protocol format to an API in the target programming language and add the API to the project code. For more information, see [protoc](https://github.com/protocolbuffers/protobuf).

Create a pb message description file `cls.proto` based on the pb data format content specified by CLS.

> !The pb description file content cannot be modified, and the filename must end with `.proto`.

The content of `cls.proto` (pb description file) is as follows:

```
package cls;

message Log
{
    message Content
    {
        required string key   = 1; // Key of each field group
        required string value = 2; // Value of each field group
    }
    required int64   time     = 1; // Unix timestamp
    repeated Content contents = 2; // Multiple key-value pairs in one log
}

message LogTag
{
    required string key       = 1;
    required string value     = 2;
}

message LogGroup
{
    repeated Log    logs        = 1; // Log array consisting of multiple logs
    optional string contextFlow = 2; // This parameter does not take effect currently
    optional string filename    = 3; // Log filename
    optional string source      = 4; // Log source, which is generally the machine IP
    repeated LogTag logTags     = 5;
}

message LogGroupList
{
    repeated LogGroup logGroupList = 1; // Log group list
}
```

#### 3. Compile and generate the API

This example uses the proto compiler to generate a C++ file in the same directory as the `cls.proto` file. Run the following compilation command:

```
protoc --cpp_out=./ ./cls.proto 
```

> ?`--cpp_out=./` indicates that the file will be compiled in cpp format and output to the current directory. `./cls.proto` indicates the `cls.proto` description file in the current directory.

After the compilation succeeds, the code file in the corresponding programming language will be generated. This example generates the `cls.pb.h` header file and [cls.pb.cc](http://cls.pb.cc) code implementation file as shown below:

```
[root@VM_0_8_centos protobuf-2.6.1]# protoc --cpp_out=./ ./cls.proto
[root@VM_0_8_centos protobuf-2.6.1]# ls
cls.pb.cc cls.pb.h cls.proto
```

#### 4. Call the API

Import the generated `cls.pb.h` header file into the code and call the API for data encapsulation.
     * @param req UploadLogRequest
     * @return UploadLogResponse
     * @throws TencentCloudSDKException
     */
    public UploadLogResponse UploadLog(UploadLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UploadLog", UploadLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
