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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableGrafanaInternetRequest extends AbstractModel {

    /**
    * TCMG instance ID, such as “grafana-kleu3gt0”.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Whether to enable public network access (`true`: Yes; `false`: No)
    */
    @SerializedName("EnableInternet")
    @Expose
    private Boolean EnableInternet;

    /**
     * Get TCMG instance ID, such as “grafana-kleu3gt0”. 
     * @return InstanceID TCMG instance ID, such as “grafana-kleu3gt0”.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set TCMG instance ID, such as “grafana-kleu3gt0”.
     * @param InstanceID TCMG instance ID, such as “grafana-kleu3gt0”.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Whether to enable public network access (`true`: Yes; `false`: No) 
     * @return EnableInternet Whether to enable public network access (`true`: Yes; `false`: No)
     */
    public Boolean getEnableInternet() {
        return this.EnableInternet;
    }

    /**
     * Set Whether to enable public network access (`true`: Yes; `false`: No)
     * @param EnableInternet Whether to enable public network access (`true`: Yes; `false`: No)
     */
    public void setEnableInternet(Boolean EnableInternet) {
        this.EnableInternet = EnableInternet;
    }

    public EnableGrafanaInternetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableGrafanaInternetRequest(EnableGrafanaInternetRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.EnableInternet != null) {
            this.EnableInternet = new Boolean(source.EnableInternet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "EnableInternet", this.EnableInternet);

    }
}

