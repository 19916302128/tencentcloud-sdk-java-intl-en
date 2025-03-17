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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLabelValuesResponse extends AbstractModel {

    /**
    * Array of label values.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LabelValueSet")
    @Expose
    private String [] LabelValueSet;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Array of label values.

Note: This field may return null, indicating that no valid value is found. 
     * @return LabelValueSet Array of label values.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getLabelValueSet() {
        return this.LabelValueSet;
    }

    /**
     * Set Array of label values.

Note: This field may return null, indicating that no valid value is found.
     * @param LabelValueSet Array of label values.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabelValueSet(String [] LabelValueSet) {
        this.LabelValueSet = LabelValueSet;
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

    public DescribeLabelValuesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLabelValuesResponse(DescribeLabelValuesResponse source) {
        if (source.LabelValueSet != null) {
            this.LabelValueSet = new String[source.LabelValueSet.length];
            for (int i = 0; i < source.LabelValueSet.length; i++) {
                this.LabelValueSet[i] = new String(source.LabelValueSet[i]);
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
        this.setParamArraySimple(map, prefix + "LabelValueSet.", this.LabelValueSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

