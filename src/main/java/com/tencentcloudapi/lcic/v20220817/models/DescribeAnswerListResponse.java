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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAnswerListResponse extends AbstractModel{

    /**
    * The total number of answers.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * A list of the answers.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AnswerInfo")
    @Expose
    private AnswerInfo [] AnswerInfo;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of answers. 
     * @return Total The total number of answers.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of answers.
     * @param Total The total number of answers.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get A list of the answers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AnswerInfo A list of the answers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AnswerInfo [] getAnswerInfo() {
        return this.AnswerInfo;
    }

    /**
     * Set A list of the answers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AnswerInfo A list of the answers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAnswerInfo(AnswerInfo [] AnswerInfo) {
        this.AnswerInfo = AnswerInfo;
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

    public DescribeAnswerListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnswerListResponse(DescribeAnswerListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AnswerInfo != null) {
            this.AnswerInfo = new AnswerInfo[source.AnswerInfo.length];
            for (int i = 0; i < source.AnswerInfo.length; i++) {
                this.AnswerInfo[i] = new AnswerInfo(source.AnswerInfo[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "AnswerInfo.", this.AnswerInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
