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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpnGatewaysResponse extends AbstractModel{

    /**
    * 符合条件的实例数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * VPN网关实例详细信息列表。
    */
    @SerializedName("VpnGatewaySet")
    @Expose
    private VpnGateway [] VpnGatewaySet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的实例数量。 
     * @return TotalCount 符合条件的实例数量。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的实例数量。
     * @param TotalCount 符合条件的实例数量。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get VPN网关实例详细信息列表。 
     * @return VpnGatewaySet VPN网关实例详细信息列表。
     */
    public VpnGateway [] getVpnGatewaySet() {
        return this.VpnGatewaySet;
    }

    /**
     * Set VPN网关实例详细信息列表。
     * @param VpnGatewaySet VPN网关实例详细信息列表。
     */
    public void setVpnGatewaySet(VpnGateway [] VpnGatewaySet) {
        this.VpnGatewaySet = VpnGatewaySet;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VpnGatewaySet.", this.VpnGatewaySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

