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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceResponse extends AbstractModel {

    /**
    * Freezing transaction ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TranId")
    @Expose
    private String TranId;

    /**
    * Big order ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BigDealIds")
    @Expose
    private String [] BigDealIds;

    /**
    * Order ID
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Freezing transaction ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TranId Freezing transaction ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTranId() {
        return this.TranId;
    }

    /**
     * Set Freezing transaction ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TranId Freezing transaction ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTranId(String TranId) {
        this.TranId = TranId;
    }

    /**
     * Get Big order ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BigDealIds Big order ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBigDealIds() {
        return this.BigDealIds;
    }

    /**
     * Set Big order ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BigDealIds Big order ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBigDealIds(String [] BigDealIds) {
        this.BigDealIds = BigDealIds;
    }

    /**
     * Get Order ID 
     * @return DealNames Order ID
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set Order ID
     * @param DealNames Order ID
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
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

    public UpgradeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceResponse(UpgradeInstanceResponse source) {
        if (source.TranId != null) {
            this.TranId = new String(source.TranId);
        }
        if (source.BigDealIds != null) {
            this.BigDealIds = new String[source.BigDealIds.length];
            for (int i = 0; i < source.BigDealIds.length; i++) {
                this.BigDealIds[i] = new String(source.BigDealIds[i]);
            }
        }
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
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
        this.setParamSimple(map, prefix + "TranId", this.TranId);
        this.setParamArraySimple(map, prefix + "BigDealIds.", this.BigDealIds);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

