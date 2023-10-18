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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationInfosResponse extends AbstractModel {

    /**
    * Application list.
    */
    @SerializedName("ApplicationInfos")
    @Expose
    private ApplicationItem [] ApplicationInfos;

    /**
    * Specifies whether all applications are included. The value 0 indicates no and 1 indicates yes.
    */
    @SerializedName("AllOption")
    @Expose
    private Long AllOption;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Application list. 
     * @return ApplicationInfos Application list.
     */
    public ApplicationItem [] getApplicationInfos() {
        return this.ApplicationInfos;
    }

    /**
     * Set Application list.
     * @param ApplicationInfos Application list.
     */
    public void setApplicationInfos(ApplicationItem [] ApplicationInfos) {
        this.ApplicationInfos = ApplicationInfos;
    }

    /**
     * Get Specifies whether all applications are included. The value 0 indicates no and 1 indicates yes. 
     * @return AllOption Specifies whether all applications are included. The value 0 indicates no and 1 indicates yes.
     */
    public Long getAllOption() {
        return this.AllOption;
    }

    /**
     * Set Specifies whether all applications are included. The value 0 indicates no and 1 indicates yes.
     * @param AllOption Specifies whether all applications are included. The value 0 indicates no and 1 indicates yes.
     */
    public void setAllOption(Long AllOption) {
        this.AllOption = AllOption;
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

    public DescribeApplicationInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationInfosResponse(DescribeApplicationInfosResponse source) {
        if (source.ApplicationInfos != null) {
            this.ApplicationInfos = new ApplicationItem[source.ApplicationInfos.length];
            for (int i = 0; i < source.ApplicationInfos.length; i++) {
                this.ApplicationInfos[i] = new ApplicationItem(source.ApplicationInfos[i]);
            }
        }
        if (source.AllOption != null) {
            this.AllOption = new Long(source.AllOption);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ApplicationInfos.", this.ApplicationInfos);
        this.setParamSimple(map, prefix + "AllOption", this.AllOption);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

