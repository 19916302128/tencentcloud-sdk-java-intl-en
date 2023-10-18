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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvokerRecordsResponse extends AbstractModel {

    /**
    * Number of matching records.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Execution history of an invoker.
    */
    @SerializedName("InvokerRecordSet")
    @Expose
    private InvokerRecord [] InvokerRecordSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of matching records. 
     * @return TotalCount Number of matching records.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of matching records.
     * @param TotalCount Number of matching records.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Execution history of an invoker. 
     * @return InvokerRecordSet Execution history of an invoker.
     */
    public InvokerRecord [] getInvokerRecordSet() {
        return this.InvokerRecordSet;
    }

    /**
     * Set Execution history of an invoker.
     * @param InvokerRecordSet Execution history of an invoker.
     */
    public void setInvokerRecordSet(InvokerRecord [] InvokerRecordSet) {
        this.InvokerRecordSet = InvokerRecordSet;
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

    public DescribeInvokerRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvokerRecordsResponse(DescribeInvokerRecordsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InvokerRecordSet != null) {
            this.InvokerRecordSet = new InvokerRecord[source.InvokerRecordSet.length];
            for (int i = 0; i < source.InvokerRecordSet.length; i++) {
                this.InvokerRecordSet[i] = new InvokerRecord(source.InvokerRecordSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InvokerRecordSet.", this.InvokerRecordSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

