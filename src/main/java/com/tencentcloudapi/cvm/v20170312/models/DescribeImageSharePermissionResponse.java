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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageSharePermissionResponse extends AbstractModel {

    /**
    * Information on image sharing.
    */
    @SerializedName("SharePermissionSet")
    @Expose
    private SharePermission [] SharePermissionSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information on image sharing. 
     * @return SharePermissionSet Information on image sharing.
     */
    public SharePermission [] getSharePermissionSet() {
        return this.SharePermissionSet;
    }

    /**
     * Set Information on image sharing.
     * @param SharePermissionSet Information on image sharing.
     */
    public void setSharePermissionSet(SharePermission [] SharePermissionSet) {
        this.SharePermissionSet = SharePermissionSet;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageSharePermissionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageSharePermissionResponse(DescribeImageSharePermissionResponse source) {
        if (source.SharePermissionSet != null) {
            this.SharePermissionSet = new SharePermission[source.SharePermissionSet.length];
            for (int i = 0; i < source.SharePermissionSet.length; i++) {
                this.SharePermissionSet[i] = new SharePermission(source.SharePermissionSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SharePermissionSet.", this.SharePermissionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

