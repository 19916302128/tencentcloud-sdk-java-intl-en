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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCSRSetResponse extends AbstractModel{

    /**
    * The total number of CSRs.	
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The list of CSRs.
    */
    @SerializedName("Set")
    @Expose
    private CSRItem [] Set;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The total number of CSRs.	 
     * @return Total The total number of CSRs.	
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total number of CSRs.	
     * @param Total The total number of CSRs.	
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get The list of CSRs. 
     * @return Set The list of CSRs.
     */
    public CSRItem [] getSet() {
        return this.Set;
    }

    /**
     * Set The list of CSRs.
     * @param Set The list of CSRs.
     */
    public void setSet(CSRItem [] Set) {
        this.Set = Set;
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

    public DescribeCSRSetResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSRSetResponse(DescribeCSRSetResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Set != null) {
            this.Set = new CSRItem[source.Set.length];
            for (int i = 0; i < source.Set.length; i++) {
                this.Set[i] = new CSRItem(source.Set[i]);
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
        this.setParamArrayObj(map, prefix + "Set.", this.Set);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

