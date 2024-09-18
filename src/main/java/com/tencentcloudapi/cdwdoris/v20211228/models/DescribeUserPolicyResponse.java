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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserPolicyResponse extends AbstractModel {

    /**
    * Account details
    */
    @SerializedName("AccountInfo")
    @Expose
    private AccountDetailInfo AccountInfo;

    /**
    * Permission configuration information associated with different hosts
    */
    @SerializedName("Permissions")
    @Expose
    private PermissionHostInfo Permissions;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Account details 
     * @return AccountInfo Account details
     */
    public AccountDetailInfo getAccountInfo() {
        return this.AccountInfo;
    }

    /**
     * Set Account details
     * @param AccountInfo Account details
     */
    public void setAccountInfo(AccountDetailInfo AccountInfo) {
        this.AccountInfo = AccountInfo;
    }

    /**
     * Get Permission configuration information associated with different hosts 
     * @return Permissions Permission configuration information associated with different hosts
     */
    public PermissionHostInfo getPermissions() {
        return this.Permissions;
    }

    /**
     * Set Permission configuration information associated with different hosts
     * @param Permissions Permission configuration information associated with different hosts
     */
    public void setPermissions(PermissionHostInfo Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeUserPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserPolicyResponse(DescribeUserPolicyResponse source) {
        if (source.AccountInfo != null) {
            this.AccountInfo = new AccountDetailInfo(source.AccountInfo);
        }
        if (source.Permissions != null) {
            this.Permissions = new PermissionHostInfo(source.Permissions);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountInfo.", this.AccountInfo);
        this.setParamObj(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

