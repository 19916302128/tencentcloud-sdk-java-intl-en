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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRenewResponse extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Instance ID list
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Price of instance specification in array
    */
    @SerializedName("Prices")
    @Expose
    private TradePrice [] Prices;

    /**
    * Total renewal price of compute node
    */
    @SerializedName("InstanceRealTotalPrice")
    @Expose
    private Long InstanceRealTotalPrice;

    /**
    * Total renewal price of storage node
    */
    @SerializedName("StorageRealTotalPrice")
    @Expose
    private Long StorageRealTotalPrice;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance ID list 
     * @return InstanceIds Instance ID list
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list
     * @param InstanceIds Instance ID list
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Price of instance specification in array 
     * @return Prices Price of instance specification in array
     */
    public TradePrice [] getPrices() {
        return this.Prices;
    }

    /**
     * Set Price of instance specification in array
     * @param Prices Price of instance specification in array
     */
    public void setPrices(TradePrice [] Prices) {
        this.Prices = Prices;
    }

    /**
     * Get Total renewal price of compute node 
     * @return InstanceRealTotalPrice Total renewal price of compute node
     */
    public Long getInstanceRealTotalPrice() {
        return this.InstanceRealTotalPrice;
    }

    /**
     * Set Total renewal price of compute node
     * @param InstanceRealTotalPrice Total renewal price of compute node
     */
    public void setInstanceRealTotalPrice(Long InstanceRealTotalPrice) {
        this.InstanceRealTotalPrice = InstanceRealTotalPrice;
    }

    /**
     * Get Total renewal price of storage node 
     * @return StorageRealTotalPrice Total renewal price of storage node
     */
    public Long getStorageRealTotalPrice() {
        return this.StorageRealTotalPrice;
    }

    /**
     * Set Total renewal price of storage node
     * @param StorageRealTotalPrice Total renewal price of storage node
     */
    public void setStorageRealTotalPrice(Long StorageRealTotalPrice) {
        this.StorageRealTotalPrice = StorageRealTotalPrice;
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

    public InquirePriceRenewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRenewResponse(InquirePriceRenewResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Prices != null) {
            this.Prices = new TradePrice[source.Prices.length];
            for (int i = 0; i < source.Prices.length; i++) {
                this.Prices[i] = new TradePrice(source.Prices[i]);
            }
        }
        if (source.InstanceRealTotalPrice != null) {
            this.InstanceRealTotalPrice = new Long(source.InstanceRealTotalPrice);
        }
        if (source.StorageRealTotalPrice != null) {
            this.StorageRealTotalPrice = new Long(source.StorageRealTotalPrice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArrayObj(map, prefix + "Prices.", this.Prices);
        this.setParamSimple(map, prefix + "InstanceRealTotalPrice", this.InstanceRealTotalPrice);
        this.setParamSimple(map, prefix + "StorageRealTotalPrice", this.StorageRealTotalPrice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

