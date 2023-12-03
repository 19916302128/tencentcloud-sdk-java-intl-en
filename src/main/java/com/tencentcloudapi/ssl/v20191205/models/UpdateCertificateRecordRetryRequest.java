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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateCertificateRecordRetryRequest extends AbstractModel {

    /**
    * To-be-redeployed record ID
    */
    @SerializedName("DeployRecordId")
    @Expose
    private Long DeployRecordId;

    /**
    * To-be-redeployed record detail ID
    */
    @SerializedName("DeployRecordDetailId")
    @Expose
    private Long DeployRecordDetailId;

    /**
     * Get To-be-redeployed record ID 
     * @return DeployRecordId To-be-redeployed record ID
     */
    public Long getDeployRecordId() {
        return this.DeployRecordId;
    }

    /**
     * Set To-be-redeployed record ID
     * @param DeployRecordId To-be-redeployed record ID
     */
    public void setDeployRecordId(Long DeployRecordId) {
        this.DeployRecordId = DeployRecordId;
    }

    /**
     * Get To-be-redeployed record detail ID 
     * @return DeployRecordDetailId To-be-redeployed record detail ID
     */
    public Long getDeployRecordDetailId() {
        return this.DeployRecordDetailId;
    }

    /**
     * Set To-be-redeployed record detail ID
     * @param DeployRecordDetailId To-be-redeployed record detail ID
     */
    public void setDeployRecordDetailId(Long DeployRecordDetailId) {
        this.DeployRecordDetailId = DeployRecordDetailId;
    }

    public UpdateCertificateRecordRetryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateCertificateRecordRetryRequest(UpdateCertificateRecordRetryRequest source) {
        if (source.DeployRecordId != null) {
            this.DeployRecordId = new Long(source.DeployRecordId);
        }
        if (source.DeployRecordDetailId != null) {
            this.DeployRecordDetailId = new Long(source.DeployRecordDetailId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeployRecordId", this.DeployRecordId);
        this.setParamSimple(map, prefix + "DeployRecordDetailId", this.DeployRecordDetailId);

    }
}

