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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class COSSettings extends AbstractModel {

    /**
    * COS `SecretId`
    */
    @SerializedName("CosSecretId")
    @Expose
    private String CosSecretId;

    /**
    * COS `SecrectKey`
    */
    @SerializedName("CosSecretKey")
    @Expose
    private String CosSecretKey;

    /**
    * COS path to log
    */
    @SerializedName("LogOnCosPath")
    @Expose
    private String LogOnCosPath;

    /**
     * Get COS `SecretId` 
     * @return CosSecretId COS `SecretId`
     */
    public String getCosSecretId() {
        return this.CosSecretId;
    }

    /**
     * Set COS `SecretId`
     * @param CosSecretId COS `SecretId`
     */
    public void setCosSecretId(String CosSecretId) {
        this.CosSecretId = CosSecretId;
    }

    /**
     * Get COS `SecrectKey` 
     * @return CosSecretKey COS `SecrectKey`
     */
    public String getCosSecretKey() {
        return this.CosSecretKey;
    }

    /**
     * Set COS `SecrectKey`
     * @param CosSecretKey COS `SecrectKey`
     */
    public void setCosSecretKey(String CosSecretKey) {
        this.CosSecretKey = CosSecretKey;
    }

    /**
     * Get COS path to log 
     * @return LogOnCosPath COS path to log
     */
    public String getLogOnCosPath() {
        return this.LogOnCosPath;
    }

    /**
     * Set COS path to log
     * @param LogOnCosPath COS path to log
     */
    public void setLogOnCosPath(String LogOnCosPath) {
        this.LogOnCosPath = LogOnCosPath;
    }

    public COSSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public COSSettings(COSSettings source) {
        if (source.CosSecretId != null) {
            this.CosSecretId = new String(source.CosSecretId);
        }
        if (source.CosSecretKey != null) {
            this.CosSecretKey = new String(source.CosSecretKey);
        }
        if (source.LogOnCosPath != null) {
            this.LogOnCosPath = new String(source.LogOnCosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosSecretId", this.CosSecretId);
        this.setParamSimple(map, prefix + "CosSecretKey", this.CosSecretKey);
        this.setParamSimple(map, prefix + "LogOnCosPath", this.LogOnCosPath);

    }
}

