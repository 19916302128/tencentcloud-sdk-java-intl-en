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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetCheckModeResponse extends AbstractModel {

    /**
    * Valid values: `Succ` (set successfully); `Failed` (failed to set).
    */
    @SerializedName("SetCheckResult")
    @Expose
    private String SetCheckResult;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Valid values: `Succ` (set successfully); `Failed` (failed to set). 
     * @return SetCheckResult Valid values: `Succ` (set successfully); `Failed` (failed to set).
     */
    public String getSetCheckResult() {
        return this.SetCheckResult;
    }

    /**
     * Set Valid values: `Succ` (set successfully); `Failed` (failed to set).
     * @param SetCheckResult Valid values: `Succ` (set successfully); `Failed` (failed to set).
     */
    public void setSetCheckResult(String SetCheckResult) {
        this.SetCheckResult = SetCheckResult;
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

    public SetCheckModeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetCheckModeResponse(SetCheckModeResponse source) {
        if (source.SetCheckResult != null) {
            this.SetCheckResult = new String(source.SetCheckResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SetCheckResult", this.SetCheckResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

