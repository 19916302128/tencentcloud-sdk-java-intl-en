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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTablesResponse extends AbstractModel{

    /**
    * Number of tables created in batches
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of tables created in batches
    */
    @SerializedName("TableResults")
    @Expose
    private TableResultNew [] TableResults;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of tables created in batches 
     * @return TotalCount Number of tables created in batches
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of tables created in batches
     * @param TotalCount Number of tables created in batches
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of tables created in batches 
     * @return TableResults List of tables created in batches
     */
    public TableResultNew [] getTableResults() {
        return this.TableResults;
    }

    /**
     * Set List of tables created in batches
     * @param TableResults List of tables created in batches
     */
    public void setTableResults(TableResultNew [] TableResults) {
        this.TableResults = TableResults;
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

    public CreateTablesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTablesResponse(CreateTablesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TableResults != null) {
            this.TableResults = new TableResultNew[source.TableResults.length];
            for (int i = 0; i < source.TableResults.length; i++) {
                this.TableResults[i] = new TableResultNew(source.TableResults[i]);
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
        this.setParamArrayObj(map, prefix + "TableResults.", this.TableResults);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

