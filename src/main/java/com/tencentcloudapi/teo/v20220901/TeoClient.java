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
package com.tencentcloudapi.teo.v20220901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220901.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-09-01";

    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *This API is used to bind a site to a plan.
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindZoneToPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindZoneToPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindZoneToPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify a certificate.
     * @param req CheckCertificateRequest
     * @return CheckCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CheckCertificateResponse CheckCertificate(CheckCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to connect a domain to EdgeOne.
     * @param req CreateAccelerationDomainRequest
     * @return CreateAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccelerationDomainResponse CreateAccelerationDomain(CreateAccelerationDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccelerationDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccelerationDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccelerationDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an alias domain name.
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an application proxy.
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an application proxy rule.
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Creates a credential for COS origin-pull.
     * @param req CreateCredentialRequest
     * @return CreateCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCredentialResponse CreateCredential(CreateCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create an origin group.
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to purchase a plan for a new site.
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePlanForZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePlanForZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePlanForZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a pre-warming task.
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrefetchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrefetchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrefetchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a cache purging task.
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePurgeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePurgeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePurgeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a replay task for purging or pre-warming URLs.
     * @param req CreateReplayTaskRequest
     * @return CreateReplayTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplayTaskResponse CreateReplayTask(CreateReplayTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReplayTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReplayTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReplayTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a rule in the rule engine.
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a site testing task for a specified domain name.
     * @param req CreateSpeedTestingRequest
     * @return CreateSpeedTestingResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpeedTestingResponse CreateSpeedTesting(CreateSpeedTestingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSpeedTestingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSpeedTestingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSpeedTesting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to access a new site.
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch remove accelerated domain names.
     * @param req DeleteAccelerationDomainsRequest
     * @return DeleteAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccelerationDomainsResponse DeleteAccelerationDomains(DeleteAccelerationDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccelerationDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccelerationDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccelerationDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an alias domain name.
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an application proxy.
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an application proxy rule.
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete an origin group.
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch delete rules from the rule engine.
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete a site.
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query accelerated domain names. Paging, sorting and filtering are supported.
     * @param req DescribeAccelerationDomainsRequest
     * @return DescribeAccelerationDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccelerationDomainsResponse DescribeAccelerationDomains(DescribeAccelerationDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccelerationDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccelerationDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccelerationDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query available shipping entities.
     * @param req DescribeAddableEntityListRequest
     * @return DescribeAddableEntityListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddableEntityListResponse DescribeAddableEntityList(DescribeAddableEntityListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddableEntityListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddableEntityListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddableEntityList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of alias domain names.
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAliasDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAliasDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAliasDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of application proxies.
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationProxiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query plan options available for purchase.
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailablePlansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailablePlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailablePlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of blocked clients.
     * @param req DescribeClientRuleListRequest
     * @return DescribeClientRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientRuleListResponse DescribeClientRuleList(DescribeClientRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientRuleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query content management quotas.
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContentQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContentQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the time-series data of DDoS attacks.
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query DDoS attack events.
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the top-ranked DDoS attack data.
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a list of default certificates.
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultCertificatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultCertificatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultCertificates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get DNS requests.
     * @param req DescribeDnsDataRequest
     * @return DescribeDnsDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsDataResponse DescribeDnsData(DescribeDnsDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDnsDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDnsDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDnsData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query detailed domain name configuration.
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostsSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the verification information of a site.
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdentificationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIdentificationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIdentifications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a list of logsets.
     * @param req DescribeLogSetsRequest
     * @return DescribeLogSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSetsResponse DescribeLogSets(DescribeLogSetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogSetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogSetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogSets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to get a list of shipping tasks.
     * @param req DescribeLogTopicTasksRequest
     * @return DescribeLogTopicTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTopicTasksResponse DescribeLogTopicTasks(DescribeLogTopicTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogTopicTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogTopicTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogTopicTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to obtain a list of origin groups.
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the origin protection configuration.
     * @param req DescribeOriginProtectionRequest
     * @return DescribeOriginProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginProtectionResponse DescribeOriginProtection(DescribeOriginProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOriginProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the L7 traffic summary statistics recorded over time.
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewL7DataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewL7DataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOverviewL7Data");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the pre-warming task status.
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrefetchTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrefetchTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrefetchTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Querying the cache purging history
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the rules in the rule engine.
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to return the list of the settings of the rule engine that can be used for request match and their detailed recommended configuration information.
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRulesSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the statistical calculation result of an L7 traffic metric. In common cases, only one value is returned for the query of statistical calculation results.
     * @param req DescribeSingleL7AnalysisDataRequest
     * @return DescribeSingleL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSingleL7AnalysisDataResponse DescribeSingleL7AnalysisData(DescribeSingleL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSingleL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSingleL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSingleL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the site’s load speed across regions.
     * @param req DescribeSpeedTestingDetailsRequest
     * @return DescribeSpeedTestingDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingDetailsResponse DescribeSpeedTestingDetails(DescribeSpeedTestingDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the result of a site test.
     * @param req DescribeSpeedTestingMetricDataRequest
     * @return DescribeSpeedTestingMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingMetricDataResponse DescribeSpeedTestingMetricData(DescribeSpeedTestingMetricDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingMetricDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingMetricDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingMetricData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the quota limit on site tests.
     * @param req DescribeSpeedTestingQuotaRequest
     * @return DescribeSpeedTestingQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingQuotaResponse DescribeSpeedTestingQuota(DescribeSpeedTestingQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of L4 traffic data recorded over time.
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL4DataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL4DataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL4Data");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the L7 data recorded over time.
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the time-series L7 cached data.
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7CacheDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL7CacheDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL7CacheData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the L7 time-series data of origin-pull.
     * @param req DescribeTimingL7SourceDataRequest
     * @return DescribeTimingL7SourceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7SourceDataResponse DescribeTimingL7SourceData(DescribeTimingL7SourceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7SourceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL7SourceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL7SourceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the top-ranked L7 traffic data.
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the cached L7 top-ranked data.
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7CacheDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopL7CacheDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopL7CacheData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the WAF attack data recorded over time.
     * @param req DescribeWebManagedRulesDataRequest
     * @return DescribeWebManagedRulesDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesDataResponse DescribeWebManagedRulesData(DescribeWebManagedRulesDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a hit WAF security rule.
     * @param req DescribeWebManagedRulesHitRuleDetailRequest
     * @return DescribeWebManagedRulesHitRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesHitRuleDetailResponse DescribeWebManagedRulesHitRuleDetail(DescribeWebManagedRulesHitRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesHitRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesHitRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesHitRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query web attack logs.
     * @param req DescribeWebManagedRulesLogRequest
     * @return DescribeWebManagedRulesLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesLogResponse DescribeWebManagedRulesLog(DescribeWebManagedRulesLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the information of CC attackers.
     * @param req DescribeWebProtectionClientIpListRequest
     * @return DescribeWebProtectionClientIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionClientIpListResponse DescribeWebProtectionClientIpList(DescribeWebProtectionClientIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionClientIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionClientIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionClientIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the CC protection data recorded over time.
     * @param req DescribeWebProtectionDataRequest
     * @return DescribeWebProtectionDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionDataResponse DescribeWebProtectionData(DescribeWebProtectionDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a hit CC protection rule.
     * @param req DescribeWebProtectionHitRuleDetailRequest
     * @return DescribeWebProtectionHitRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionHitRuleDetailResponse DescribeWebProtectionHitRuleDetail(DescribeWebProtectionHitRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionHitRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionHitRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionHitRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the top-ranked CC protection data.
     * @param req DescribeWebProtectionTopDataRequest
     * @return DescribeWebProtectionTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionTopDataResponse DescribeWebProtectionTopData(DescribeWebProtectionTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the site configuration.
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZoneSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of user sites.
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to download L4 logs.
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL4LogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadL4LogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadL4Logs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to download L7 logs.
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL7LogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadL7LogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadL7Logs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to verify ownership of the site.
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IdentifyZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IdentifyZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IdentifyZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an accelerated domain name.
     * @param req ModifyAccelerationDomainRequest
     * @return ModifyAccelerationDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainResponse ModifyAccelerationDomain(ModifyAccelerationDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccelerationDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccelerationDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccelerationDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to batch modify the status of accelerated domains.
     * @param req ModifyAccelerationDomainStatusesRequest
     * @return ModifyAccelerationDomainStatusesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccelerationDomainStatusesResponse ModifyAccelerationDomainStatuses(ModifyAccelerationDomainStatusesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccelerationDomainStatusesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccelerationDomainStatusesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccelerationDomainStatuses");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an alias domain name.
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the status of an alias domain name.
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAliasDomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAliasDomainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an application proxy.
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an application proxy rule.
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the status of an application proxy rule.
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the status of an application proxy.
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This example shows you how to modify the status of a default certificate.
     * @param req ModifyDefaultCertificateRequest
     * @return ModifyDefaultCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultCertificateResponse ModifyDefaultCertificate(ModifyDefaultCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDefaultCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDefaultCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDefaultCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the certificate of a domain name.
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostsCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostsCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostsCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify an origin group.
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a rule in the rule engine.
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the priority of a rule in the rule engine.
     * @param req ModifyRulePriorityRequest
     * @return ModifyRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRulePriorityResponse ModifyRulePriority(ModifyRulePriorityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRulePriorityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRulePriorityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRulePriority");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the web and bot security configurations.
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a managed rule.
     * @param req ModifySecurityWafGroupPolicyRequest
     * @return ModifySecurityWafGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityWafGroupPolicyResponse ModifySecurityWafGroupPolicy(ModifySecurityWafGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityWafGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityWafGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityWafGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify a site.
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to modify the site configuration.
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZoneSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to change the site status.
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZoneStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *To reclaim a site and its associated alias domain names, specify the "ZoneId" field; to reclaim an alias domain name that is already added, specify the "ZoneName" filed.
     * @param req ReclaimAliasDomainRequest
     * @return ReclaimAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ReclaimAliasDomainResponse ReclaimAliasDomain(ReclaimAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReclaimAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReclaimAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReclaimAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reclaim a site from other users after its ownership is verified.
     * @param req ReclaimZoneRequest
     * @return ReclaimZoneResponse
     * @throws TencentCloudSDKException
     */
    public ReclaimZoneResponse ReclaimZone(ReclaimZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReclaimZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReclaimZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReclaimZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the list of intermediate IPs.
     * @param req UpdateOriginProtectionIPWhitelistRequest
     * @return UpdateOriginProtectionIPWhitelistResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOriginProtectionIPWhitelistResponse UpdateOriginProtectionIPWhitelist(UpdateOriginProtectionIPWhitelistRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOriginProtectionIPWhitelistResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOriginProtectionIPWhitelistResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOriginProtectionIPWhitelist");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
