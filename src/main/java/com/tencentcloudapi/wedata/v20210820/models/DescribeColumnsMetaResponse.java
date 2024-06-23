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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeColumnsMetaResponse extends AbstractModel {

    /**
    * Pagination return
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ColumnMetaSet")
    @Expose
    private ColumnMeta [] ColumnMetaSet;

    /**
    * Number of records
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Pagination return
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ColumnMetaSet Pagination return
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public ColumnMeta [] getColumnMetaSet() {
        return this.ColumnMetaSet;
    }

    /**
     * Set Pagination return
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ColumnMetaSet Pagination return
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setColumnMetaSet(ColumnMeta [] ColumnMetaSet) {
        this.ColumnMetaSet = ColumnMetaSet;
    }

    /**
     * Get Number of records 
     * @return TotalCount Number of records
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of records
     * @param TotalCount Number of records
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeColumnsMetaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeColumnsMetaResponse(DescribeColumnsMetaResponse source) {
        if (source.ColumnMetaSet != null) {
            this.ColumnMetaSet = new ColumnMeta[source.ColumnMetaSet.length];
            for (int i = 0; i < source.ColumnMetaSet.length; i++) {
                this.ColumnMetaSet[i] = new ColumnMeta(source.ColumnMetaSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ColumnMetaSet.", this.ColumnMetaSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

