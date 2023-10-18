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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatGatewayDirectConnectGatewayRouteResponse extends AbstractModel {

    /**
    * Route data
    */
    @SerializedName("NatDirectConnectGatewayRouteSet")
    @Expose
    private NatDirectConnectGatewayRoute [] NatDirectConnectGatewayRouteSet;

    /**
    * Total number of routes
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Route data 
     * @return NatDirectConnectGatewayRouteSet Route data
     */
    public NatDirectConnectGatewayRoute [] getNatDirectConnectGatewayRouteSet() {
        return this.NatDirectConnectGatewayRouteSet;
    }

    /**
     * Set Route data
     * @param NatDirectConnectGatewayRouteSet Route data
     */
    public void setNatDirectConnectGatewayRouteSet(NatDirectConnectGatewayRoute [] NatDirectConnectGatewayRouteSet) {
        this.NatDirectConnectGatewayRouteSet = NatDirectConnectGatewayRouteSet;
    }

    /**
     * Get Total number of routes 
     * @return Total Total number of routes
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of routes
     * @param Total Total number of routes
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeNatGatewayDirectConnectGatewayRouteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewayDirectConnectGatewayRouteResponse(DescribeNatGatewayDirectConnectGatewayRouteResponse source) {
        if (source.NatDirectConnectGatewayRouteSet != null) {
            this.NatDirectConnectGatewayRouteSet = new NatDirectConnectGatewayRoute[source.NatDirectConnectGatewayRouteSet.length];
            for (int i = 0; i < source.NatDirectConnectGatewayRouteSet.length; i++) {
                this.NatDirectConnectGatewayRouteSet[i] = new NatDirectConnectGatewayRoute(source.NatDirectConnectGatewayRouteSet[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NatDirectConnectGatewayRouteSet.", this.NatDirectConnectGatewayRouteSet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

