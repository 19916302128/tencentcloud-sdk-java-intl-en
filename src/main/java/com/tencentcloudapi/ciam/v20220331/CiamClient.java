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
package com.tencentcloudapi.ciam.v20220331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ciam.v20220331.models.*;

public class CiamClient extends AbstractClient{
    private static String endpoint = "ciam.tencentcloudapi.com";
    private static String service = "ciam";
    private static String version = "2022-03-31";
    
    public CiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CiamClient(Credential credential, String region, ClientProfile profile) {
        super(CiamClient.endpoint, CiamClient.version, credential, region, profile);
    }

    /**
     *This API is used to create an API for user import task.
     * @param req CreateApiImportUserJobRequest
     * @return CreateApiImportUserJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiImportUserJobResponse CreateApiImportUserJob(CreateApiImportUserJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApiImportUserJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApiImportUserJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApiImportUserJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a file for user export task.
     * @param req CreateFileExportUserJobRequest
     * @return CreateFileExportUserJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileExportUserJobResponse CreateFileExportUserJob(CreateFileExportUserJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileExportUserJobResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileExportUserJobResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFileExportUserJob");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to create a user.
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to delete users in batches.
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the user information with multiple conditions.
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a user by ID.
     * @param req DescribeUserByIdRequest
     * @return DescribeUserByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserByIdResponse DescribeUserById(DescribeUserByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserByIdResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to merge accounts.
     * @param req LinkAccountRequest
     * @return LinkAccountResponse
     * @throws TencentCloudSDKException
     */
    public LinkAccountResponse LinkAccount(LinkAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LinkAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LinkAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LinkAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the details of a task.
     * @param req ListJobsRequest
     * @return ListJobsResponse
     * @throws TencentCloudSDKException
     */
    public ListJobsResponse ListJobs(ListJobsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListJobsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListJobsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListJobs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query a specified log.
     * @param req ListLogMessageByConditionRequest
     * @return ListLogMessageByConditionResponse
     * @throws TencentCloudSDKException
     */
    public ListLogMessageByConditionResponse ListLogMessageByCondition(ListLogMessageByConditionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListLogMessageByConditionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListLogMessageByConditionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListLogMessageByCondition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of users.
     * @param req ListUserRequest
     * @return ListUserResponse
     * @throws TencentCloudSDKException
     */
    public ListUserResponse ListUser(ListUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to query the list of users by attribute.
     * @param req ListUserByPropertyRequest
     * @return ListUserByPropertyResponse
     * @throws TencentCloudSDKException
     */
    public ListUserByPropertyResponse ListUserByProperty(ListUserByPropertyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserByPropertyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListUserByPropertyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUserByProperty");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to reset the password for a user.
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ResetPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to set the password for a user.
     * @param req SetPasswordRequest
     * @return SetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public SetPasswordResponse SetPassword(SetPasswordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetPasswordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SetPasswordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetPassword");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update a user.
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *This API is used to update the status of a user.
     * @param req UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserStatusResponse UpdateUserStatus(UpdateUserStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUserStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
