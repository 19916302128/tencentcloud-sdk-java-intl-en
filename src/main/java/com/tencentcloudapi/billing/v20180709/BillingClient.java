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
package com.tencentcloudapi.billing.v20180709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.billing.v20180709.models.*;

public class BillingClient extends AbstractClient{
    private static String endpoint = "billing.tencentcloudapi.com";
    private static String service = "billing";
    private static String version = "2018-07-09";
    
    public BillingClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BillingClient(Credential credential, String region, ClientProfile profile) {
        super(BillingClient.endpoint, BillingClient.version, credential, region, profile);
    }

    /**
     *This API is used to check the Tencent Cloud account balance.
     * @param req DescribeAccountBalanceRequest
     * @return DescribeAccountBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountBalanceResponse DescribeAccountBalance(DescribeAccountBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountBalanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccountBalance", DescribeAccountBalanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get bill details. 
Notes: 1. The API request may fail due to network instability or other network exceptions. In this case, we recommend you manually retry the request when the API request fails. 2. If the volume of your bill data is high (for example, if over 200 thousand bill entries are generated for a month), querying bill data via APIs may be slow. We recommend you enable bill storage so that you can obtain bill files from COS buckets for analysis. For details, see [Saving Bills to COS](https://intl.cloud.tencent.com/document/product/555/61275?from_cn_redirect=1).
     * @param req DescribeBillDetailRequest
     * @return DescribeBillDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillDetailResponse DescribeBillDetail(DescribeBillDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillDetail", DescribeBillDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query bill resources summary.
     * @param req DescribeBillResourceSummaryRequest
     * @return DescribeBillResourceSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillResourceSummaryResponse DescribeBillResourceSummary(DescribeBillResourceSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillResourceSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillResourceSummary", DescribeBillResourceSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get bill details by product, project, region, billing mode, and tag by passing in parameters.
     * @param req DescribeBillSummaryRequest
     * @return DescribeBillSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryResponse DescribeBillSummary(DescribeBillSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummary", DescribeBillSummaryResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the bill summarized by billing mode.
     * @param req DescribeBillSummaryByPayModeRequest
     * @return DescribeBillSummaryByPayModeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByPayModeResponse DescribeBillSummaryByPayMode(DescribeBillSummaryByPayModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByPayModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByPayMode", DescribeBillSummaryByPayModeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Gets the bill summarized according to product
     * @param req DescribeBillSummaryByProductRequest
     * @return DescribeBillSummaryByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProductResponse DescribeBillSummaryByProduct(DescribeBillSummaryByProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByProductResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByProduct", DescribeBillSummaryByProductResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Gets the bill summarized according to project
     * @param req DescribeBillSummaryByProjectRequest
     * @return DescribeBillSummaryByProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByProjectResponse DescribeBillSummaryByProject(DescribeBillSummaryByProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByProjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByProject", DescribeBillSummaryByProjectResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *Gets the bill summarized according to region
     * @param req DescribeBillSummaryByRegionRequest
     * @return DescribeBillSummaryByRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByRegionResponse DescribeBillSummaryByRegion(DescribeBillSummaryByRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByRegion", DescribeBillSummaryByRegionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get the cost distribution over different tags.
     * @param req DescribeBillSummaryByTagRequest
     * @return DescribeBillSummaryByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillSummaryByTagResponse DescribeBillSummaryByTag(DescribeBillSummaryByTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillSummaryByTagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBillSummaryByTag", DescribeBillSummaryByTagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query COS usage details.
     * @param req DescribeDosageCosDetailByDateRequest
     * @return DescribeDosageCosDetailByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDosageCosDetailByDateResponse DescribeDosageCosDetailByDate(DescribeDosageCosDetailByDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDosageCosDetailByDateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDosageCosDetailByDate", DescribeDosageCosDetailByDateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query vouchers.
     * @param req DescribeVoucherInfoRequest
     * @return DescribeVoucherInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherInfoResponse DescribeVoucherInfo(DescribeVoucherInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVoucherInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVoucherInfo", DescribeVoucherInfoResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query voucher usage details.
     * @param req DescribeVoucherUsageDetailsRequest
     * @return DescribeVoucherUsageDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVoucherUsageDetailsResponse DescribeVoucherUsageDetails(DescribeVoucherUsageDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVoucherUsageDetailsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVoucherUsageDetails", DescribeVoucherUsageDetailsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
