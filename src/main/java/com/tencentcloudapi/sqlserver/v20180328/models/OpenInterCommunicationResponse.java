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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenInterCommunicationResponse extends AbstractModel {

    /**
    * IDs of instance and async task
    */
    @SerializedName("InterInstanceFlowSet")
    @Expose
    private InterInstanceFlow [] InterInstanceFlowSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IDs of instance and async task 
     * @return InterInstanceFlowSet IDs of instance and async task
     */
    public InterInstanceFlow [] getInterInstanceFlowSet() {
        return this.InterInstanceFlowSet;
    }

    /**
     * Set IDs of instance and async task
     * @param InterInstanceFlowSet IDs of instance and async task
     */
    public void setInterInstanceFlowSet(InterInstanceFlow [] InterInstanceFlowSet) {
        this.InterInstanceFlowSet = InterInstanceFlowSet;
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

    public OpenInterCommunicationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenInterCommunicationResponse(OpenInterCommunicationResponse source) {
        if (source.InterInstanceFlowSet != null) {
            this.InterInstanceFlowSet = new InterInstanceFlow[source.InterInstanceFlowSet.length];
            for (int i = 0; i < source.InterInstanceFlowSet.length; i++) {
                this.InterInstanceFlowSet[i] = new InterInstanceFlow(source.InterInstanceFlowSet[i]);
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
        this.setParamArrayObj(map, prefix + "InterInstanceFlowSet.", this.InterInstanceFlowSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

