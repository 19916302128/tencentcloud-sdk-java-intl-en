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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyCardVerificationResponse extends AbstractModel {

    /**
    * The token used to identify an verification process. It can be used to get the verification result after the process is completed.
    */
    @SerializedName("CardVerificationToken")
    @Expose
    private String CardVerificationToken;

    /**
    * The maximum number of polls for calling the pull result interface polling.
    */
    @SerializedName("AsyncCardVerificationMaxPollingTimes")
    @Expose
    private Long AsyncCardVerificationMaxPollingTimes;

    /**
    * The interval for polling when calling the pull result interface (in seconds).
    */
    @SerializedName("AsyncCardVerificationPollingWaitTime")
    @Expose
    private Long AsyncCardVerificationPollingWaitTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The token used to identify an verification process. It can be used to get the verification result after the process is completed. 
     * @return CardVerificationToken The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     */
    public String getCardVerificationToken() {
        return this.CardVerificationToken;
    }

    /**
     * Set The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     * @param CardVerificationToken The token used to identify an verification process. It can be used to get the verification result after the process is completed.
     */
    public void setCardVerificationToken(String CardVerificationToken) {
        this.CardVerificationToken = CardVerificationToken;
    }

    /**
     * Get The maximum number of polls for calling the pull result interface polling. 
     * @return AsyncCardVerificationMaxPollingTimes The maximum number of polls for calling the pull result interface polling.
     */
    public Long getAsyncCardVerificationMaxPollingTimes() {
        return this.AsyncCardVerificationMaxPollingTimes;
    }

    /**
     * Set The maximum number of polls for calling the pull result interface polling.
     * @param AsyncCardVerificationMaxPollingTimes The maximum number of polls for calling the pull result interface polling.
     */
    public void setAsyncCardVerificationMaxPollingTimes(Long AsyncCardVerificationMaxPollingTimes) {
        this.AsyncCardVerificationMaxPollingTimes = AsyncCardVerificationMaxPollingTimes;
    }

    /**
     * Get The interval for polling when calling the pull result interface (in seconds). 
     * @return AsyncCardVerificationPollingWaitTime The interval for polling when calling the pull result interface (in seconds).
     */
    public Long getAsyncCardVerificationPollingWaitTime() {
        return this.AsyncCardVerificationPollingWaitTime;
    }

    /**
     * Set The interval for polling when calling the pull result interface (in seconds).
     * @param AsyncCardVerificationPollingWaitTime The interval for polling when calling the pull result interface (in seconds).
     */
    public void setAsyncCardVerificationPollingWaitTime(Long AsyncCardVerificationPollingWaitTime) {
        this.AsyncCardVerificationPollingWaitTime = AsyncCardVerificationPollingWaitTime;
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

    public ApplyCardVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyCardVerificationResponse(ApplyCardVerificationResponse source) {
        if (source.CardVerificationToken != null) {
            this.CardVerificationToken = new String(source.CardVerificationToken);
        }
        if (source.AsyncCardVerificationMaxPollingTimes != null) {
            this.AsyncCardVerificationMaxPollingTimes = new Long(source.AsyncCardVerificationMaxPollingTimes);
        }
        if (source.AsyncCardVerificationPollingWaitTime != null) {
            this.AsyncCardVerificationPollingWaitTime = new Long(source.AsyncCardVerificationPollingWaitTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardVerificationToken", this.CardVerificationToken);
        this.setParamSimple(map, prefix + "AsyncCardVerificationMaxPollingTimes", this.AsyncCardVerificationMaxPollingTimes);
        this.setParamSimple(map, prefix + "AsyncCardVerificationPollingWaitTime", this.AsyncCardVerificationPollingWaitTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

