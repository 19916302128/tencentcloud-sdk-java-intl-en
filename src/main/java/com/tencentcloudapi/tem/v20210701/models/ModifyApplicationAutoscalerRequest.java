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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationAutoscalerRequest extends AbstractModel {

    /**
    * Application ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Environment ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * Source channel. Please keep the default value.
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * Scaling rule ID
    */
    @SerializedName("AutoscalerId")
    @Expose
    private String AutoscalerId;

    /**
    * Auto scaling policy
    */
    @SerializedName("Autoscaler")
    @Expose
    private Autoscaler Autoscaler;

    /**
     * Get Application ID 
     * @return ApplicationId Application ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
     * @param ApplicationId Application ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Environment ID 
     * @return EnvironmentId Environment ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set Environment ID
     * @param EnvironmentId Environment ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get Source channel. Please keep the default value. 
     * @return SourceChannel Source channel. Please keep the default value.
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set Source channel. Please keep the default value.
     * @param SourceChannel Source channel. Please keep the default value.
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get Scaling rule ID 
     * @return AutoscalerId Scaling rule ID
     */
    public String getAutoscalerId() {
        return this.AutoscalerId;
    }

    /**
     * Set Scaling rule ID
     * @param AutoscalerId Scaling rule ID
     */
    public void setAutoscalerId(String AutoscalerId) {
        this.AutoscalerId = AutoscalerId;
    }

    /**
     * Get Auto scaling policy 
     * @return Autoscaler Auto scaling policy
     */
    public Autoscaler getAutoscaler() {
        return this.Autoscaler;
    }

    /**
     * Set Auto scaling policy
     * @param Autoscaler Auto scaling policy
     */
    public void setAutoscaler(Autoscaler Autoscaler) {
        this.Autoscaler = Autoscaler;
    }

    public ModifyApplicationAutoscalerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationAutoscalerRequest(ModifyApplicationAutoscalerRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.AutoscalerId != null) {
            this.AutoscalerId = new String(source.AutoscalerId);
        }
        if (source.Autoscaler != null) {
            this.Autoscaler = new Autoscaler(source.Autoscaler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "AutoscalerId", this.AutoscalerId);
        this.setParamObj(map, prefix + "Autoscaler.", this.Autoscaler);

    }
}

