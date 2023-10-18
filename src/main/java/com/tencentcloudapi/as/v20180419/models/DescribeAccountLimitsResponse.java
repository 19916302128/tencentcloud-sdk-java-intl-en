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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountLimitsResponse extends AbstractModel {

    /**
    * Maximum number of launch configurations allowed for creation by the user account
    */
    @SerializedName("MaxNumberOfLaunchConfigurations")
    @Expose
    private Long MaxNumberOfLaunchConfigurations;

    /**
    * Current number of launch configurations under the user account
    */
    @SerializedName("NumberOfLaunchConfigurations")
    @Expose
    private Long NumberOfLaunchConfigurations;

    /**
    * Maximum number of auto scaling groups allowed for creation by the user account
    */
    @SerializedName("MaxNumberOfAutoScalingGroups")
    @Expose
    private Long MaxNumberOfAutoScalingGroups;

    /**
    * Current number of auto scaling groups under the user account
    */
    @SerializedName("NumberOfAutoScalingGroups")
    @Expose
    private Long NumberOfAutoScalingGroups;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Maximum number of launch configurations allowed for creation by the user account 
     * @return MaxNumberOfLaunchConfigurations Maximum number of launch configurations allowed for creation by the user account
     */
    public Long getMaxNumberOfLaunchConfigurations() {
        return this.MaxNumberOfLaunchConfigurations;
    }

    /**
     * Set Maximum number of launch configurations allowed for creation by the user account
     * @param MaxNumberOfLaunchConfigurations Maximum number of launch configurations allowed for creation by the user account
     */
    public void setMaxNumberOfLaunchConfigurations(Long MaxNumberOfLaunchConfigurations) {
        this.MaxNumberOfLaunchConfigurations = MaxNumberOfLaunchConfigurations;
    }

    /**
     * Get Current number of launch configurations under the user account 
     * @return NumberOfLaunchConfigurations Current number of launch configurations under the user account
     */
    public Long getNumberOfLaunchConfigurations() {
        return this.NumberOfLaunchConfigurations;
    }

    /**
     * Set Current number of launch configurations under the user account
     * @param NumberOfLaunchConfigurations Current number of launch configurations under the user account
     */
    public void setNumberOfLaunchConfigurations(Long NumberOfLaunchConfigurations) {
        this.NumberOfLaunchConfigurations = NumberOfLaunchConfigurations;
    }

    /**
     * Get Maximum number of auto scaling groups allowed for creation by the user account 
     * @return MaxNumberOfAutoScalingGroups Maximum number of auto scaling groups allowed for creation by the user account
     */
    public Long getMaxNumberOfAutoScalingGroups() {
        return this.MaxNumberOfAutoScalingGroups;
    }

    /**
     * Set Maximum number of auto scaling groups allowed for creation by the user account
     * @param MaxNumberOfAutoScalingGroups Maximum number of auto scaling groups allowed for creation by the user account
     */
    public void setMaxNumberOfAutoScalingGroups(Long MaxNumberOfAutoScalingGroups) {
        this.MaxNumberOfAutoScalingGroups = MaxNumberOfAutoScalingGroups;
    }

    /**
     * Get Current number of auto scaling groups under the user account 
     * @return NumberOfAutoScalingGroups Current number of auto scaling groups under the user account
     */
    public Long getNumberOfAutoScalingGroups() {
        return this.NumberOfAutoScalingGroups;
    }

    /**
     * Set Current number of auto scaling groups under the user account
     * @param NumberOfAutoScalingGroups Current number of auto scaling groups under the user account
     */
    public void setNumberOfAutoScalingGroups(Long NumberOfAutoScalingGroups) {
        this.NumberOfAutoScalingGroups = NumberOfAutoScalingGroups;
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

    public DescribeAccountLimitsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountLimitsResponse(DescribeAccountLimitsResponse source) {
        if (source.MaxNumberOfLaunchConfigurations != null) {
            this.MaxNumberOfLaunchConfigurations = new Long(source.MaxNumberOfLaunchConfigurations);
        }
        if (source.NumberOfLaunchConfigurations != null) {
            this.NumberOfLaunchConfigurations = new Long(source.NumberOfLaunchConfigurations);
        }
        if (source.MaxNumberOfAutoScalingGroups != null) {
            this.MaxNumberOfAutoScalingGroups = new Long(source.MaxNumberOfAutoScalingGroups);
        }
        if (source.NumberOfAutoScalingGroups != null) {
            this.NumberOfAutoScalingGroups = new Long(source.NumberOfAutoScalingGroups);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxNumberOfLaunchConfigurations", this.MaxNumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "NumberOfLaunchConfigurations", this.NumberOfLaunchConfigurations);
        this.setParamSimple(map, prefix + "MaxNumberOfAutoScalingGroups", this.MaxNumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "NumberOfAutoScalingGroups", this.NumberOfAutoScalingGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

