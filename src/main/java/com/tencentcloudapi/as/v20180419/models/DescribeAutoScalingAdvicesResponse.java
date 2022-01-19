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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScalingAdvicesResponse extends AbstractModel{

    /**
    * A collection of suggestions for scaling group configurations.
    */
    @SerializedName("AutoScalingAdviceSet")
    @Expose
    private AutoScalingAdvice [] AutoScalingAdviceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get A collection of suggestions for scaling group configurations. 
     * @return AutoScalingAdviceSet A collection of suggestions for scaling group configurations.
     */
    public AutoScalingAdvice [] getAutoScalingAdviceSet() {
        return this.AutoScalingAdviceSet;
    }

    /**
     * Set A collection of suggestions for scaling group configurations.
     * @param AutoScalingAdviceSet A collection of suggestions for scaling group configurations.
     */
    public void setAutoScalingAdviceSet(AutoScalingAdvice [] AutoScalingAdviceSet) {
        this.AutoScalingAdviceSet = AutoScalingAdviceSet;
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

    public DescribeAutoScalingAdvicesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScalingAdvicesResponse(DescribeAutoScalingAdvicesResponse source) {
        if (source.AutoScalingAdviceSet != null) {
            this.AutoScalingAdviceSet = new AutoScalingAdvice[source.AutoScalingAdviceSet.length];
            for (int i = 0; i < source.AutoScalingAdviceSet.length; i++) {
                this.AutoScalingAdviceSet[i] = new AutoScalingAdvice(source.AutoScalingAdviceSet[i]);
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
        this.setParamArrayObj(map, prefix + "AutoScalingAdviceSet.", this.AutoScalingAdviceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

